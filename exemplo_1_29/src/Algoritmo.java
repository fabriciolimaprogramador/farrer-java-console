import java.util.Scanner;

public class Algoritmo {
  public static void main(String[] args) {
    int a, b, c;

    Scanner leia = new Scanner(System.in);

    System.out.println("Digite um valor inteiro para a variável 'a'");
    a = leia.nextInt();
    System.out.println("Digite um valor inteiro para a variável 'b'");
    b = leia.nextInt();
    System.out.println("Digite um valor inteiro para a variável 'c'");
    c = leia.nextInt();

    if((a + b) < c){
      System.out.println("MENSAGEM");
    }

  }
}
