// ENCAPSULATION

/*public class Pillars {
    static void main() {
        BankAccount ba = new BankAccount();
        ba.deposit(10000);
        ba.withdraw(500);
        System.out.println(ba.getBalance());

    }
}

class BankAccount{
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

}*/

// INHERITANCE

// Simple Inheritance --->  StudentI --> EngineeringStudents
// Multi-Level Inheritance --->  StudentI --> EngineeringStudents --> CSE
// Hierarchical Inheritance --->  A(Student)
//                               / \
//                              B   C
//         (Engineering Student)     (Medical Inheritance)
// Multiple Inheritance ---> (Not supported in Java) --->  A   B
//                                                          \ /
//                                                           C

/*
public class Pillars{
    public static void main(String[] args){
        CSE cs1 = new CSE();
        cs1.markAttendance();
        cs1.attendLabs();
        cs1.learnAI();
    }
}

class StudentI{
    String name;
    int age;

    void markAttendance(){
        System.out.println("Attendance Marked");
    }
}

class EngineeringStudents extends StudentI{
    void attendLabs(){
        System.out.println("Lab Attended");
    }
}

class CSE extends EngineeringStudents{
    void learnAI(){
        System.out.println("AI Learned");
    }
}
*/

// SUPER Keyword --> Reference of Parent object or method

public class Pillars{
    public static void main(String[] args){
        EngineeringStudent es1 = new EngineeringStudent();
        es1.name = "Avi";
        es1.age = 24;
        es1.roll = 105;
        es1.college = "KIET";

        es1.print();
    }
}

class StudentI{
    String name;
    int age;
    int roll;

    void print(){
        System.out.println(name + "," + age + "," + roll);
    }
}

class EngineeringStudent extends StudentI{
    String college;

    void print(){
        super.print();
        System.out.println(college);
    }
}
