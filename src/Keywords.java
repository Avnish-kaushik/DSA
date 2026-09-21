    public class Keywords {
    static void main() {
        Random2 r3 = new Random2();
        System.out.println(r3.PI);

//        r3.PI = 3.16; // not allowed

//        Random r1 = new Random("Avnish", 24, 105);
//        Random r2 = new Random("Arun", 23, 106);
//
////        Random.college = "Amity";   // Not needed when you declare the static block
//
//        System.out.println(r1.name + " " + r1.age + " " + r1.roll + " " + Random.college);
//        System.out.println(r2.name + " " + r2.age + " " + r2.roll + " " + Random.college);
   }
}

//class Random {
//    String name;
//    int age;
//    int roll;
//    static String college;
//    static int grade;
//
//    Random(String name, int age, int roll){
//        this.name = name;
//        this.age = age;
//        this.roll = roll;
//    }
//
//    // Static Block
//    static{
//        college = "Amity";
//        grade = 6;
//    }
//}
    class Random2{
    final double PI = 3.14;
}

// Why the main function is static ??