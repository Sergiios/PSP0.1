
package PSP1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @autor Sergio Santos da Silva
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> Andares = new ArrayList();
        
        System.out.print("Digite a quantidade de andares:");
        int QtAndares = input.nextInt();
        System.out.println("Digite a quantidade de funcionarios de cada andar");
        for(int i=0; i<QtAndares; i++){
            Andares.add(input.nextInt());
        }
        
        MaquinaCafe SBC = new MaquinaCafe(Andares);
        
        System.out.println(SBC.GetMelhorTempo());
        System.out.println(SBC.GetMelhoresAndares());
       
        
    }
    
}
