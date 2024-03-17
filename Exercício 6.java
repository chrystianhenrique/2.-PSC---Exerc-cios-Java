import java.util.Scanner;

public class CalculadoraRevestimento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora de revestimento!");

        System.out.print("Digite a largura da área a ser revestida (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite o comprimento da área a ser revestida (em metros): ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura da cerâmica escolhida (em metros): ");
        double larguraCeramica = scanner.nextDouble();

        System.out.print("Digite o comprimento da cerâmica escolhida (em metros): ");
        double comprimentoCeramica = scanner.nextDouble();

        double areaTotal = largura * comprimento;
        double areaCeramica = larguraCeramica * comprimentoCeramica;

        int quantidadeCeramica = (int) Math.ceil((areaTotal / areaCeramica) * 1.1);

        System.out.println("Você precisará de " + quantidadeCeramica + " unidades de cerâmica.");
        
        scanner.close();
    }
}