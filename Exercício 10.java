import java.util.Scanner;

public class CalculadoraAgua {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora de quantidade de água recomendada!");

        System.out.print("Digite o seu peso em quilogramas: ");
        double peso = scanner.nextDouble();

        double quantidadeAguaLitros = peso * 0.035;

        String quantidadeAguaFormatada = String.format("%.2f", quantidadeAguaLitros);

        System.out.println("A quantidade recomendada de água por dia é: " + quantidadeAguaFormatada + " litros.");

        scanner.close();
    }
}