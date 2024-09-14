import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a frase (máximo de 44 posições, '#' para encerrar):");
        String frase = leitura.nextLine();
        char[] vetorFrase = new char[44];
        int tamanhoFrase = 0;
        for (int i = 0; i < frase.length() && frase.charAt(i) != '#'; i++) {
            vetorFrase[i] = frase.charAt(i);
            tamanhoFrase++;
        }
        int inicio = 0;
        while (inicio < tamanhoFrase && vetorFrase[inicio] == '_') {
            inicio++;
        }
        int fim = tamanhoFrase - 1;
        while (fim >= 0 && vetorFrase[fim] == '_') {
            fim--;
        }
        boolean espacoAnterior = false;
        for (int i = inicio; i <= fim; i++) {
            if (vetorFrase[i] == '_') {
                if (!espacoAnterior) {
                    System.out.print(vetorFrase[i]);
                    espacoAnterior = true;
                }
            } else {
                System.out.print(vetorFrase[i]);
                espacoAnterior = false;
            }
        }

        leitura.close();
    }
}
