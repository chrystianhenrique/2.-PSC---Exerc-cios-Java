import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraDownload {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Bem-vindo à calculadora de tempo de download!");

        // Solicitando o tamanho do arquivo em MB
        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoArquivoMB = scanner.nextDouble();

        // Solicitando a velocidade do link em Mbps
        System.out.print("Digite a velocidade do link em Mbps: ");
        double velocidadeLinkMbps = scanner.nextDouble();

        // Calculando o tempo necessário para o download em minutos
        double tempoMinutos = (tamanhoArquivoMB / (velocidadeLinkMbps * (1.0 / 8.0) * 60));

        System.out.println("O tempo necessário para o download será de aproximadamente " + df.format(tempoMinutos) + " minutos.");

        scanner.close();
    }
}