import java.util.Scanner;

public class CalculadoraRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Retângulo");
        
        System.out.print("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();
        
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        
        double area = largura * altura;
        
        double perimetro = 2 * (largura + altura);
        
        double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
        
        String areaFormatada = String.format("%.2f", area);
        String perimetroFormatado = String.format("%.2f", perimetro);
        String diagonalFormatada = String.format("%.2f", diagonal);
        
        System.out.println("\nResultados:");
        System.out.println("Área do retângulo: " + areaFormatada);
        System.out.println("Perímetro do retângulo: " + perimetroFormatado);
        System.out.println("Diagonal do retângulo: " + diagonalFormatada);
        
        scanner.close();
    }
}
