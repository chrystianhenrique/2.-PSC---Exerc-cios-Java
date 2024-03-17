import java.util.Scanner;

public class CalculoMinutosDesdeInicioDoDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a hora (HH): ");
        int horas = scanner.nextInt();
        
        System.out.print("Digite os minutos (MM): ");
        int minutos = scanner.nextInt();
        
        int minutosDesdeInicioDoDia = horas * 60 + minutos;
        
        System.out.println("Minutos desde o início do dia: " + minutosDesdeInicioDoDia);
        
        scanner.close();
    }
}