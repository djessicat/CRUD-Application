# CRUD-Application

Simple CRUD-Application built for practice purposes to reinforce Spring Boot basic concepts, Hibernate & Spring-AI.

---

## 🚀 Features

- Full CRUD support for SoftwareEngineer entity
- AI Integration using OpenAI (via `spring-ai`)

---

## Tech Stack

| Layer      | Technology                     |
| ---------- | ------------------------------ |
| Backend    | Spring Boot, Spring Web        |
| ORM        | Spring Data JPA (Hibernate)    |
| Database   | PostgreSQL                     |
| API Docs   | Springdoc OpenAPI + Swagger UI |
| AI Service | spring-ai + OpenAI API         |
| Tools      | Maven, Lombok                  |

---

## 📦 Getting Started

### Prerequisites

- Java 21
- Maven
- PostgreSQL (or use Docker)
- OpenAI API key

### Setup

```bash
git clone https://github.com/djessicat/CRUD-Application.git
cd CRUD-Application

# Set your OpenAI key in src/main/resources/application.properties
OPENAI_API_KEY=your_key_here

# Run the app
mvn spring-boot:run
```

---

## 📂 Project Structure

```text
src/main/java/com/example/demo
├── controller/          # REST Controllers
├── service/             # Business Logic (AiService lives here)
├── dto/                 # Data Transfer Objects
├── model/               # Entity classes
├── repository/          # JPA Repositories
└── config/              # Configuration (OpenAI setup etc.)
```

---

## 🌐 API Docs

You can access Swagger UI here once the app is running:  
🔗 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---

---

## 🐳 Docker (optional)

You can containerize this app with PostgreSQL using `docker-compose.yml`.  
To run:

```bash
docker-compose up --build
```

---

## 👩‍💻 Author

[🔗 GitHub: djessicat](https://github.com/djessicat)

---

## 📝 License

MIT License. Use freely with attribution.
