/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

/**
 *
 * @author aniba
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Enteros:
            -byte: 8 bits | byte.MIN_VALUE - BYTE.MAX_VALUE 
            -short:16 bits | short.MIN_VALUE - short.MAX_VALUE
            -int:
            -long:
            
         *Decimales
            -float
            -double
        
         *Caracter:
            -char:
        */
        Byte enteroByte=5;
        System.out.println("enteroByte= "+ enteroByte);
        System.out.println("Valor minimo del tipo Byte:" +Byte.MIN_VALUE);
        System.out.println("Valor maximo del tipo Byte:" +Byte.MAX_VALUE);
        
        Short enteroShort=5;
        System.out.println("enteroShort= "+ enteroShort);
        System.out.println("Valor minimo del tipo Short:" +Short.MIN_VALUE);
        System.out.println("Valor maximo del tipo Short:" +Short.MAX_VALUE);
        
        Integer enteroInt=5;
        System.out.println("enteroInteger= "+ enteroInt);
        System.out.println("Valor minimo del tipo Integer:" +Integer.MIN_VALUE);
        System.out.println("Valor maximo del tipo Integer:" +Integer.MAX_VALUE);
        
        long enterolong=5;
        System.out.println("enterolong= "+ enteroShort);
        System.out.println("Valor minimo del tipo long:" +Long.MIN_VALUE);
        System.out.println("Valor maximo del tipo long:" +Long.MAX_VALUE);
        
        float decimalfloat=5;
        System.out.println("enteroShort= "+ decimalfloat);
        System.out.println("Valor minimo del tipo Float:" +Float.MIN_VALUE);
        System.out.println("Valor maximo del tipo Float:" +Float.MAX_VALUE);
    
        double decimaldouble=5;
        System.out.println("enteroShort= "+ decimaldouble);
        System.out.println("Valor minimo del tipo double:" +Double.MIN_VALUE);
        System.out.println("Valor maximo del tipo double:" +Double.MAX_VALUE);
        
        char caracterchar=5;
        System.out.println("enteroChar= "+ caracterchar);
        System.out.println("Valor minimo del tipo Char:" +Character.MIN_VALUE);
        System.out.println("Valor maximo del tipo Char:" +Character.MAX_VALUE);
    }
    
}
