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

        double consumoKwhDia = (potenciaWatts * horasPorDia) / 1000;

        double consumoKwhMes = consumoKwhDia * 30;

        double valorPagoMes = consumoKwhMes * valorKwh;

        String consumoDiarioFormatado = String.format("%.2f", consumoKwhDia);
        String custoMensalFormatado = String.format("%.2f", valorPagoMes);

        System.out.println("O equipamento consome " + consumoDiarioFormatado + " kWh por dia.");
        System.out.println("O custo mensal em energia elétrica é de R$" + custoMensalFormatado + " por mês.");

        scanner.close();
    }
}