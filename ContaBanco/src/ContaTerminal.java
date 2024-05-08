import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("##### CRIANDO CONTA #####");
        System.out.println("Por favor, digite o número da CONTA:");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, digite o número da AGÊNCIA:");
        String agencia = sc.nextLine();
        System.out.println("Por favor, digite o seu NOME COMPLETO:");
        String nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o SALDO:");
        double saldoConta = sc.nextDouble();


        System.out.println();
        System.out.println("##### CONTA CRIADA #####");
        System.out.println("Olá, " 
        + nomeCliente 
        + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia
        + ", conta "
        + numeroConta
        + " e seu saldo R$"
        + saldoConta
        + " já está disponível para saque.");
    }
}
