import java.util.Scanner;

public class SomaDeFracao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira fração:");
        System.out.print("Numerador: ");
        int numerador1 = scanner.nextInt();
        System.out.print("Denominador: ");
        int denominador1 = scanner.nextInt();

        System.out.println("Digite a segunda fração:");
        System.out.print("Numerador: ");
        int numerador2 = scanner.nextInt();
        System.out.print("Denominador: ");
        int denominador2 = scanner.nextInt();

        int denominadorComum = denominador1 * denominador2;

        int novoNumerador1 = numerador1 * denominador2;
        int novoNumerador2 = numerador2 * denominador1;

        int somaNumeradores = novoNumerador1 + novoNumerador2;

        System.out.println("A soma das frações é:");
        System.out.println(somaNumeradores + "/" + denominadorComum);

        scanner.close();
    }
}