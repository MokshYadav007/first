import java.util.Scanner;

class assingment
{
    public static void main (String[] args) {

      Scanner scan = new Scanner(System.in);
     
        for( int i=scan.nextInt(); i<999; i++ )
        {
          System.out.println(i);
        }
        scan.close();

    }
}
