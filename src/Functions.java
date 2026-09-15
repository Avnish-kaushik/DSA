public class Functions {
    static void main() {
//    FUNCTION OVERLOADING
        int x = sum(2,3);
        System.out.println(x);

        int y = sum(8,9);
        System.out.println(y);

        int z = sum(7,4,8);
        System.out.println(z);

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {  // different no. of parameters #functionOverloading
        return a + b + c;
    }

    static int sum(double a, double b) { // different types of parameters #functionOverloading
        return (int)(a + b);
    }

}
