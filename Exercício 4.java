import java.util.Scanner;

public class RegraDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora de Regra de Três");

        System.out.print("Digite o primeiro valor da relação: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor da relação: ");
        double b = scanner.nextDouble();
        
        System.out.print("Digite o valor conhecido na primeira relação: ");
        double valorConhecido1 = scanner.nextDouble();
        
        double valorDesconhecido = (valorConhecido1 * b) / a;
        
        System.out.println("O valor correspondente na segunda relação é: " + valorDesconhecido);
        
        scanner.close();
    }
}