
package com.mycompany.ej1;

public class Persona {
    
    //Atributos
    private String Nombre;
    private String Apellido;
    private int ID;
    private int AñoNacimiento;
    
    //Constructor
    public Persona(String Nombre, String Apellido, int ID, int AñoNacimiento){
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ID = ID;
        this.AñoNacimiento = AñoNacimiento;         
      }
    
    //Metodo Imprimir Atributos    
    public void ImprimirDatos(){
        
        System.out.println("Nombre: " + Nombre + "Apellido: " + Apellido);
        System.out.println("Apellido: " + Apellido);
        System.out.println("ID: " + ID);
        System.out.println("Año de Nacimiento: " + AñoNacimiento + "\n");
    }   
    
}
