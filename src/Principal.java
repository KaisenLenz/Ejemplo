/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaisen
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ABB arbol = new ABB();
        
        /*
        arbol.insertar(50);
        arbol.insertar(7);
        arbol.insertar(6);
        arbol.insertar(2);
        arbol.insertar(2);
        arbol.insertar(79);
        arbol.buscar(2);
        */
        arbol.insertar(10);
       arbol.insertar(20);
       arbol.insertar(30);
       arbol.insertar(40);
       arbol.insertar(50);
       arbol.insertar(25);
        
        
        
        //arbol.eliminar(50);
        arbol.inorden();
        
        
    }
    
}
