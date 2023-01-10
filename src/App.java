import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número para visualizar sua tabuada:");
        int number = s.nextInt();
        System.out.println("Digite o tamanho da tabuada:");
        int tableLength = s.nextInt();
        final int[] numbers = new int[tableLength];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        
        System.out.println("Tabela de multiplicação de" + number);
        for(int i = 0; i<numbers.length;i++){
            System.out.println(number +  " * " + numbers[i] + " = " + number * numbers[i]);
        }
        
    }
}