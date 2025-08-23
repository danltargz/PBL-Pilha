import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();

        Expressao e = new Expressao();
        int resultado = e.valida(entrada);

        System.out.println(resultado);
        sc.close();
    }
}