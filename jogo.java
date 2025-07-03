public class jogo {
 
    public static void imprimirTabuleiro(char[][] tabuleiro) {
        limparTela();
        System.out.println();
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("\t" + tabuleiro[linha][coluna]);
                if (coluna < 2) {
                    System.out.print("\t|");
                }
            }
            System.out.println();
            if (linha < 2) {
                System.out.println("\t-------------------------------------");
            }
        }
        System.out.println();
    }
 
    public static void limparTela() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.println("Erro ao tentar limpar a tela");
        }
    }
 
   public static void main(String[] args) {
    char[][] matriz = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };
 
    System.out.println("### JOGO DA VELHA ###");
 
   
 
    matriz[2][1] = " ";
    
    imprimirTabuleiro(matriz);
}
}
 