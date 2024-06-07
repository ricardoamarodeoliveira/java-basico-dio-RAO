
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor digite seu primeiro nome: ");
        String nomeCliente = scanner.next(); 

        System.out.println("Por favor digite seu ultimo sobrenome: ");
        String sobrenomeCliente = scanner.next(); 
        
        System.out.println("Senhor " + nomeCliente + " por favor digite o número da Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Por favor, agora digite o numero da conta: ");
        int numero = scanner.nextInt();      
               

        System.out.println("Agora informe o valor do seu depósito inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá senhor " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
        + agencia + ", conta: " + numero + ", e seu saldo no valor de R$ " + saldo + " já esta disponivel para saque.");
        

    }
}
