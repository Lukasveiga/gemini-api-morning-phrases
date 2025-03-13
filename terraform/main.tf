module "iam" {
  source = "./modules/iam"
}

module "lambda_cron" {
  source           = "./modules/lambda_cron"
  lambda_role      = module.iam.lambda_role_arn
  database_url     = var.database_url
  whatsapp_url     = var.whatsapp_url
  whatsapp_api_key = var.whatsapp_api_key
  gemini_api_key   = var.gemini_api_key
}

module "eventbridge" {
  source           = "./modules/eventbridge"
  lambda_cron_arn  = module.lambda_cron.lambda_cron_arn
  lambda_cron_name = module.lambda_cron.lambda_cron_name
}
