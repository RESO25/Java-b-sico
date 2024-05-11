import java.util.Locale;
import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite seu primeiro nome:");
        String nome = scanner.next();
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        scanner.close();

        System.out.println(String.format("Olá, me chamo %s %s. ", nome, sobrenome));
        System.out.println(String.format("Tenho %d anos e %.2fm de altura.", idade, altura));
        
    }
}
