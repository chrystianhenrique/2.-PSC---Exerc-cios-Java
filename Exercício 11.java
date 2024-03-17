import java.util.Scanner;

public class CalculadoraEnergia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora de consumo de energia!");

        System.out.print("Digite a potência do equipamento em Watts: ");
        double potenciaWatts = scanner.nextDouble();

        System.out.print("Digite a quantidade de horas que o equipamento fica ligado por dia: ");
        double horasPorDia = scanner.nextDouble();

        System.out.print("Digite o valor do kWh: R$");
        double valorKwh = scanner.nextDouble();

        // Calculando o consumo de energia em kWh
        double consumoKwh = (potenciaWatts * horasPorDia) / 1000;

        String consumoFormatado = String.format("%.2f", consumoKwh);
        String valorPagoFormatado = String.format("%.2f", consumoKwh * valorKwh);

        System.out.println("O equipamento consome " + consumoFormatado + " kWh por dia.");
        System.out.println("O valor a ser pago é de R$" + valorPagoFormatado + " por dia.");

        scanner.close();
    }
}