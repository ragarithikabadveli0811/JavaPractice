QUESTION 1: StringBuffer Capacity and append()

class Demo1 {
    public static void main(String[] args) {

        StringBuffer st = new StringBuffer();

        System.out.println("Initial Capacity = " + st.capacity());

        st.append("JAVA");

        System.out.println("String = " + st);
        System.out.println("Capacity = " + st.capacity());
    }
}

OUTPUT:

Initial Capacity = 16
String = JAVA
Capacity = 16


QUESTION 2: StringBuffer Capacity Increase

class Demo2 {
    public static void main(String[] args) {

        StringBuffer st = new StringBuffer();

        st.append("JAVA");
        st.append("JAVASCRIPT");
        st.append("JAVA AND PYTHON");

        System.out.println(st);
        System.out.println("Capacity = " + st.capacity());
    }
}

OUTPUT:

JAVAJAVASCRIPTJAVA AND PYTHON
Capacity = 34

NOTE:

New Capacity = (Old Capacity * 2) + 2
             = (16 * 2) + 2
             = 34


QUESTION 3: StringBuilder, length(), trimToSize(), delete()

class Demo3 {
    public static void main(String[] args) {

        StringBuilder st = new StringBuilder();

        System.out.println(st.capacity());

        st.append("JAVA");
        st.append("JAVASCRIPT");
        st.append("JAMESGOSLING");

        System.out.println(st.capacity());

        System.out.println(st);

        System.out.println("Length = " + st.length());

        st.trimToSize();

        System.out.println("Capacity after trimToSize = " + st.capacity());

        st.delete(1, 10);

        System.out.println(st);
    }
}

OUTPUT:

16
34
JAVAJAVASCRIPTJAMESGOSLING
Length = 26
Capacity after trimToSize = 26
JSCRIPTJAMESGOSLING


QUESTION 4: StringTokenizer (Default Delimiter)

import java.util.StringTokenizer;

class Demo4 {
    public static void main(String[] args) {

        String s = "JAVA PYTHON SQL AI";

        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

OUTPUT:

JAVA
PYTHON
SQL
AI


QUESTION 5: StringTokenizer with Custom Delimiter

import java.util.StringTokenizer;

class Demo5 {
    public static void main(String[] args) {

        String s = "JAVA PYTHON SQL AI";

        StringTokenizer st = new StringTokenizer(s, "A");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

OUTPUT:

J
V
 PYTHON SQL
I


QUESTION 6: Count Number of Spaces in a String

class Demo6 {

    static int spaceCount(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "How are you";

        System.out.println(spaceCount(s));
    }
}

OUTPUT:

2

If you want Number of Words:

Replace

return count;

with

return count + 1;

OUTPUT:

3


QUESTION 7: Count Occurrences of a Character in a String

class Demo7 {

    static int charCount(String s, String t) {

        int count = 0;

        char key = t.charAt(0);

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == key) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "How are you";
        String t = "o";

        System.out.println(charCount(s, t));
    }
}

OUTPUT:

2
