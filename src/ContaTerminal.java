import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Digite o número da conta: ");
        numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Digite o saldo de deposito: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");





    }
}