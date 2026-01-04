# DemoBlaze Cucumber BDD Automation Framework

 **Cucumber BDD automation framework** built with **Selenium, Java, and TestNG**, following **Page Object Model (POM)** and automation best practices.



---

## 🚀 Tech Stack

- Java  
- Selenium WebDriver  
- Cucumber (BDD)  
- TestNG  
- Maven  
- Page Object Model (POM)

---

## 📁 Project Structure

```
src/test/java
 ├─ pages
 │   └─ HomePage.java          # Page Object (UI interactions only)
 ├─ runners
 │   └─ TestRunner.java        # TestNG Cucumber runner
 ├─ steps
 │   └─ MaxMinSteps.java       # Step definitions (BDD glue)
 └─ utils
     ├─ PriceResult.java       # Result model
     └─ PriceUtils.java        # Business logic (max/min calculation)

src/test/resources
 └─ features
     └─ MaxMin.feature         # Gherkin feature file
```

---

## 🧠 Design Principles

- **Behavior Driven Development (BDD)**  
  Business behavior is described using Gherkin feature files.

- **Page Object Model (POM)**  
  UI locators and interactions are isolated from test logic.

- **Single Responsibility Principle**
  - Pages handle UI only  
  - Steps orchestrate behavior  
  - Utils contain business logic  

- **Clean Step Definitions**  
  No calculations or heavy logic inside step definitions.

---

## 🧪 Test Scenario

**Feature:** Maximum and Minimum prices of the product page

**Scenario:**
1. Open Demoblaze website  
2. Capture all product prices  
3. Identify 1st, 2nd, and 3rd maximum prices  
4. Identify 1st, 2nd, and 3rd minimum prices  

---

## ▶️ How to Run

### Using Maven
```bash
mvn test
```

### Using IDE (Eclipse / IntelliJ)
- Right-click `TestRunner.java`
- Run as **TestNG Test**

---

## 📊 Reports

After execution, a Cucumber HTML report is generated:

```
target/cucumber-report.html
```

Open this file in a browser to view test results.

---

## ⚠️ Notes

- Hooks are intentionally **not used**
- Browser cleanup is handled safely in the final step
- Classic `for` loops are used (no enhanced for-loops)
- Business logic is isolated for easy unit testing

---

## 📌 Why This Project

This repository demonstrates **real-world automation standards** and is suitable for:
- Learning Selenium + Cucumber correctly
- Interview discussions
- Portfolio projects
- Code reviews

**Interview-ready takeaway:**
> Step definitions should orchestrate behavior, not contain business logic.

---

## 🔮 Future Enhancements

- Add assertions instead of console output
- Handle duplicate prices safely
- Introduce DriverFactory
- Add Extent or Allure reporting
- Enable parallel execution

---

## 👤 Author

**Shofi Ullah**  
QA Automation Engineer  
Focused on clean automation architecture and maintainable test frameworks.
