# Patient Discharge Event-Driven Service

## Overview

This project is a simple Spring Boot application demonstrating how to implement an **event-driven architecture** using Spring's built-in `ApplicationEventPublisher`. It simulates a **hospital patient discharge process**, where a discharge request triggers an event that can be handled asynchronously by listeners within the application.

The example shows how to decouple business logic by publishing and handling domain events without using external messaging systems like Kafka, making it lightweight and suitable for smaller or less complex use cases.

---

## Features

- REST API to initiate patient discharge requests.
- Uses Spring's `ApplicationEventPublisher` to publish a `PatientDischargedEvent`.
- Listeners handle the event asynchronously to perform post-discharge tasks (e.g., notifying other departments, updating records).
- Demonstrates the use of Spring’s `@Async` annotation and `@EnableAsync` to process events asynchronously.
- Simple, maintainable, and extensible event-driven design.

---

## API Example

**Request:**

```http
POST /discharge
Content-Type: application/json

{
  "patientId": "12345",
  "name": "John Doe",
  "reason": "Recovery complete"
}
```


In this project, I have used Spring's **ApplicationEventPublisher** to showcase the importance of event-driven architecture in a simple and lightweight way. This approach allows different parts of the application to communicate asynchronously and decouples components, improving maintainability and scalability within a single application.

While this example uses in-memory event publishing, similar event-driven patterns can be implemented across distributed microservices using **Apache Kafka**.

---
