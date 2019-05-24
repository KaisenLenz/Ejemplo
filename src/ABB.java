/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kaisen
 */
public class ABB {

    Nodo raiz;
    
    public ABB()
    {
        raiz = null;      
    }
    
    public void insertar(int valor)
    {
        raiz = insertarReco(raiz,valor);
    }
    
    public Nodo insertarReco(Nodo raiz , int valor)
    {
        if(raiz == null)
        {
            raiz = new Nodo(valor);
            System.out.println("***El dato "+valor+" se va ingresar a un arbol vacio***");
            return raiz;
        }
        if(valor < raiz.getValor())
        {
            raiz.setHojaIzq(insertarReco(raiz.getHojaIzq(),valor));
        }
        else if (valor >= raiz.getValor())
        {
            raiz.setHojaDer(insertarReco(raiz.getHojaDer(),valor));
        }
        System.out.println("***Se a agregado el dato "+valor+" al arbol ***");
        return raiz;
        
    }
    
    
    
    public void buscar(int dato)
    {
        buscarReco(raiz,dato);
    }
    public void buscarReco(Nodo actual, int dato)
    {
        if(actual == null)
        {
            System.out.println("***No se encontro el valor "+dato+" dentro del arbol***");
        }
        
        else
        if(dato == actual.getValor())
        {
            System.out.println("***Se encotro el valor "+dato+" dentro del arbol***");
        }
        else 
        {    
            if (dato < actual.getValor())
            {
                buscarReco(actual.getHojaIzq(),dato);
            }
            if(dato > actual.getValor())
            {
                buscarReco(actual.getHojaDer(),dato);               
            }
        }
        
    }
    
    public void eliminar(int dato)
    {
        raiz = eliminarReco(raiz,dato);
    }
    
    public Nodo eliminarReco(Nodo actual, int dato)
    {
        if(actual == null)
        {
            return null;
        }
        if (dato == actual.getValor())
        {
            if(actual.getHojaDer()==null && actual.getHojaIzq()==null)//nodo a eliminar no tiene hijos
            {
                return null;
            }
            
            if(actual.getHojaIzq()== null) // nodo a eliminar tiene un hijo
            {
                return actual.getHojaDer();
            }
            
            if(actual.getHojaDer()== null)
            {
                return actual.getHojaIzq();
            }
            int sucesor = buscarSucesor(actual.getHojaDer());
            actual.setValor(sucesor);
            actual.setHojaDer(eliminarReco(actual.getHojaDer(),sucesor));
            return actual;
            
            
            
        }
        if(dato < actual.getValor())
        {
            actual.setHojaIzq(eliminarReco(actual.getHojaIzq(),dato));
            return actual;
        }
        actual.setHojaDer(eliminarReco(actual.getHojaDer(),dato));
        return actual;
    }
    
    
    
    private int buscarSucesor(Nodo raiz)
    {
        return raiz.getHojaIzq() == null ? raiz.getValor() : buscarSucesor(raiz.getHojaIzq());
    }
    
    
    public void inorden()
    {
        inordenReco(raiz);
    }
    
    public void inordenReco(Nodo raiz)
    {
        if(raiz != null)
        {
            
            inordenReco(raiz.getHojaIzq());
            System.out.println(raiz.getValor());
            inordenReco(raiz.getHojaDer());
            
        }
    }
    
}
