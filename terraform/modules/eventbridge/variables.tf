variable "lambda_cron_arn" {
  description = "ARN of the Lambda function"
  type        = string
}

variable "lambda_cron_name" {
  description = "Name of the Lambda function"
  type        = string
}

variable "schedule" {
  type    = string
  default = "cron(0 8 * * ? *)"
}
