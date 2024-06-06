public class ContaTerminal {

    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        /*String nome = args [0];
        String sobrenome = args [1];ri
        int idade = Integer.valueOf(args [2]);
        double altura = Double.valueOf(args[3]);
        */

        System.out.println("Por favor digite seu nome: ");
        String nomeCliente = scanner.next(); 
        
        System.out.println("Por favor digite o número da Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Por favor digite o numero da conta: ");
        int numero = scanner.nextInt();
       
               

        System.out.println("Por favor informe o valor do seu depósito inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá senhor " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: "
        + agencia + ", conta: " + numero + ", e seu saldo no valor de R$ " + saldo + " já esta disponivel para saque.");

    }
}
