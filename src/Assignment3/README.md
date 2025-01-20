# Assignment3 School Management System

A simple Java project for managing a school system. The project includes classes for handling students, teachers, classrooms, courses, and the school itself. It's a demonstration of object-oriented programming (OOP) principles like inheritance, encapsulation, and composition.

---

## Features
- **Manage Students**: Add or remove students, calculate average grades, and determine if a student has passed.
- **Manage Teachers**: Add teachers with their specializations, experience, and salaries.
- **Course Management**: Assign courses to teachers and students, view course details.
- **Classroom Management**: Organize students and teachers into classrooms.
- **School Overview**: Register students, hire teachers, add courses, and display all school information.

---

## Project Structure

### Classes
1. **`Person`**:  
Base class for shared properties of `Student` and `Teacher`.


2. **`Student`**:  
Represents a student with properties like `grade`, `grades` (list), and `contactInfo`. 
Includes methods for:
- Calculating the average grade.
- Checking if the student has passed.

3. **`Teacher`**:  
Represents a teacher with specializations, experience, and salary. 
Includes:
- Management of subject specializations.

4. **`Course`**:  
Represents a course with a name, teacher, and list of enrolled students.  


5. **`Classroom`**:  
Organizes students and a teacher under a unique classroom ID.


6. **`School`**:  
Central class to:
- Register students.
- Hire teachers.
- Manage courses.
- Display overall school details.

7. **`main`**:  
Entry point to demonstrate the functionality of the system.

---

## How to Run

1. Clone this repository:
```bash
git clone https://github.com/NurdauletSovetkhan/Asix.git
```

2. Navigate to the project directory and compile:
```bash
cd Assignment3
javac Assignment3/*.java

```
3. Run the program:
```bash
java Assignment3.main
```
---
## Future Improvements
- Add a database for persistent storage.
- Introduce a graphical user interface (GUI).
- Add validation for input and remove potential null pointer issues.
---

## Contributing
Feel free to fork this project and submit pull requests! 😄

---
## License
This project is free to use and distribute. No license required. 🎉
