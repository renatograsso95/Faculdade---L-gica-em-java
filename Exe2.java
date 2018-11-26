package exe2;
import java.util.Scanner;

public class Exe2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int i,j;
        
        for (i = 0; i < 5; i++) { //linha
            for (j = 0; j < 5; j++) { //coluna
                if(i == j){
                    matriz[i][j] = 1;
                }else{
                    matriz [i][j] = 0;
                }
            }
        }
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(matriz [i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}
