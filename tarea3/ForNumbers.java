// Program to print numbers from 1 to 5

class ForNumbers {

  public static void main(String[] args) {
  
    int n = 10;
    // for loop  
    System.out.println("Tabla del 9");
    for (int i = 9; i <= (n * 9); i=i+9) {
      System.out.println(i);
    }

    System.out.println("Tabla del 9");
    for (int i = 2; i <= n; i=i+2) {
      System.out.println(i * 9);
    } 

    System.out.println("Pares menores de 100");
    for (int i = 100; i <= n; i=i+100) {
        System.out.println(i - 100);
    }

    System.out.println("Impares entre 10 y 50");
    for (int i = 2; i <= n; i=i+2) {
      System.out.println(i * 9);
    } 

    System.out.println("Pares menores de 100 orden descendente");
    for (int i = 9; i <= (n * 9); i=i+9) {
      System.out.println(i);
    }

    System.out.println("Impares entre 10 y 50 orden descendente");
    for (int i = 9; i <= (n * 9); i=i+9) {
      System.out.println(i);
      }
}

}