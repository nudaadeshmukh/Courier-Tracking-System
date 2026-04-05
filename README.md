# 📦 Courier Tracking System

A Spring Boot-based backend application that simulates a real-world **courier tracking system**, allowing users to create parcels, update delivery status, and track shipment history in real-time.

---

## 🚀 Project Overview

This project is designed to manage parcel deliveries efficiently by assigning each parcel a **unique tracking ID**. Users can track the shipment status across multiple stages such as:

- 📤 Dispatched  
- 🚚 In Transit  
- 📦 Out for Delivery  
- ✅ Delivered  

Each update is recorded with **timestamp and location**, providing complete visibility of the parcel journey.

---

## 🎯 Key Features

- Create parcel with auto-generated tracking ID  
- Update parcel status with location & timestamp  
- Track full delivery history of a parcel  
- RESTful API design  
- Layered architecture (Controller, Service, Repository)  
- Database integration using H2  
- Exception handling for invalid tracking IDs  

---

## 🏗️ Tech Stack

- **Backend:** Spring Boot  
- **Database:** H2 (In-Memory)  
- **ORM:** Spring Data JPA  
- **Build Tool:** Maven  
- **Language:** Java 17  

---

## 📁 Project Structure

```
src/main/java/com/example/courier/
│
├── controller/        # REST APIs
├── service/           # Business logic
├── repository/        # Database layer
├── model/             # Entity classes
├── exception/         # Global exception handling
└── CourierApplication.java
```

---

## 🔌 API Endpoints

### 📌 Create Parcel
```
POST /courier/create
```

**Request Body:**
```json
{
  "sender": "Alice",
  "receiver": "Bob"
}
```

---

### 📌 Update Parcel Status
```
POST /courier/update
```

**Query Params:**
```
trackingId=XYZ
status=In Transit
location=Mumbai
```

---

### 📌 Track Parcel
```
GET /courier/track/{trackingId}
```

---

## 🧪 How to Run

1. Clone the repository:
```bash
git clone https://github.com/your-username/courier-tracking-system.git
```

2. Open in IntelliJ / Eclipse  

3. Run:
```
CourierApplication.java
```

4. Use Postman to test APIs  

---

## 🗄️ H2 Database Console

Access the in-memory database:

```
http://localhost:8080/h2-console
```

### Login Details:
- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: *(leave empty)*

---

## 📊 Example SQL Queries

```sql
SELECT * FROM PARCEL;
SELECT * FROM TRACKING_HISTORY;
```
