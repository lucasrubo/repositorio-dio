import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /**
         * TODO: Conhecer e importar a classe Scanner
         * 
         * Exibir as mensagens para o nosso usuário
         * 
         * Obter pelo scanner os valores digitados no terminal
         * 
         * Exibir a mensagem conta criada
         **/
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Agência: ");
            String agencia = scanner.nextLine();

            System.out.println("-");

            System.out.println("Por favor, digite o número da Conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer após a leitura do inteiro

            System.out.println("-");

            System.out.println("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.println("-");

            System.out.println("Por favor, digite o saldo da Conta: ");
            double saldo = scanner.nextDouble();

            System.out.println("-");

            scanner.close();

            String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                    ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.";

            System.out.println(mensagem);
        }
    }
}
