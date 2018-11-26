package pkg3d;

import java.util.Scanner;

/**
 *
 * @author lab212
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[9][6];
        int i,j;
        int cont = 0;
        
        for (i = 0; i < 9; i++) { //linha
            for (j = 0; j < 6; j++) { //coluna
                if(matriz[i][j]  == 0) {
                    
                    matriz [i][j] =  cont%2;
                }

                matriz[i][j] = i;
            }

        }
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");

        }

    }
}
