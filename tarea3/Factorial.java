// Program to find the sum of natural numbers from 1 to 1000.

class Main {
  public static void main(String[] args) {
      
    int fact = 0;
    int n = 10;

    // for loop
    for (int i = 1; i <= n; ++i) {
      // body inside for loop
    

      fact *= i;     // sum = sum * i
      System.out.println(fact);
    }
       
    System.out.println("Sum = " + fact);
    //System.out.println("Avg = ");
  }
}