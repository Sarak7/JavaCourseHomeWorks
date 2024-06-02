package HomeWorks.HW3;

public class Main {

    public static void main(String[] args) {

        PersonRecord person1 = new PERSON("Sara" , 24 , "Riyadh");
        PersonRecord person3 = new PERSON("Khalid", 24 , "Jeddah");

        // Displaying details of Person objects
        System.out.println("Details of Person 1:");
        System.out.println(person1.getDetails());


        // Creating a Student object
        PersonRecord student1 = new Student("Sara", 24, "Riyadh", 7, "CA GEN");
        PersonRecord student2 = new Student("Saud", 24 , "Riyadh", 777, "C#");

        // Displaying details of Student object
        System.out.println("\nDetails of Student 1:");
        System.out.println(student1.getDetails());

        int idToCompare = 7;
        if (student1 instanceof ComparableById) {
            System.out.println("Student ID matches: " + ((ComparableById) student1).compareById(idToCompare));
        }
        // Creating School object
        School school = new School();

        // Adding students to the school
        school.addStudent(new Student("Lama", 28, "Khobar", 17, "Java"));
        school.addStudent(new Student( "Saud", 24 , "Riyadh", 777, "C#"));
        school.addStudent(new Student( "Faisal", 26 , "Khobar", 77, "HTML"));
        school.addStudent(new Student( "Khalid", 24 , "Jeddah", 7777, "Python"));
  ;

        // Displaying all students in the school
        school.displayAllStudents();

        // Removing a student by ID
        school.removeStudent(7777);

        // Displaying all students after removal
        school.displayAllStudents();

        // Sorting students by name
        school.sortStudentsByName();
        System.out.println("\nList of Students after sorting by name:");
        school.displayAllStudents();

        // Finding a student by studentId
        int studentIdToFind = 17;
        Student foundStudent = school.findStudentById(studentIdToFind);
        if (foundStudent != null) {
            System.out.println("\nStudent with ID " + studentIdToFind + " found:");
            System.out.println(foundStudent.getDetails());
        } else {
            System.out.println("\nStudent with ID " + studentIdToFind + " not found.");
        }

        // Write students to a file
        String filename = "Students.txt";
        school.writeStudentsToFile(filename);
        System.out.println("Students written to file.");

// Clear the current list of students
        school = new School();

// Read students from the file
        school.readStudentsFromFile(filename);
        System.out.println("Students read from file:");

// Display all students read from the file
        school.displayAllStudents();
    }

    }



