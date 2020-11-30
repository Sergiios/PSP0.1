
package PSP1;
import java.util.ArrayList;

/**
 * @autor Sergio Santos da Silva
 */
public class MaquinaCafe {
    
    private ArrayList<Integer> Andares = new ArrayList();
    private final ArrayList<Integer> MelhoresAndares = new ArrayList();
    private int MelhorTempo = 0;
    
    public MaquinaCafe(ArrayList<Integer> Andares){
        
        this.Andares = Andares;
        
        for(int i=0; i<this.Andares.size(); i++){
            int time = 0;
            for(int j=0; j<this.Andares.size(); j++){
                time += Math.abs(i-j)*this.Andares.get(j)*2;
            }
            if (MelhorTempo == 0){
                this.MelhorTempo = time;
            }
            if(time<MelhorTempo ){
                this.MelhorTempo = time;
                MelhoresAndares.clear();
                MelhoresAndares.add(i+1);
            }
            else if(time==MelhorTempo){
                MelhoresAndares.add(i+1);
            }
        }
    }
    
    public int GetMelhorTempo(){
        return this.MelhorTempo;
    }
    
    public String GetMelhoresAndares(){
        String aux = "";
        for(int i=0; i<this.MelhoresAndares.size(); i++){
            aux += this.MelhoresAndares.get(i);
            if  (i!=this.MelhoresAndares.size()-1){
                aux += " ";
            }
        }
        return aux;
    }
}
