
package com.mycompany.ej2;

public class Automovil {
    
    
    

public enum TipoCombustible {
    Bioetanol, Diesel, Biodiesel, GasNatural    
}

public enum Color {
    Blanco, Negro, Rojo, Naranja, Amarillo, Verde, Azul, Violeta   
}

public enum TipoAutomovil {
    Subcompacto, Compacto, Familiar, Ejecutivo, SUV
}

    //Atributos
    private String Marca;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private Color color;
    private int CantidadAsientos, VelocidadMax, VelocidadActual, Modelo, NumeroPuertas;
    private double Motor;
    
    //Constructor
    public Automovil(String Marca, int Modelo, double Motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int NumeroPuertas, int CantidadAsientos, int VelocidadMax, Color color){
        
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Motor = Motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.NumeroPuertas = NumeroPuertas;
        this.color = color;
        this.CantidadAsientos = CantidadAsientos;
        this.VelocidadMax = VelocidadMax;
        this.VelocidadActual = 0;  
    }

    //Metodos Setter y Getter para todos loa atributos
    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getModelo() {
        return Modelo;
    }

    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    public double getMotor() {
        return Motor;
    }

    public void setMotor(double Motor) {
        this.Motor = Motor;
    }

    public int getNumeroPuertas() {
        return NumeroPuertas;
    }

    public void setNumeroPuertas(int NumeroPuertas) {
        this.NumeroPuertas = NumeroPuertas;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCantidadAsientos() {
        return CantidadAsientos;
    }

    public void setCantidadAsientos(int CantidadAsientos) {
        this.CantidadAsientos = CantidadAsientos;
    }

    public int getVelocidadMax() {
        return VelocidadMax;
    }

    public void setVelocidadMax(int VelocidadMax) {
        this.VelocidadMax = VelocidadMax;
    }

    public int getVelocidadActual() {
        return VelocidadActual;
    }

    public void setVelocidadActual(int VelocidadActual) {
        this.VelocidadActual = VelocidadActual;
    }
    
    
  // Método para acelerar
    public void acelerar(int velocidad) {
        if (VelocidadActual + velocidad <= VelocidadMax) {
           VelocidadActual += velocidad;
            System.out.println("El automóvil ha acelerado a " + VelocidadActual + " km/h");
        } else {
            System.out.println("No se puede acelerar más allá de la velocidad máxima permitida");
        }
    }

    // Método para desacelerar
    public void desacelerar(int velocidad) {
        if (VelocidadActual - velocidad >= 0) {
            VelocidadActual -= velocidad;
            System.out.println("El automóvil ha desacelerado a " + VelocidadActual + " km/h");
        } else {
            System.out.println("No se puede desacelerar a una velocidad negativa");
        }
    }

    // Método para frenar
    public void frenar() {
        VelocidadActual = 0;
        System.out.println("El automóvil ha frenado completamente");
    }
    
    //Metodo para Calcular el Tiempo
    public double CalcularTiempoEstimado(double distancia) {
        if (VelocidadActual == 0) {
            System.out.println("El vehículo está detenido. No se puede calcular el tiempo estimado.");
            return -1; // Devolver un valor negativo para indicar un error
        } else {
            return distancia / VelocidadActual;
        }
    }
    //Metodo para Mostrar Informacion
    public void MostrarInformacion(){
        
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Motor: " + Motor + "L");
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de automóvil: " + tipoAutomovil);
        System.out.println("Número de puertas: " + NumeroPuertas);
        System.out.println("Cantidad de asientos: " + CantidadAsientos);
        System.out.println("Velocidad máxima: " + VelocidadMax + " km/h");
        System.out.println("Color: " + color);
    }
    
}
