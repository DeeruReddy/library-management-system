
# 📚 Library Management System

A simple and efficient Library Management System built using Java. It provides core functionalities to manage books, members, and transactions through a console-based interface.

## 🚀 Features

- Add new books to the library
- Register new members
- View available books and member details
- Borrow and return books
- Track and display transaction history
- Prevent double issuing of the same book
- Basic validation and user prompts

## ⚙️ How It Works

The system runs entirely in the terminal using standard input/output. Here's a basic outline of how it operates:

1. **Menu-Driven Interface**:  
   When the program starts, it displays a menu allowing users to perform different actions such as adding books, registering members, borrowing/returning books, and viewing records.

2. **Book Management**:  
   Users can add new books by providing basic details such as title, author, and ID. All books are stored in a collection that can be viewed or updated.

3. **Member Management**:  
   New members can be registered with unique IDs and tracked through their borrowing history.

4. **Transactions**:  
   When a book is borrowed or returned, the system updates the internal records to reflect the transaction and checks for availability.

5. **Validation**:  
   Basic checks are performed to avoid duplicate entries or invalid operations (e.g., borrowing a book that’s already issued).

## 🧑‍💻 How to Run

1. Ensure Java (version 8 or higher) is installed.
2. Compile the source file:

   ```bash
   javac LibraryManagementSystem.java
   ````

3. Run the program:

   ```bash
   java LibraryManagementSystem
   ```

## 📝 Future Enhancements

* Add a graphical user interface (GUI) using JavaFX or Swing
* Connect with a database for persistent storage
* Implement fine calculation and due dates
* Add role-based login system (e.g., Admin, Member)

## 📄 License

This project is open-source and available under the MIT License.


