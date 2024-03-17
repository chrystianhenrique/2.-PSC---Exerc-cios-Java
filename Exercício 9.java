import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora de IMC!");

        System.out.print("Digite o seu peso atual em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em centímetros: ");
        double alturaCm = scanner.nextDouble();

        double alturaM = alturaCm / 100;

        double imc = peso / (alturaM * alturaM);

        String imcFormatado = String.format("%.2f", imc);

        System.out.println("Seu IMC é: " + imcFormatado);

        double pesoIdeal = 22 * alturaM * alturaM;

        double pesoIdealAjustado = pesoIdeal + (pesoIdeal * 0.1);

        String pesoIdealFormatado = String.format("%.2f", pesoIdeal);

        String pesoIdealAjustadoFormatado = String.format("%.2f", pesoIdealAjustado);

        System.out.println("Seu peso ideal é: " + pesoIdealFormatado + " kg.");
        System.out.println("Seu peso ideal ajustado é: " + pesoIdealAjustadoFormatado + " kg.");

        scanner.close();
    }
}