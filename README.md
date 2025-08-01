# 🌍 IP Tracker Tool (Java)

A simple beginner-level Java project to track the **location**, **ISP**, **timezone**, and other information of any public IP address using a free public API. This is a basic Open Source Intelligence (OSINT) project ideal for cybersecurity learners.

---

## 🚀 Features

- 🌐 Fetches geographic location of any IP
- 🛰️ Shows ISP, city, region, timezone, coordinates
- 📡 Uses the free [ip-api.com](http://ip-api.com) service
- 💡 Beginner-friendly: Simple code using `HttpURLConnection` and `org.json`
- 📦 No authentication or API key needed

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- `org.json` (for JSON parsing)
- Standard Java libraries (`HttpURLConnection`, `Scanner`)

---

## 📸 Sample Output

```bash
Enter IP Address: 8.8.8.8

=== IP Tracker Result ===
IP: 8.8.8.8
Country: United States
Region: California
City: Mountain View
ZIP: 94035
Latitude: 37.386
Longitude: -122.0838
ISP: Google LLC
Timezone: America/Los_Angeles
```

---

## 📁 Project Structure

```
IPTracker/
│
├── IPTracker.java         # Main Java source file
└── README.md              # Project documentation
```

---

## 📦 Setup Instructions

1. Download or clone this repository.
2. Make sure you have Java installed (`java -version`).
3. Add `org.json` library to your project:
   - [Download from Maven](https://mvnrepository.com/artifact/org.json/json)
4. Compile and run:
   ```bash
   javac -cp .;json-20250517.jar IPTracker.java
   java -cp .;json-20250517.jar IPTracker
   ```

---
# project_16-20
