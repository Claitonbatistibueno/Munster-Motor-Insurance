# Munster Motor Insurance System 🚗🛡️

## About The Project
This project is a robust, console-based Object-Oriented Java application developed for **Munster Motor Insurance**. It serves as a comprehensive system to manage customer portfolios, vehicle registrations, incident reporting, and an automated dynamic insurance quotation calculator. 

Developed as part of the Software Architecture curriculum, this system applies strict Object-Oriented Programming (OOP) principles, data persistence, and input validation to simulate a real-world enterprise environment.

## Key Features
* **Customer Management:** Register and view customer profiles with auto-generated unique IDs.
* **Vehicle Directory:** Catalog vehicle details (Make, Model, Year, Color) linked to secure system IDs.
* **Dynamic Quotation Engine:** A complex algorithm that calculates insurance premiums based on multiple risk factors, including:
  * Gender and Age base modifiers (including >= 80 years old decline policies).
  * County location risk adjustments.
  * Exact Vehicle Make & Model surcharges.
  * Emission levels and Insurance Category (Comprehensive vs. Third Party).
* **Data Persistence:** Automatically saves generated customer profiles, vehicles, and final quotations to `.txt` files for auditing and record-keeping.
* **In-Memory Storage:** Utilizes Java `ArrayList` collections to manage active session data and create relationships between Customer and Vehicle objects during the quotation process.
* **Incident Reports:** Static retrieval of formatted historical incident reports.

## Architecture & Technologies
* **Language:** Java (JDK 17+)
* **Paradigm:** Object-Oriented Programming (OOP) - Encapsulation, Separation of Concerns.
* **Data Handling:** `java.io.FileWriter`, `java.io.File`, `java.util.ArrayList`, `java.util.Scanner`.
* **Error Handling:** Try-Catch blocks for `NumberFormatException` and `IOException` to prevent system crashes during invalid user inputs or file writing failures.

## How to Run
1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Compile and run the `Main.java` file.
4. Follow the interactive console prompts to navigate through the system menus.
   *(Note: To generate a quotation, you must first register at least one Customer and one Vehicle in the current session).*

---
*Developed by CLAITON AND OISIN
