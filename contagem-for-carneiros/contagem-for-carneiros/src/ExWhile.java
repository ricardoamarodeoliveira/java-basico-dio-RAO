import java.util.Locale;
import java.util.Scanner;

public class ExWhile {

    public static void main(String[] args) {

        String alunos [] = {"FELIPE", "JONAS", "JULiA", "MARCOS"};
        int x=0;

        while (x <= 2) {
            for( x=0; x < alunos.length; x++){

                if(x==3)
                    break;
                
    
                System.out.println("O Aluno numero numero: " + (x + 1) + " é o: " + alunos [x]);
            }
            
        }

        
        
    }
    
}
