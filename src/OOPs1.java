public class OOPs1 {
    static void main() {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Aditya";
        s1.age = 20;
        s1.college = "IIT Guwahati";
        s1.rollNo = 101;

        s2.name = "Amit";
        s2.age = 22;
        s2.college = "IIT Guwahati";
        s2.rollNo = 102;

        s1.markAttendance();
        s2.markAttendance();

        s1.print();
        s2.print();
    }
}
class Student{
    String name;
    int age;
    int rollNo ;
    String college;

    void markAttendance(){
        System.out.println("Attendance Marked by " + name);
    }

    void print(){
        System.out.println("Name : " + name + " " + "Age : " + age + " " + "Roll No : " + rollNo + " " + "College: " + college + " ");
    }

}

// Java is almost complete object oriented programming language.