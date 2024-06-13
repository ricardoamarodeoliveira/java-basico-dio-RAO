import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class SobreMim {

   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try{
        System.out.println("Digite seu nome por favor: ");
        String nome = scanner.next();
    

        System.out.println("Digite seu sobrenome por favor: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua altura por favor: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso por favor: ");
        int peso = scanner.nextInt();


        System.out.println("Meu nome é: " + nome.toUpperCase() + " " + sobreNome.toUpperCase());

        System.out.println("Tenho: " + peso + " kilos e: " + altura + " de altura");

        }
        catch(InputMismatchException e){
            System.err.println("Possui codigo errado, refaça");
        }





        
    

        }

        
        
}
