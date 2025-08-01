# 🌍 IP Tracker Tool (Java)

The **IP Tracker Tool** is a beginner-friendly Java project that demonstrates how to perform basic Open Source Intelligence (OSINT) operations using public APIs. This simple command-line application accepts any public IP address as input and displays detailed information such as location, ISP, timezone, city, and geographic coordinates using the free [ip-api.com](http://ip-api.com) service.

This project is ideal for students, beginners in cybersecurity, or anyone learning how to work with APIs and JSON data in Java.

---

## 📌 Features

- 🔍 Fetches detailed IP address metadata:
  - Country, region, city
  - ZIP code, latitude, longitude
  - ISP and timezone
- 🌐 Uses public API from [ip-api.com](http://ip-api.com) (no API key required)
- 📦 Parses JSON responses using `org.json` library
- 💻 Command-line interface (easy to run and understand)
- 🧰 Demonstrates basic OSINT and Java networking

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

## 🛠️ Technologies Used

| Technology     | Purpose                        |
|----------------|--------------------------------|
| Java           | Core language                  |
| HttpURLConnection | To make API calls         |
| `org.json`     | To parse JSON API responses    |
| Terminal/CLI   | Interface to input and output  |

---

## 📂 Project Structure

```
IPTracker/
├── IPTracker.java          # Main Java source file
├── json-20240303.jar       # JSON library (dependency)
└── README.md               # Project documentation
```

---

## 📥 How to Run

### ✅ 1. Prerequisites

- Java JDK 8 or higher installed
- `json-20240303.jar` file in the same folder (Download from [Maven Repo](https://mvnrepository.com/artifact/org.json/json))

### ✅ 2. Compile the Code

Open terminal in the project folder and run:

#### On **Mac/Linux**:
```bash
javac -cp ".:json-20240303.jar" IPTracker.java
```

#### On **Windows**:
```bash
javac -cp ".;json-20240303.jar" IPTracker.java
```

### ✅ 3. Run the Program

#### On **Mac/Linux**:
```bash
java -cp ".:json-20250517.jar" IPTracker
```

#### On **Windows**:
```bash
java -cp ".;json-20250517.jar" IPTracker
```

---

## 📌 API Information

- **Base URL:** `http://ip-api.com/json/{IP}`
- **Method:** GET
- **Rate Limit:** 45 requests/min from same IP
- **No API key or account required**

For more info: [ip-api.com/docs](http://ip-api.com/docs)

---

## 🧠 What You Learn

- Making HTTP requests in Java
- Using third-party libraries (like `org.json`)
- Parsing JSON data
- Basics of OSINT and IP analysis
- Working with APIs in a real-world context

---

## 📖 License

This project is for **educational and personal use only**. Do not use it for unethical activities. Follow your local laws and API terms.

---

## 🙋‍♂️ Author

**Divyanshu Raj**  
Cybersecurity Intern | Java Developer | Tech Enthusiast

[LinkedIn](https://www.linkedin.com/) | [GitHub](https://github.com/) *(replace with your links)*

---

## 💬 Feedback & Contribution

Suggestions and contributions are welcome! Feel free to fork the project or raise issues to improve it.

---
