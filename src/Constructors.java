public class Constructors {
    static void main() {

//        int x;    // local variable ---> No Default Values
//        System.out.println(x);

        Students s1 = new Students("Avi", 24, 107, "KIET");
        Students s2 = new Students();

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.college);
        System.out.println(s1.roll);

    }
}

/* Default Values for Instance Variables

Integer --> 0
floating --> 0.0
Boolean --> false
String --> null(nothing)

*/

class Students{
    String name;  // information/data/characteristics --> instance variables
    int age;
    int roll;
    String college;

//    DEFAULT CONSTRUCTOR
    Students(){

    }

//    NORMAL CONSTRUCTOR
//    Students(){
//        name = "Avnish";
//        age = 24;
//        roll = 1001;
//        college = "KIET";
//    }

//    PARAMETERIZED CONSTRUCTOR
    Students(String name, int age, int roll, String college){
        this.name = name;
        this.age = age;
        this.roll = roll;
        this.college = college;
    }

    void markAttendance(){  // behaviours --> functions --> instance methods
        System.out.println("Attendance marked for student " + name);
    }
}