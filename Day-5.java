1) FLOYD’S TRIANGLE
class Main {
    public static void main(String[] args) {

        int n = 5;
        int count = 1;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }

            System.out.println();
        }
    }
}

2)REVERSE FLOYD’S TRIANGLE
class Main {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            int count = i * (i + 1) / 2;

            for(int j = 1; j <= i; j++) {
                System.out.print(count-- + " ");
            }

            System.out.println();
        }
    }
}

3)REVERSE FLOYD’S TRIANGLE WITH *
class Main {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            int count = i * (i + 1) / 2;

            for(int j = 1; j <= i; j++) {

                System.out.print(count - j + 1);

                if(j != i)
                    System.out.print("*");
            }

            System.out.println();
        }
    }
}

4) SAME CHARACTER IN EVERY ROW
class Main {
    public static void main(String[] args) {

        int n = 5;
        char ch = 'A';

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print((char)(ch + i - 1) + " ");
            }

            System.out.println();
        }
    }
}

5)ALPHABET TRIANGLE 
class Main {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            char ch = 'A';

            for(int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }

            System.out.println();
        }
    }
}

6)CONTINUOUS ALPHABET TRIANGLE 
class Main {
    public static void main(String[] args) {

        int n = 5;
        char ch = 'A';

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(ch++ + " ");
            }

            System.out.println();
        }
    }
}

7)ZIG-ZAG ALPHABET TRIANGLE
class Main {
    public static void main(String[] args) {

        int n = 5;
        char ch = 'A';

        for(int i = 1; i <= n; i++) {

            if(i % 2 == 0) {

                char temp = (char)(ch + i - 1);

                for(int j = 1; j <= i; j++) {
                    System.out.print(temp-- + " ");
                }

                ch += i;

            } else {

                for(int j = 1; j <= i; j++) {
                    System.out.print(ch++ + " ");
                }
            }

            System.out.println();
        }
    }
}

8)SAME CHARACTER IN EVERY ROW USING ch++
class Main {
    public static void main(String[] args) {

        int n = 5;
        char ch = 'A';

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            ch++;

            System.out.println();
        }
    }
}
