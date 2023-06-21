
import java.util.Random;
import java.util.Scanner;

public class JogoDaSenha {

    public static void main(String[] args) {

        int vidas = 10;
        int [] senha = new int[4];
        int [] digitos = new int[4];

        randomizar(senha);
        boasVindas();

        while (vidas!= 0 ) {
            receber(digitos);
            if(comparar1(senha, digitos) == 4) {
                System.out.println("Você ganhou!");
                System.exit(0);
            }
            comparar2(senha, digitos);
            vidas--;
            System.out.println("Vidas = "+vidas);
            if(vidas == 0) {
                System.out.println("Game Over! O computador ganhou!");
            }
        }
    }
    private static void randomizar(int[] senha) {
        Random rand = new Random();
        for (int i=0; i<senha.length;i++) {
            senha[i]= rand.nextInt(1, 7);
            System.out.print(senha[i]);
        }
        System.out.println("\n");
    }
    public static void receber(int[] digitos) {
        Scanner scan= new Scanner(System.in);
        for(int i=0; i<digitos.length; i++) {
            digitos[i]= scan.nextInt();
            if(digitos[i] >= 7 || digitos[i] <= 0) {
                System.out.println("O número deve ser de 1 a 6. \nPrograma finalizado.");
                System.exit(0);
            }
        }
    }
    public static int comparar1(int [] senha, int [] digitos) {
        int contp=0;
        for (int i=0; i<senha.length; i++) {
            if (senha[i]== digitos[i]) {
                contp++;
            }
        }
        System.out.println("Digitos corretos: " + contp);
        return contp;
    }
    public static int comparar2(int [] senha, int [] digitos) {
        int contp=0;

        for (int i=0; i<senha.length; i++) {
            if (senha[i] != digitos[i] ){
                for (int j = 0; j < senha.length; j++) {
                    if (senha[i] == digitos[j] && senha[i] != digitos[i] ) {
                        contp++;

                    }

                }
            }
        }
        System.out.println("Digitos deslocados: " + contp);

        return contp;
    }
    public static void boasVindas(){
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------------------------------------");
        System.out.println("");
        System.out.println("          Seja bem vindo ao jogo da senha!");
        System.out.println("          ➤ Você já conhece as regras? ୭̥⋆*｡ ");
        System.out.println("");
        System.out.println("-----------------------------------------------------------");

        String respostaRegras = scan.next();

        if(respostaRegras.equalsIgnoreCase("sim")){
            System.out.println("----------------------------------------------------------");
            System.out.println("");
            System.out.println("                  Que bom (◦'ںˉ◦)!  ");
            System.out.println("        Agora, digite a sua primeira tentativa: ");
            System.out.println("");
            System.out.println("----------------------------------------------------------");

        } else {
            System.out.println("----------------------------------------------------------");
            System.out.println("");
            System.out.println("                   As regras consistem em: ");
            System.out.println("     ➤  Uma combinação de números (a senha) será gerada");
            System.out.println("     ➤  O jogador tem tentativas de acertar a senha e o  ");
            System.out.println("         programa dirá se algum número está correto ou não ");
            System.out.println("     ➤  O jogo acaba quando o jogador acerta a senha completa!");
            System.out.println("     ➤  É preciso digitar números de 1 a 6!");
            System.out.println("               Seja bem vindo ao jogo da senha ✦");
            System.out.println("");
            System.out.println("             Agora, digite a sua primeira tentativa: ");
            System.out.println("");
            System.out.println("----------------------------------------------------------");


        }
    }
}