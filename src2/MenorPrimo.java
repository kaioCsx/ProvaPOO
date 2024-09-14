import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        int vetor[] = new int[50];
        int vp[] = new int[50];
        int qtd = 0;
        int mp = 0;
        int primo = 0; 
        int valor;
        int cont = 0; 
        int menor = 0;
        boolean achou;
        do {
            System.out.print("Quantos elementos (<50): ");
            qtd = ler.nextInt();
        } while ((qtd <= 0) | (qtd > 50));
        System.out.print("\n");
        for (int i = 0; i < qtd; i++) {
            System.out.print("Escreva o " + (i+1) + " elemento do vetor: ");
            valor = ler.nextInt();
            achou = false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] == valor) {
                    achou = true;
                }
            }
            if (!achou) {
                vetor[i] = valor;
            } else {
                i--;
            }
        }
        for (int i = 0; i < qtd; i++) {
            valor = vetor[i];
            cont = 0;
            for (int x = 1; x <= valor; x++) {
                if ((valor % x) == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                achou = false;
                for (int j = 0; j < i; j++) {
                    if (vp[j] == valor) {
                        achou = true;
                    }
                }
                if (!achou) {
                    vp[primo] = valor;
                    primo++;
                } else {
                    i--;
                }
            }
        }
        System.out.print("\nElementos primos: \n");
        for (int i = 0; i < primo; i++) {
            System.out.print(vp[i] + " | ");
        }
        System.out.print("\n");
        menor = vp[0];
        for (int i = 1; i < primo; i++) {
            if (vp[i] < menor) {
                menor = vp[i];
            }
        }
        System.out.print("\nO menor primo é " + menor);
    }
}
