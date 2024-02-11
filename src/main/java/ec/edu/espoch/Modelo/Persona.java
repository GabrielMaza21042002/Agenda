
package ec.edu.espoch.Modelo;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String tipoDeEvento;
    private String fechaDelEvento;
    private String hora;
    private String lugar;
    //Constructor
    public Persona() {
    }
    // metodos set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(String tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }

    public String getFechaDelEvento() {
        return fechaDelEvento;
    }

    public void setFechaDelEvento(String fechaDelEvento) {
        this.fechaDelEvento = fechaDelEvento;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    
    public String ingresarDatos(){
        
        return Archivo.anexarArchivo(this.nombre, this.apellido, this.cedula, this.tipoDeEvento, this.fechaDelEvento, this.hora, this.lugar);
      
    }
    public ArrayList<Persona> mostrarDatos(){
         return Archivo.leerArchivo();
      
    }
}
