import java.util.*;

public class FibonacciSeries {
  public static int Recursion(int count) {
    if (count == 0) {
      return 0;
    } 

    if (count == 1 || count == 2) {
      return 1;
    } 
    return Recursion(count - 1) + Recursion(count-2);
  }

  public static void main(String args[]) {
    Scanner scan=new Scanner(System.in);
    int fib = scan.nextInt();

    System.out.print("Fibonacci Series of " +  fib + " numbers is:\n ");

    for (int i = 0; i < fib; i++) {
      System.out.print(Recursion(i) + ", ");
    }
  }
}

