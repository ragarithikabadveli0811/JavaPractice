Question 1

public class Main {
    public static void main(String[] args) {
        byte a = 45;
        double b;
        b = a;
        System.out.println(a);
        System.out.println(b);
    }
}

Output:
45
45.0



Question 2

public class Main {
    public static void main(String[] args) {
        byte a;
        double b = 45.5;
        a = (byte)b;
        System.out.println(a);
        System.out.println(b);
    }
}

Output:
45
45.5



Question 3

public class Main {
    public static void main(String[] args) {
        int a = 25;
        int b = 2;
        int c = a / b;
        System.out.println(c);
    }
}

Output:
12



Question 4

public class Main {
    public static void main(String[] args) {
        float a = 25.0f;
        float b = 2.0f;
        float c = a / b;
        System.out.println(c);
    }
}

Output:
12.5



Question 5

public class Main {
    public static void main(String[] args) {
        byte a = 127;
        a = (byte)(a + 1);
        System.out.println(a);
    }
}

Output:
-128



Question 6

public class Main {
    public static void main(String[] args) {
        byte a = 127;
        a = (byte)(a + 4);
        System.out.println(a);
    }
}

Output:
-125



Question 7

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b;
        b = ++a + ++a;
        System.out.println(a);
        System.out.println(b);
    }
}

Output:
7
13



Question 8

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b;
        b = a++ + a++;
        System.out.println(a);
        System.out.println(b);
    }
}

Output:
7
11



Question 9

public class Main {
    public static void main(String[] args) {
        int a = 5;
        a = a++;
        System.out.println(a);
    }
}

Output:
5



Question 10

public class Main {
    public static void main(String[] args) {
        int a = 5;
        a = ++a;
        System.out.println(a);
    }
}

Output:
6



Question 11

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b;
        b = (+a) + (+a);
        System.out.println(a);
        System.out.println(b);
    }
}

Output:
5
10



Question 12

public class Main {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        System.out.println(m++ / (++n * n--) / --m);
    }
}

Output:
0



Question 13

public class Main {
    public static void main(String[] args) {
        int x = 001;
        int y = 010;
        int z = 100;
        int i = --x + y++ - z-- - --z + ++y - --x;
        System.out.println(i);
    }
}

Output:
-179



Question 14

public class Main {
    public static void main(String[] args) {
        int ch = 'A';
        System.out.println(ch++);
    }
}

Output:
65



Question 15

public class Main {
    public static void main(String[] args) {
        char ch = '0';
        System.out.println(ch-- + --ch);
    }
}

Output:
94



Question 16

public class Main {
    public static void main(String[] args) {
        char c = 'A';
        char C = 'a';
        System.out.println(c++ * ++C);
    }
}

Output:
6370



Question 17

public class Main {
    public static void main(String[] args) {
        byte b = 127;
        b++;
        b++;
        System.out.println(b);
    }
}

Output:
-127



Question 18

public class Main {
    public static void main(String[] args) {
        double a = 131;
        byte b = (byte)a;
        System.out.println(b);
    }
}

Output:
-125



Question 19

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i = i + 2) {
            System.out.println(i);
        }
    }
}

Output:
0
2
4



Question 20

public class Main {
    public static void main(String[] args) {
        for(int j = 0; j < 5; ) {
            System.out.println(j);
        }
    }
}

Output:
0
0
0
0
0
...
(Infinite Loop)
