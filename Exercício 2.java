import java.util.Scanner;

public class EscolhaCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço do etanol: ");
        double precoEtanol = scanner.nextDouble();
        
        System.out.print("Digite o preço da gasolina: ");
        double precoGasolina = scanner.nextDouble();

        double precoRelativoEtanol = precoEtanol / precoGasolina;

        if (precoRelativoEtanol < 0.7) {
            System.out.println("É mais vantajoso abastecer com etanol.");
        } else {
            System.out.println("É mais vantajoso abastecer com gasolina.");
        }
        
        scanner.close();
    }
}