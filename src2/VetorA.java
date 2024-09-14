import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int tvetor = 10;
        int[] vetorA = new int[tvetor];
        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (int i = 0; i < tvetor; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetorA[i] = ler.nextInt();
        }

        int numero;
        do {
            System.out.print("Digite um número (0 p/sair): ");
            numero = ler.nextInt();

            if (numero != 0) {
                int cont = 0;
                for (int i = 0; i < tvetor; i++) {
                    if (vetorA[i] == numero) {
                        cont++;
                    }
                }
                System.out.println("O número " + numero + " aparece " + cont + " vezes no vetor A.");
            }

        } while (numero != 0);
    }
}
