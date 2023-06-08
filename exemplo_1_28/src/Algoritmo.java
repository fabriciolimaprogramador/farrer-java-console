import java.util.Scanner;

public class Algoritmo {

  public static void main(String[] args) {
    int a, b, c;

    Scanner leia = new Scanner(System.in);

    System.out.println("Informe um valor para a variável 'a'");
    a = leia.nextInt();

    System.out.println("Informe um valor para a variável 'b'");
    b = leia.nextInt();


    c = (a + b) * b;

    System.out.println("A variável 'c' " + c);
  }


}
