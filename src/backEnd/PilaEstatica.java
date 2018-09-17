/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

import javax.swing.JOptionPane;

/**
 *
 * @author 1072734943
 */
public class PilaEstatica {
    private int []informacion;
    private int tope;
    
    /**
     * Constructor de la clase
     * Inicializa los atributos tope 
     * para dejar la pila vacia y genera
     * el arreglo
     */
    public PilaEstatica(){
        tope = -1;
        informacion = new int[10];
    }
    
    /**
     * Constructor de la clase
     * Inicializa los atributos tope 
     * para dejar la pila vacia y genera
     * el arreglo de n elementos
     * @param n es el número de elementos que tendrá el arreglo
     */
    public PilaEstatica(int n){
        tope = -1;
        informacion = new int[n];
    }

    /**
     * @return the informacion
     */
    public int[] getInformacion() {
        return informacion;
    }

    /**
     * @param informacion the informacion to set
     */
    public void setInformacion(int[] informacion) {
        this.informacion = informacion;
    }

    /**
     * @return the tope
     */
    public int getTope() {
        return tope;
    }

    /**
     * @param tope the tope to set
     */
    public void setTope(int tope) {
        this.tope = tope;
    }
    
    /**
     * Esta función regresa True si la pila esta vacía,
     * en caso contrario retorna False
     * @return true si esta vacía, false en caso contrario
     */
    public boolean pilaVacia(){
        if(tope==-1)
            return true;
        else
            return false;
    }
    
    /**
     * Esta función regresa True si la pila esta llena,
     * en caso contrario retorna False
     * @return true si esta llena, false en caso contrario
     */
    public boolean pilaLlena(){
        if(tope==informacion.length-1)
            return true;
        else
            return false;
    }

/**
 * Este método elimina un elemento de la pila.
 * Actualiza el valor del tope
 * Si regresa -9999 ocurrió un Underflow
 * @return regresa el valor del elemento borrado 
 */    
    public int pop(){
        if (!pilaVacia()){            
            return informacion[tope--];
        }else
            return -9999;
    }
    
    /**
     * Este método agrega un elemento a la Pila
     * @param dato es el elemento a agregar en la Pila
     */
    public void push(int dato){
        if (!pilaLlena()){
            tope++;
            informacion[tope]=dato;
        }else
            JOptionPane.showMessageDialog(null,"Error. Overflow");
    }
    
    public String imprime(){
        String cadena="<html>";
        
        for (int i=tope; i>-1; i--)
            cadena+=informacion[i]+"<br>";
        cadena+="</html>";
        return cadena;
    }
}
