resource "aws_lambda_function" "cron_lambda" {
  function_name    = "java-spring-lambda"
  runtime          = "java21"
  handler          = "com.example.LambdaHandler"
  memory_size      = 512
  timeout          = 30
  role             = aws_iam_role.lambda_role.arn
  filename         = "${path.module}/application.jar"
  source_code_hash = filebase64sha256("${path.module}/application.jar")

  environment {
    variables = {
      SPRING_PROFILES_ACTIVE = var.app_env
      DATABASE_URL           = var.database_url
      GEMINI_API_KEY         = var.gemini_api_key
      WHATSAPP_URL           = var.whatsapp_url
      WHATSAPP_API_KEY       = var.whatsapp_api_key
    }
  }
}
