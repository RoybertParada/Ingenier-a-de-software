package Modelo; 

import java.util.ArrayList;


public class PuntoDeInteres {
    
    private String identificador;
    private String nombre; 
    private String disponibilidad; 
    private ArrayList <Obra> obrasPuntoDeInteresArray = new ArrayList <Obra> (); 
    

    public PuntoDeInteres(String identificador, String nombre, String disponibilidad, ArrayList<Obra> obrasPuntoDeInteresArray) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.obrasPuntoDeInteresArray = obrasPuntoDeInteresArray;
    } 
    
    public ArrayList<Obra> getObrasPuntoDeInteresArray() {
        return obrasPuntoDeInteresArray;
    }
    
    public void setObrasPuntoDeInteresArray(ArrayList<Obra> ObrasPuntoDeInteresArray){
       this.obrasPuntoDeInteresArray = ObrasPuntoDeInteresArray;
    }

    public String getIdentificador() {
        return identificador;
    }
    
    public void setIdentificador(String Identificador){
      this.identificador = Identificador;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }
    
    public void setDisponibilidad(String Disponibilidad){
       this.disponibilidad = Disponibilidad;
    }
}
    
    

