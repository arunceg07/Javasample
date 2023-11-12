package InternalJavaPGMS;

public class Pattern {

    public static void main(String[] args)
    {

        // How to Calculate Logic for Letters or any patterns (example Letter A , W , R below)
        // i loop represent row (horizontal) and j loop represent Column (vertical)

     //   a                  i==1 and j==3
     //  a a                 i==2 and j==2,4
     // aaaaa                i==3 and j==1,2,3,4,5
     // a   a                i==4 and j==1,5
     // a   a                i==5 and j==1,5

     // a a a                i==1 and j==1,3,5
     // a a a                i==2 and j==1,3,5
     // a a a                i==3 and j==1,3,5
     // aa aa                i==4 and j==1,2,4,5
     // a   a                i==5 and j==1,,5


      // aaaaa                i==1 and j==1,2,3,4,5
      // a   a                i==2 and j==1,5
      // aaaaa                i==3 and j==1,2,3,4,5
      // a a a                i==4 and j==1,3,5
      // a   a                i==5 and j==1,5

        // Printing Letter 'H'
        for (int i =1; i<=5;i++)
        {
            for (int j =1; j<=5;j++)
            {
                if (i==1 && j==2 || i==1 && j==3 || i==1 && j==4)
                {
                    System.out.print(" ");
                    continue;
                }
                if (i==2 && j==2 || i==2 && j==3 || i==2 && j==4)
                {
                    System.out.print(" ");
                    continue;
                }
//                if (i==3 && j==2 || i==3 && j==3 || i==3 && j==4)
//                {
//                    System.out.print("*");
//                    continue;
//                }
                if (i==4 && j==2 || i==4 && j==3 || i==4 && j==4)
                {
                    System.out.print(" ");
                    continue;
                }
                if (i==5 && j==2 || i==5 && j==3 || i==5 && j==4)
                {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("a");
            }

                System.out.print("\n");

        }
        System.out.print("\n");
        // Printing Letter 'E'

        for (int i =1; i<=5;i++)
        {
            for (int j =1; j<=5;j++)
            {
                if (i==2 && j==2 || i==2 && j==3 || i==2 && j==4 || i==2 && j==5)
                {
                    System.out.print(" ");
                    continue;
                }
                if (i==4 && j==2 || i==4 && j==3 || i==4 && j==4 || i==4 && j==5)
                {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("a");
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        // Printing Letter 'X'

        for (int i =1; i<=5;i++)
        {
            for (int j =1; j<=5;j++)
            {
               if (i==j || i==5 && j==1 || i==4 && j==2 || i==2 && j==4 || i==1 && j==5) {
                   System.out.print("a");
               } else
               {
                   System.out.print(" ");
               }
            }
            System.out.print("\n");
        }

        System.out.print("\n");
        // Printing Letter 'A'

        for (int i =1; i<=5;i++)
        {
            for (int j =1; j<=5;j++)
            {
                 if (i==1 && j==3 || i==2 && j==2 || i==2 && j==4 || i==3 && j==1 || i==3 && j==2 || i==3 && j==3 || i==3 && j==4 || i==3 && j==5 || i==4 && j==1 || i==4 && j==5 || i==5 && j==1 || i==5 && j==5)
                 {
                     System.out.print("a");
                 }
                 else {
                     System.out.print(" ");
                 }

            }
            System.out.print("\n");
        }

        System.out.print("\n");
        // Printing Letter 'W'

        for (int i =1; i<=5;i++)
        {
            for (int j =1; j<=5;j++)
            {
                if (i==1 && j==1 || i==1 && j==3 || i==1 && j==5 || i==2 && j==1 || i==2 && j==3 || i==2 && j==5 || i==3 && j==1 || i==3 && j==3 || i==3 && j==5 || i==4 && j==1 || i==4 && j==2 || i==4 && j==4 || i==4 && j==5 || i==5 && j==1|| i==5 && j==5)
                {
                    System.out.print("a");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }

        System.out.print("\n");
        // Printing Letter 'A'

        for (int i =1; i<=5;i++)
        {
            for (int j =1; j<=5;j++)
            {
                if (i==1 && j==3 || i==2 && j==2 || i==2 && j==4 || i==3 && j==1 || i==3 && j==2 || i==3 && j==3 || i==3 && j==4 || i==3 && j==5 || i==4 && j==1 || i==4 && j==5 || i==5 && j==1 || i==5 && j==5)
                {
                    System.out.print("a");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // Printing Letter 'R'

        for (int i =1; i<=5;i++)
        {
            for (int j =1; j<=5;j++)
            {
                if (i==1 && j==1 || i==1 && j==2 || i==1 && j==3 || i==1 && j==4 || i==1 && j==5 || i==2 && j==1 || i==2 && j==5 || i==3 && j==1 || i==3 && j==2 || i==3 && j==3 || i==3 && j==4 || i==3 && j==5 || i==4 && j==1 || i==4 && j==3 || i==4 && j==5 || i==5 && j==1 || i==5 && j==5)
                {
                    System.out.print("a");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }

        System.out.print("\n");

        // Printing Letter 'E'

        for (int i =1; i<=5;i++)
        {
            for (int j =1; j<=5;j++)
            {
                if (i==2 && j==2 || i==2 && j==3 || i==2 && j==4 || i==2 && j==5)
                {
                    System.out.print(" ");
                    continue;
                }
                if (i==4 && j==2 || i==4 && j==3 || i==4 && j==4 || i==4 && j==5)
                {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("a");
            }
            System.out.print("\n");
        }

    }
}
