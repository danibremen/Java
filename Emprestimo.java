import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int funcionaria = 34;
        int sair = 3;
        String nomefuncionaria;
        String [][] letras = new String [2][2];
        for (int i =0; i<2; i++){
            for (int j =0; j<2; j++){
                letras [i] [j] = " ";
            }
        }
        String str = "letras = [3]";
        String nomeLetraLista = " ";

        int funcionaria1;
        System.out.println("Digite seu código");
        funcionaria1 = input.nextInt();

        System.out.println("Digite seu nome");
        nomefuncionaria = input.next();
        if (funcionaria == funcionaria1);
           while (sair == 3){
               System.out.println("(1) - Digite a letra do armário");
               System.out.println("(2) - Digite o número desejado");
               System.out.println("(3) - Sair");

               int menu = input.nextInt();

               if (menu == 1){
                   System.out.println("Infome a letra" +
                           "1. a" +
                           "2. b");

                   int numletras = input.nextInt();
                   System.out.println("Escolha o número do armário");
                   int armario = input.nextInt();
                   letras [armario] [numletras] = "x";
               }

               else if (menu == 2);
                for (int i = 0; i<2; i++);{
                    for(int j = 0; j<2; j++);{
                       System.out.println("letras [i] [j]");
                   }
               }

               else if (menu == 3 );{
                   break;
               }





           }
        input.close();

    }
}
