
package com.mycompany.ej2;

import com.mycompany.ej2.Automovil.Color;
import com.mycompany.ej2.Automovil.TipoAutomovil;
import com.mycompany.ej2.Automovil.TipoCombustible;

public class Ej2 {

    public static void main(String[] args) {
        
           //obeto
       Automovil miAuto = new Automovil("Toyota", 2022, 2.0, TipoCombustible.Diesel, TipoAutomovil.Ejecutivo, 4, 5, 180, Color.Negro);
       
        miAuto.setVelocidadActual(50);
        miAuto.MostrarInformacion();
        miAuto.acelerar(50);
        miAuto.desacelerar(10);
        miAuto.frenar();
        
        double distancia = 200; // Supongamos una distancia de 200 km
        double tiempoEstimado = miAuto.CalcularTiempoEstimado(distancia);
        if (tiempoEstimado >= 0) {
            System.out.println("El tiempo estimado de llegada es: " + tiempoEstimado + " horas.");
        }
    }
}
