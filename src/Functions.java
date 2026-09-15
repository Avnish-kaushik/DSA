public class Functions {
    static void main() {
//    FUNCTIONS IN JAVA

        greet();
        sayHello("Avnish");
        int number = getNumber();
        System.out.println(number);
        int result = multiply(7,8);
        System.out.println(result);

    }

//  NO Ip, NO Op
    static void greet(){
        System.out.println("Hello User");
        return; // Optional
    }

//  IP, NO Op
    static void sayHello(String name){ // number of parameters can be anything
        System.out.println("Hello "+name+"!");
    }

//  NO Ip, OP
    static int getNumber(){
        return 12;
    }

//  IP, OP
    static int multiply(int a, int b){
        return a * b;
    }

}
