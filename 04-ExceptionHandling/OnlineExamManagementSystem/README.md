# 📘 Online Exam Management System

## 📌 Project Overview

The **Online Exam Management System** is a console-based Core Java project developed to demonstrate the concepts of **Exception Handling** using a real-world application.

The system allows a student to start an exam, submit the exam, and view the result while enforcing business rules through **custom exceptions**.

This project is a part of my **Core Java Learning Roadmap** and focuses on understanding how exception handling is used in real applications.

---

# 🚀 Features

- Start an Online Exam
- Submit Exam with Score
- View Exam Result
- Menu-Driven Application
- Custom Exception Handling
- Input Validation
- Business Rule Validation
- Object State Management

---

# 📚 Concepts Covered

This project covers the following Core Java concepts:

- Classes and Objects
- Constructors
- Encapsulation
- Custom Exceptions
- Exception Handling
- try-catch
- throw
- throws
- do-while Loop
- switch-case
- Object State Management

---

# 📂 Project Structure

```
OnlineExamManagementSystem/
│
├── Student.java
├── OnlineExamManagementSystem.java
├── ExamAlreadyStartedException.java
├── ExamAlreadySubmittedException.java
├── ExamNotStartedException.java
├── ResultNotAvailableException.java
├── InvalidScoreException.java
└── README.md
```

---

# ⚙️ Custom Exceptions Used

## ExamAlreadyStartedException
Thrown when the user tries to start the exam more than once.

## ExamNotStartedException
Thrown when the user attempts to submit the exam before starting it.

## ExamAlreadySubmittedException
Thrown when the user tries to submit the exam multiple times.

## ResultNotAvailableException
Thrown when the user attempts to view the result before submitting the exam.

## InvalidScoreException
Thrown when the entered score is outside the valid range (0–100).

---

# 🖥️ Menu

```
===== ONLINE EXAM MANAGEMENT SYSTEM =====

1. Start Exam
2. Submit Exam
3. View Score
4. Exit
```

---

# 🔄 Program Workflow

```
Enter Student Name
        │
        ▼
Create Student Object
        │
        ▼
Display Menu
        │
        ▼
Select Operation
        │
        ▼
Execute Requested Action
        │
        ▼
Handle Exceptions
        │
        ▼
Return to Menu Until Exit
```

---

# ✅ Business Rules

- Exam can be started only once.
- Exam cannot be submitted before starting.
- Exam can be submitted only once.
- Score must be between **0 and 100**.
- Result can only be viewed after successful submission.

---

# 📖 Sample Output

```
===== ONLINE EXAM MANAGEMENT SYSTEM =====

Enter Student Name : Akhila

1. Start Exam
2. Submit Exam
3. View Score
4. Exit

Enter Choice : 1

Exam Started Successfully

Enter Choice : 2

Enter Score : 95

Exam Submitted Successfully

Enter Choice : 3

Name : Akhila
Score : 95

Enter Choice : 4

Thank you for using Online Exam Management System.
```

---

# 🎯 Learning Outcomes

After completing this project, I learned:

- Creating custom exceptions
- Difference between checked and unchecked exceptions
- Using throw and throws
- Handling multiple exceptions
- Designing business-rule validations
- Managing object state using boolean variables
- Developing menu-driven console applications
- Writing clean and modular Java code

---

# 🛠️ Technologies Used

- Java
- VS Code
- Git
- GitHub

---

# 👨‍💻 Author

**Kuchaboini Akhila**

Master of Computer Applications (MCA)

Learning Core Java through project-based development.