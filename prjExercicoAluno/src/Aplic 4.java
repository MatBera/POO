import java.util.Scanner;

/**
 *
 * @author Bera
 */
public class Aplic {
    public static void main(String[] args) {
        Aluno objAluno = new Aluno();
        Scanner entrada = new Scanner(System.in); 
        int opcao,raAlu;
        
        System.out.print("Digite o RA do aluno: ");
        raAlu = entrada.nextInt();
        objAluno.setRA(raAlu);
        System.out.print("Digite a nota da 1a prova: ");
        objAluno.setNtPrv1(entrada.nextDouble());
        System.out.print("Digite a nota da 2a prova: ");
        objAluno.setNtPrv2(entrada.nextDouble());
        System.out.print("Digite a nota do 1o trabalho: ");
        objAluno.setNtTrab1(entrada.nextDouble());
        System.out.print("Digite a nota do 2o trabalho: ");
        objAluno.setNtTrab2(entrada.nextDouble());
        
        do{
            System.out.println("\n\n1 - Exibir Nota das Provas/Trabalhos");
            System.out.println("\n\n2 - Exibir Média das Provas/Trabalhos");
            System.out.println("\n\n3 - Exibir Média Final");
            System.out.println("\n\n4 - Exibir Nota das Provas/Trabalhos");
            System.out.print("\n\n\t Digite a opcao");
            opcao = entrada.nextInt();
            
            switch(opcao){
                case 1:
                    System.out.println("\n\nRA: " + objAluno.getRA());
                    System.out.println("Nota 1a Prova: " + objAluno.getNtPrv1());
                    System.out.println("Nota 2a Prova: " + objAluno.getNtPrv2());
                    System.out.println("Nota 1o Trabalho: " + objAluno.getNtTrab1());
                    System.out.println("Nota 2o Trabalho: " + objAluno.getNtTrab2());
                    break;
                    
                case 2:
                    System.out.println("\n\nRA: " + objAluno.getRA());
                    System.out.println("Media dos trabalhos: " + objAluno.calcMediaTrab());
                    System.out.println("Nota das provas: " + objAluno.calcMediaProva());
                    break;
                    
                case 3:
                    break;
                    
                case 4:
            }
        }
    }
    
}
