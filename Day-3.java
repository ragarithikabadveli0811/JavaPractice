STAR TRIANGLE:

class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}


NUMBER PATTERN:

class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {

            for(int j = 1; j <= 5; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}


INCREMENTAL NUMBER PATTERN:

class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {

            for(int j = i; j <= i + 4; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}


FLOYD NUMBER PATTERN:

class Main {
    public static void main(String[] args) {

        int count = 1;

        for(int i = 1; i <= 5; i++) {

            for(int j = 1; j <= 5; j++) {

                if(count < 10)
                    System.out.print("0");

                System.out.print(count + " ");
                count++;
            }

            System.out.println();
        }
    }
}


HOLLOW SQUARE:

class Main {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++) {

                if(i == 0 || i == n-1 || j == 0 || j == n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}


NUMBER PYRAMID:

class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}


RIGHT ALIGNED TRIANGLE:

class Main {
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            for(int space = 1; space <= n-i; space++) {
                System.out.print(" ");
            }

            for(int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}  
