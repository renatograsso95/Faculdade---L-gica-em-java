package ex4b;

import java.util.Scanner;

/**
 *
 * @author lab212
 */
public class Ex4b {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, j;

        int matriz[][] = new int[5][10];

        for (i = 0; i < 5; i++) { //linha
            for (j = 0; j < 10; j++) { //coluna
                matriz[i][j] = j * j;
            }

        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");

        }

    }
}
