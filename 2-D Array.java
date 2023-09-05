import java.util.Scanner;

public class JagedArray23
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of classes : ");
        int n1 = scan.nextInt();
        System.out.println("Enter the Number of students in classes : ");
        int n2 = scan.nextInt();

        int [][] ar = new int[n1][n2];
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0; j<ar[i].length;j++)
            {
                System.out.println("Enter the marks obtained by  the student : ");
                ar[i][j] = scan.nextInt();

            }

        }
       System.out.println("The marks of the students are as follows :");
         for(int i=0;i<ar.length;i++)
        {
            for(int j=0; j<ar[i].length;j++)
            {
                System.out.println(ar[i][j] +" ");
              

            }
            System.out.println();

        }

         scan.close();
    }
    
}
