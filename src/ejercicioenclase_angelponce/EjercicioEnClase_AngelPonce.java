package ejercicioenclase_angelponce;

public class EjercicioEnClase_AngelPonce {

    public static void main(String[] args) {
        Editor texteditor = new Editor();
        //"Metiéndole caracteres a la pila de la clase Editor...
        texteditor.getPila().mete('e', texteditor.getPila());
        texteditor.getPila().mete('#', texteditor.getPila());
        texteditor.getPila().mete('#', texteditor.getPila());
        texteditor.getPila().mete('d', texteditor.getPila());
        texteditor.getPila().mete('#', texteditor.getPila());
        texteditor.getPila().mete('c', texteditor.getPila());
        texteditor.getPila().mete('b', texteditor.getPila());
        texteditor.getPila().mete('a', texteditor.getPila());
        
        System.out.println("Mostrando los caracteres antes de ejecutar la función 'Edita'");
        texteditor.getPila().printLista(texteditor.getPila());
        
        //Haciendo uso del método Edita, de la clase Editor...
        texteditor.edita();
        System.out.println("Mostrando los caracteres después de hacer uso de la función 'Edita'");
        texteditor.getPila().printLista(texteditor.getPila());
        texteditor.getPila().anula(texteditor.getPila());//Vaciando la pila
        
        //LLENANDO OTRA PILA
        texteditor.getPila().mete('b', texteditor.getPila());
        texteditor.getPila().mete('@', texteditor.getPila()); //este caracter hará que la pila se vacíe
        texteditor.getPila().mete('a', texteditor.getPila());
        
        System.out.println("\nOTRO INTENTO\nMostrando los caracteres antes de ejecutar la función 'Edita'");
        texteditor.getPila().printLista(texteditor.getPila());
        
        //Haciendo uso de Edita
        texteditor.edita();
        System.out.println("Mostrando los caracteres después de hacer uso de la función 'Edita'");
        texteditor.getPila().printLista(texteditor.getPila());
        
    }
    
}