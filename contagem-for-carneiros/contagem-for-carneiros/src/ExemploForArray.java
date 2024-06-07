public class ExemploForArray {

    public static void main(String[] args) {

        //indice sempre inicia com zero

        String alunos [] = {"FELIPE", "JONAS", "JULiA", "MARCOS"};

        for(int x=0; x < alunos.length; x++){

            if(x==60)
                break;
            

            System.out.println("O Aluno numero numero: " + (x + 1) + " é o: " + alunos [x]);
        }
        
    }
    
}
