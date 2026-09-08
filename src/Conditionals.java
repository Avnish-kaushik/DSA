public class Conditionals {
    static void main(String[] args) {
        boolean a = true;
        int b =2;

//        Selection Statements
//        Normal if
//        if(b == 2){
//            System.out.println("b is 2");
//        } else {
//            System.out.println("b is not 2");
//        }

        int age = 50;

        if(age > 80){
            System.out.println("You are too old");
        } else if(age > 70){
            System.out.println("You are still old");
        } else if(age > 40){
            System.out.println("You are now becoming old");
        }

        if(age> 80){
            System.out.println("you are very old");
        }
        if(age > 60){
            System.out.println("You are old");
        }
        if(age > 40){
            System.out.println("You are becoming old");
        }
        if(age > 20){
            System.out.println("You are Young");
        }
        else{
            System.out.println("You are child");
        }

//        SWITCH STATEMENTS
        int i = 2;

        switch(i){
            case 1 :
                System.out.println(" i is 1");
                break;
            case 2:
                System.out.println("i is 2");
            case 3:
                System.out.println("i is 3");
            case 4:
                System.out.println("i is 4");
                break;
            default:
                System.out.println("i is greater than 4");
        }

    }
}
