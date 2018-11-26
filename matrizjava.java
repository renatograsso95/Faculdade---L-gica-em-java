package exe1;

import java.util.Scanner;

public class EXE1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        int i, j;
        int contador = 0;

        System.out.println("== Entrada ==");
        System.out.println("Digite 16 valores");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 10) {
                    contador++;
                }
            }
        }
        System.out.println("== exibição dos valores ==");
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz [i][j] + "\t");
                
            }
            System.out.println("");
        }
        
        
     
         
            System.out.println("total de elementos maiores que 10 é: " + contador  );

            
        }
        
        
}


