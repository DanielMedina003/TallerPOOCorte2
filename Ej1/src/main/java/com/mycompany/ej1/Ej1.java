
package com.mycompany.ej1;

public class Ej1 {

    public static void main(String[] args) {
        
        //Objetos 
        Persona Persona1 = new Persona("Daniel","Medina",1061706353,2006);
        Persona Persona2 = new Persona("Julian","Rivera",1061702827,2005);
        
        System.out.println("Datos de la Persona 1:\n");
        Persona1.ImprimirDatos();
        
        System.out.println("Datos de la Persona 2:\n");
        Persona2.ImprimirDatos();
    }
}
