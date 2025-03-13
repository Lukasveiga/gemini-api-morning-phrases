output "lambda_cron_arn" {
  value = aws_lambda_function.cron_lambda.arn
}

output "lambda_cron_name" {
  value = aws_lambda_function.cron_lambda.function_name
}
