<div align="center">
    <img src="https://cdn.iconscout.com/icon/free/png-256/free-sun-icon-download-in-svg-png-gif-file-formats--weather-daylight-icons-pack-445578.png" width=/>
    <h2>Morning Phrase Generator API</h2>
</div>

<p align="center">
     <a alt="Java">
        <img src="https://img.shields.io/badge/Java-v21-blue.svg" />
    </a>
<a alt="Spring">
        <img src="https://img.shields.io/badge/Spring Boot-v3.3.1-green.svg" />
    </a>
    <a alt="OpenFeign">
        <img src="https://img.shields.io/badge/OpenFeign-v4.1.3-purple.svg" />
    </a>
</p>

This API provides a simple way to generate personalized morning phrases based on user preferences.

## 📌 Features

- Generate a customized morning phrase using a person's name and preferences.
- RESTful API built with Spring Boot.
- Integration with Gemini API.
- Lightweight and easy to use.

## 📡 API Endpoints
### 📝 Generate a Morning Phrase
➤ Request

- Method: POST
- URL: /morning-phrase/generate
- Content-Type: application/json
- Body:

```json
{
"target": "John",
"preferences": ["coffee", "reading", "morning walks"]
}
```


✅ Response

- 200 OK
```json
"Bom dia, John! Que seu café esteja forte, sua leitura inspiradora e sua caminhada matinal revigorante. Um dia lindo e cheio de conquistas para você! 😊"
```

- 400 Bad Request – Invalid input
- 500 Internal Server Error – Server-side issue

## 🛠️ Tech Stack

- Java 21
- Spring Boot 3
- Open Feign
- Maven
- REST API
- Gemini API