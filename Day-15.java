1. 2D Jagged Array

Two classrooms:

* Classroom 1 → 3 students
* Classroom 2 → 5 students

  
import java.util.Scanner;

public class Demo 
{
    public static void main(String[] args) 
  {

        Scanner scan = new Scanner(System.in);

        int[][] a = new int[2][];

        a[0] = new int[3];
        a[1] = new int[5];

        for(int i = 0; i < a.length; i++)
        {

            for(int j = 0; j < a[i].length; j++) 
            {

                System.out.print(
                    "Enter age of Class "
                    + i + " Student "
                    + j + ": "
                );

                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nStored Ages:");

        for(int i = 0; i < a.length; i++)
        {

            for(int j = 0; j < a[i].length; j++) 
            {
                System.out.print(a[i][j] + " ");
            }

            System.out.println();
        }

        scan.close();
    }
}

2. 3D Jagged Array

Scenario:

* 2 schools
* School 0 has 3 classrooms
* School 1 has 2 classrooms
* Each classroom has different numbers of students


  
import java.util.Scanner;

public class Demo 
{
    public static void main(String[] args) 
  {

        Scanner scan = new Scanner(System.in);

        int[][][] a = new int[2][][];

        a[0] = new int[3][];
        a[1] = new int[2][];

        a[0][0] = new int[2];
        a[0][1] = new int[3];
        a[0][2] = new int[3];

        a[1][0] = new int[2];
        a[1][1] = new int[3];

        for(int i = 0; i < a.length; i++) 
        {

            for(int j = 0; j < a[i].length; j++) 
            {

                for(int k = 0; k < a[i][j].length; k++)
                {

                    System.out.print(
                        "Enter age of School "
                        + i +
                        " Class "
                        + j +
                        " Student "
                        + k + ": "
                    );

                    a[i][j][k] = scan.nextInt();
                }
            }
        }

        System.out.println("\nStored Data:");

        for(int i = 0; i < a.length; i++) 
        {

            for(int j = 0; j < a[i].length; j++)
            {

                for(int k = 0; k < a[i][j].length; k++)
                {

                    System.out.print(a[i][j][k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }

        scan.close();
    }
}
