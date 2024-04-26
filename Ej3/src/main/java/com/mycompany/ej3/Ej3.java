
package com.mycompany.ej3;

public class Ej3 {

    public static void main(String[] args) {
    
        //Objetos de Libro
        Libro L1= new Libro(323, "Teoria de la Relatividad", "Albert Einstein", 432);
        Libro L2= new Libro(544, "Psicologia Oscura", "Nicollo Maquiavelo", 543);
        
        System.out.println("Datos del libro #1");
        L1.MostrarInformacion();
        
        System.out.println("Datos del libro #2");
        L2.MostrarInformacion();
        
        if (L1.getNumeroPaginas() > L2.getNumeroPaginas()) {
            System.out.println("El libro #1 tiene mas paginas");
            
        } else {
            System.out.println("El libro #2 tiene mas paginas");
        }
        
        
    }
}
