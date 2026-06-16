1. 1D Array – Store Ages of 5 Students

import java.util.Scanner;
class Demo 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        int[] age = new int[5];

        for(int i = 0; i < age.length; i++) 
        {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = scan.nextInt();
        }

        System.out.println("Student ages are:");

        for(int i = 0; i < age.length; i++) 
        {
            System.out.println(age[i]);
        }
    }
}


2. 2D Array – 2 Classrooms with 5 Students Each

import java.util.Scanner;
class Demo 
{
    public static void main(String[] args) 
  {
        Scanner scan = new Scanner(System.in);
        int[][] age = new int[2][5];

        for(int i = 0; i < age.length; i++) 
        {

            for(int j = 0; j < age[i].length; j++) 
            {
                System.out.print("Enter age of Classroom "
                        + (i + 1) + " Student "
                        + (j + 1) + ": ");

                age[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nStored Ages:");

        for(int i = 0; i < age.length; i++)
        {

            for(int j = 0; j < age[i].length; j++) 
            {
                System.out.print(age[i][j] + " ");
            }

            System.out.println();
        }
    }
}


3. 3D Array – 2 Schools, 3 Classrooms, 5 Students
  
  import java.util.Scanner;
  class Demo 
  {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        int[][][] age = new int[2][3][5];

        for(int i = 0; i < age.length; i++) 
        {

            for(int j = 0; j < age[i].length; j++) 
            {

                for(int k = 0; k < age[i][j].length; k++) 
                {

                    System.out.print(
                        "Enter age of School "
                        + (i + 1)
                        + ", Classroom "
                        + (j + 1)
                        + ", Student "
                        + (k + 1)
                        + ": ");

                    age[i][j][k] = scan.nextInt();
                }
            }
        }

        System.out.println("\nStored Ages:");

        for(int i = 0; i < age.length; i++) 
        {

            for(int j = 0; j < age[i].length; j++) 
            {

                for(int k = 0; k < age[i][j].length; k++) 
                {

                    System.out.print(age[i][j][k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }
    }
}
