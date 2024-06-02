package HomeWorks.HW2;

import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {
            // Create Student objects
            Student student1 = new Student("Khalid", 77);
            Student student2 = new Student("Sara", 7);
            Student student3 = new Student("Saud", 17);

            // Create StudentManager
            StudentManager studentManager = new StudentManager();

            // Add students to StudentManager
            studentManager.addStudent(student1);
            studentManager.addStudent(student2);
            studentManager.addStudent(student3);

            // Retrieve and display a student by their ID
            int studentIdToRetrieve = 2;
            Student retrievedStudent = studentManager.getStudentById(studentIdToRetrieve);
            if (retrievedStudent != null) {
                System.out.println("Student with ID " + studentIdToRetrieve + ": " + retrievedStudent.getName());
            } else {
                System.out.println("Student with ID " + studentIdToRetrieve + " not found.");
            }

            // Display all students in the list
            System.out.println("All students:");
            ArrayList<Student> allStudents = studentManager.getAllStudents();
            for (Student student : allStudents) {
                System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
            }

            // Remove a student by their ID and display the list of students again to confirm removal
            int studentIdToRemove = 2;
            boolean removed = studentManager.removeStudentById(studentIdToRemove);
            if (removed) {
                System.out.println("Student with ID " + studentIdToRemove + " removed successfully.");
            } else {
                System.out.println("Student with ID " + studentIdToRemove + " not found.");
            }

            // Display all students in the list after removal
            System.out.println("All students after removal:");
            ArrayList<Student> remainingStudents = studentManager.getAllStudents();
            for (Student student : remainingStudents) {
                System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
            }
        }
    }

