package ejercicioenclase_angelponce;

import java.util.ArrayList;


public class Lista {
    protected ArrayList lista = new ArrayList();
    
    
    /*public void purga(Lista L){
        
        for (int i = 0; i < L.getLista().size(); i++) {
            int cont  = 0;
            for(int j=0; j < L.getLista().size(); j++){
                if(L.getLista().get(i)==L.getLista().get(j)){
                    cont++;
                    if(cont>=2){
                        L.getLista().remove(j);
                    }
                }
            }
        }
    }*/
    
    public void printLista(Lista L){
        for (int i = 0; i < L.getLista().size(); i++) {
            System.out.println(L.getLista().get(i));
        }
        //System.out.println();
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }
    
    public void inserta(Object x, int p, Lista L){
        L.getLista().add(p,x);
    }
    
    int primero(Lista L){
        if(L.getLista().isEmpty()){
            return 0;
        }
        return L.getLista().indexOf(L.getLista().get(0));
    }
    
    public void anula(Lista L){
        L.getLista().clear();
    }
    
}
