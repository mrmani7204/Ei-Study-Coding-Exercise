Classes and Files Overview

com.edtech.Main
The entry point of the application. It initializes services and starts the menu interface.

com.edtech.Menu

Handles user interaction and command processing. Displays the menu and routes commands to the appropriate services.
com.edtech.model

Assignment.java: Represents an assignment with class name and details.

Classroom.java: Represents a classroom that holds students and assignments.

Student.java: Represents a student with a unique ID and class association.

com.edtech.service

AssignmentService.java: Manages assignment scheduling, submissions, and displays submission statuses.

ClassroomService.java: Manages the creation, removal, and querying of classrooms and students.

StudentService.java: Manages student enrollment into classrooms.

com.edtech.command

AddClassroomCommand.java: Adds a new classroom.

AddStudentCommand.java: Enrolls a student in a classroom.

ScheduleAssignmentCommand.java: Schedules a new assignment for a classroom.

SubmitAssignmentCommand.java: Submits an assignment for a student.

com.edtech.utils.LoggerUtil

A utility class for logging messages to the console using Java's Logger.

Features:
Add and remove classrooms.

Enroll students into classrooms.

Schedule and submit assignments.

View all classrooms and the students enrolled in each classroom.

View assignment details and submission statuses.
