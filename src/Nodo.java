/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaisen
 */
public class Nodo {
    
    private int valor;
    private Nodo hojaIzq,hojaDer;
    
    public Nodo (int valor)
    {
        this.valor  = valor;
        hojaIzq = hojaDer = null;
        
    }
     public void setValor(int valor)
     {
         this.valor = valor;
     }
     public int getValor()
     {
         return valor;
     }
     public void setHojaIzq(Nodo hojaIzq)
     {
         this.hojaIzq = hojaIzq;
     }
     public Nodo getHojaIzq()
     {
         return hojaIzq;
     }
     public void setHojaDer(Nodo hojaDer)
     {
         this.hojaDer = hojaDer;
     }
     public Nodo getHojaDer()
     {
         return hojaDer;
     }
    
}
