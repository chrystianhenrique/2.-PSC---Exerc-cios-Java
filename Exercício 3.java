import java.util.Scanner;

public class TeoremaDePitagoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora do Teorema de Pitágoras");
        System.out.print("Digite o valor do primeiro cateto (a): ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o valor do segundo cateto (b): ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);

        String resultadoFormatado = String.format("%.2f", c);
        
        System.out.println("O valor da hipotenusa (c) é: " + resultadoFormatado);
        
        scanner.close();
    }
}