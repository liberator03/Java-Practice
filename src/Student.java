public class Student{
    String name;
    int age;
    double marks;

    public Student(String name, int age, double marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void printStudentInfo(){
        System.out.println("Name of the Student: " + name);
        System.out.println("Age of the Student: " + age);
        System.out.println("Marks of the Student: " + marks);
        System.out.println(); // just to separate students
    }

    public static void main(String[] args) {
        Student student1 = new Student("Mukund", 21, 99.0);
        Student student2 = new Student("Om", 21, 95.5);

        student1.printStudentInfo();
        student2.printStudentInfo();
    }

}