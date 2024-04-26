
package com.mycompany.ej3;

public class Libro {
    
    //Atributos
    private int Codigo;
    public String Titulo;
    public String Autor;
    public int NumeroPaginas;

    //Contructor 
    public Libro(int Codigo, String Titulo, String Autor, int NumeroPaginas){
        
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumeroPaginas = NumeroPaginas;
    }
    
    //Metodos Getter Y Setter para cada atributo
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }
    
    
    //Metodo para MostrarINformacion
    public void MostrarInformacion(){
        
        System.out.println("El libro " + Codigo + " Creado por el autor " + Autor + " tiene " + NumeroPaginas + " Paginas\n");
        
    }
    
}
