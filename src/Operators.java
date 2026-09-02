public class Operators {
    static void main() {
//        Operators in Java
//        AIRTHMETIC OPERATORS --> +,-, *, /, %, +=, -=, /=, %=, ++, --
            int a = 15;
            int b = 5;

            int c = a+b; // 20
            int d = a-b; // 10
            int e = a*b; // 75
            int f = a/b; // 3
            int g = a % b; //0

        System.out.println(c + " " + d +" "+ e + " " +  f +" "+ g);

        int h = a + 2;
        h += 2;// h = h + 2 // 19
        h -= 2;// h = h - 2 // 15
        h *= 2;// h = h * 2 // 34
        h /= 2;// h = h / 2 // 8
        h %= 2;// h = h % 2 // 1

        System.out.println(h);

        int i = 6;
        i++;// i  = i + 1 --> i += 1 // 7
        i--;// i = i - 1 --> i -= 1 // 5
        System.out.println(i);

        // pre increment and post increment/decrement.

        int j = 7;
        j++; // postfix increment
        ++j; // prefix increment

          // j = 9
        int k = j++;
        System.out.println(j+ " "+ k);

        int l = ++j;
        System.out.println(j+ " " + l);

//        RELATIONAL OPERATORS --> ==, !=, <, >, <=, >=
        int m = 5;
        int n = 10;

        boolean o = (m == n);
        System.out.println(o); // false

        boolean p = (m != n);
        System.out.println(p); // true

        boolean q = (m < n);
        System.out.println(q); // true

        boolean r = (m > n);
        System.out.println(r); // false

//        BITWISE OPERATORS --> &,|,~, ^, <<, >>, >>>

        int s = 2; //10 --> 00000000 00000000 00000000 00000010
        int t = 3;// 11 --> 00000000 00000000 00000000 00000011
        int u = s & t; // --> 10 -->2
        int v = s | t;// --> 11 -->3
        int w = s ^ t;// --> 01 --> 1
        int x = ~s;// 11111111 11111111 11111111 11111101 -->  -3
        System.out.println(u + " " + v+" " + w+" " + x);

        int y = 1; // 00000000 00000000 00000000 00000001 --> 1
        y = y << 33 ; //01000000 00000000 00000000 00000000 --> 2
        System.out.println(y);

        int z = 8;
        z = z >> 1;
        System.out.println(z);

        // LOGICAL OPERATORS --> &&, ||, ~

        int $a = 5;
        int $b = 10;
        int $c = 15;
        boolean $d = ($a < $b) && ($a < $c);
        System.out.println($d);

    }
}

