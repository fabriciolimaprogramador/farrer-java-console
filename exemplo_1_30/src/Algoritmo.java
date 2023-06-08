import java.util.Scanner;

public class Algoritmo {
  public static void main(String[] args) {
    int a, b;
    double x, y;

    Scanner leia = new Scanner(System.in);

    a = leia.nextInt();
    b = leia.nextInt();

    if(a == b){
      x = 1.5;
      y = 2.5;
    } else {
      x = -1.5;
      y = -2.5;
    }

    System.out.println("Valor de x " + x);
    System.out.println("Valor de y " + y);
  }
}
