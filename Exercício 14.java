import java.util.Scanner;

public class CalculadoraDistanciaPontos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as coordenadas do ponto P1:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        System.out.println("Digite as coordenadas do ponto P2:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));

        String distanciaFormatada = String.format("%.2f", distancia);

        System.out.println("A distância entre os pontos P1 e P2 é: " + distanciaFormatada);

        scanner.close();
    }
}