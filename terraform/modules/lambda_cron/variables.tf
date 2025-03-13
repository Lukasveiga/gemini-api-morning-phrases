variable "lambda_role" {
  description = "IAM role ARN for Lambda execution"
  type        = string
}

variable "app_env" {
  description = "Application profile active"
  default     = "dev"
  type        = string
}

variable "database_url" {
  type = string
}

variable "whatsapp_api_key" {
  type = string
}

variable "whatsapp_url" {
  type = string
}

variable "gemini_api_key" {
  type = string
}
