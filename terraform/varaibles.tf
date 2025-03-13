variable "aws_region" {
  type    = string
  default = "us-east-2"
}

variable "aws_profile" {
  type    = string
  default = "dev"
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
