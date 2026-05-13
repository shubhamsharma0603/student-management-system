public class Student {
    int id;
    String name;
    String branch;
    double cgpa;

    Student(int id, String name, String branch, double cgpa){
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("CGPA: " + cgpa);
        System.out.println("------------------");
    }
}
