//equilateral star triangle

class Main
  {
    public static void main (String[] args)
    {
      int n=5;
      for(int i=0;i<n;i++)
      {
        for(int k=0;k<n-i-1;k++)
          {
            System.out.print(" ");
          }
        for(int j=0;j<=i;j++)
          {
            System.out.print("* ");
          }
        System.out.println();
      }
    }
  }

//equilateral hollow star triangle 

class Main {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
          
            for (int k = 0; k < n - 1 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

// equilateral hollow number triangle 


  class Main {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
          
            for (int k = 0; k < n - 1 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i || i == n - 1) {
                    System.out.print(j+1 + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}  

// rightangled hollow number triangle 

class Main {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++)
          {
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i || i == n - 1) {
                    System.out.print(j+1 + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

//right angled number triangle 
class Main {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++)
          {
            for (int j = 0; j <= i; j++) {
              System.out.print(j+1 + " ");
            }
            System.out.println();
          }
    }
}

//
class Main
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//
class Main
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int i = 1; i <= n; i++)
        {
            for(int j = i; j <= n; j++)
            {
                if(j == i || i == 1 || j == n)
                {
                    System.out.print(j + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}

//
class Main
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= (2*i)-1; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//
class Main
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= (2*i)-1; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//
class Main
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int i = 0; i < n; i++)
        {
            for(int k = 0; k < n-i-1; k++)
            {
                System.out.print(" ");
            }

            for(int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

//
class Main
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int i = 1; i <= n; i++)
        {
            int count = 1;

            for(int k = 1; k <= n-i; k++)
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= (2*i)-1; j++)
            {
                if(j < i)
                {
                    System.out.print(count++ + " ");
                }
                else
                {
                    System.out.print(count-- + " ");
                }
            }

            System.out.println();
        }
    }
}

//
class Main
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        for(int i = 1; i <= n-1; i++)
        {
            for(int j = 1; j <= n-i; j++)
            {
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
}
//
class Main {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

//
class Main {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print((i + 1) + " ");
            }

            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }

            if (i % 2 != 0) {
                System.out.print(i + 1);
            }

            System.out.println();
        }
    }
}


  
