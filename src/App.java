import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Double hora, porhora, salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de horas trabalhadas");
        hora = sc.nextDouble();
        System.out.println("Insira quanto você ganha por mês");
        porhora = sc.nextDouble();
        salario = hora * porhora;
        System.out.println("O seu salario por mês: R$" +salario);
        sc.close();
    }
}
