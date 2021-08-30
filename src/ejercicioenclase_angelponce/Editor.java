package ejercicioenclase_angelponce;

public class Editor {
    private Pila pila = new Pila();
    
    public void edita(){
        boolean bool = false;
        int i = 0;
        
        while(bool!=true){ //a,b,c,#,d,#,#,e
            if(pila.getLista().get(i).equals('#')){
                pila.getLista().remove(i);
                pila.getLista().remove(i-1);
                i = i-1;
                
            }
            else if(pila.getLista().get(i).equals('@')){
                pila.anula(pila);
                break;
            }
            else{
                i++;
            }
            
            for(int j=0; j<pila.getLista().size(); j++){
                if(pila.getLista().get(j).equals('#') || pila.getLista().get(j).equals('@')){
                    bool = false;
                    break;
                }
                else{
                    bool = true;
                }
            }
        }
    }
    
    public Pila getPila() {
        return pila;
    }

    public void setPila(Pila p) {
        this.pila = p;
    }
    
    
}
