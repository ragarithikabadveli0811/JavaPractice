Question 1

public class Main {
    public static void main(String[] args) {
        int j = 0;
        while (j <= 10) {
            System.out.println("Java");
            j++;
        }
    }
}

Output:
Java
Java
Java
Java
Java
Java
Java
Java
Java
Java
Java



Question 2

public class Main {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Java");
            i++;
        } while (i <= 5);
    }
}

Output:
Java
Java
Java
Java
Java



Question 3

public class Main {
    public static void main(String[] args) {
        int i, sum;
        for (i = 1, sum = 0; i <= 5; sum += i, ++i) {
            System.out.println(i);
        }
    }
}

Output:
1
2
3
4
5



Question 4

public class Main {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 5 && j < 3; i++, j++) {
            System.out.println(i);
            System.out.println(j);
        }
    }
}

Output:
0
0
1
1
2
2



Question 5

public class Main {
    public static void main(String[] args) {
        for (int i = 0, j = 5; i < 5 && j > 0; i++, j--) {
            System.out.println("i = " + i + "  j = " + j);
        }
    }
}

Output:
i = 0  j = 5
i = 1  j = 4
i = 2  j = 3
i = 3  j = 2
i = 4  j = 1



Question 6

public class Main {
    public static void main(String[] args) {
        boolean cond = false;
        for (int i = 0; i < 10 && !cond; i++) {
            System.out.println(i);
            if (i == 5) {
                cond = true;
            }
        }
    }
}

Output:
0
1
2
3
4
5



Question 7

public class Main {
    public static void main(String[] args) {
        int cnt = 0;
        boolean b = true;
        while (b) {
            System.out.print(cnt + " ");
            cnt++;
            if (cnt == 4) {
                b = false;
            }
        }
    }
}

Output:
0 1 2 3



Question 8

public class Main {
    public static void main(String[] args) {
        int j = 4;
        do {
            System.out.print(j + " ");
            j++;
        } while (j < 4);
    }
}

Output:
4
