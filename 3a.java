package eze;

import java.util.Scanner;

public class Eze {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][10];
        int i, j;

        for (i = 0; i < 3; i++) { //linha
            for (j = 0; j < 10; j++) { //coluna
                matriz [i][j] = j;
            }

        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 10; j++) {
                System.out.print(matriz [i][j] + "\t");
            }
            System.out.println("");
        }
        

        
        
        }
    }
    
    
    
    
   
    
    
  
}
