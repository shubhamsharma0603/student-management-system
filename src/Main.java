import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int nextId = 1;
    static void addStudent() {
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter branch: ");
        String branch = sc.nextLine();
        System.out.println("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        sc.nextLine();

        Student s = new Student(nextId, name, branch, cgpa);
        students.add(s);
        nextId++;
        System.out.println("Student added successfully!");
    }
    static void displayStudents() {
        if(students.isEmpty()) {
            System.out.println("No Students found!");
        } else {
            System.out.println("----All Students -----");
            for (Student s : students){
                s.display();
            }
        }
    }
    static void searchStudent() {
        System.out.println("Enter student name to search: ");
        String name = sc.nextLine();
        boolean found = false;

        for (Student s : students) {
            if (s.name.equalsIgnoreCase(name)) {
                s.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Student not found!");
        }
    }
    static void deleteStudent(){
        System.out.println("Enter student ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).id == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found!");
        }
    }
    static void updateStudent() {
        System.out.println("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        boolean found = false;

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Enter new name: ");
                s.name = sc.nextLine();
                System.out.println("Enter new branch: ");
                s.branch = sc.nextLine();
                System.out.println("Enter new CGPA: ");
                s.cgpa = sc.nextDouble();
                sc.nextLine();
                System.out.println("Student update successfully!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found!");
        }
    }

    public static void main(String[] args){
        int choice = 0;
        while(choice != 6) {
        System.out.println("Welcome to Student Management System");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Update Student");
        System.out.println("6. Exit");
        System.out.println("Enter choice: ");
        choice = sc.nextInt();
        sc.nextLine();

        if(choice == 1) {
            addStudent();
        } else if (choice == 2) {
            displayStudents();
        } else if (choice == 3) {
            searchStudent();
        } else if (choice == 4) {
            deleteStudent();
        } else if (choice == 5) {
            updateStudent();
        } else if (choice == 6) {
            System.out.println("Goodbye");
        }

        }
        }
}
