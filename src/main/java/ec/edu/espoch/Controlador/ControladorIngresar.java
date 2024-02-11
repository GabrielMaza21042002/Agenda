
package ec.edu.espoch.Controlador;

import ec.edu.espoch.Modelo.Persona;
import ec.edu.espoch.Vista.Ingresar;
import ec.edu.espoch.Vista.MenuPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControladorIngresar {
    private Ingresar ingresar;
    private Persona persona;

    public ControladorIngresar(Ingresar ingresar) {
        this.ingresar = ingresar;
        this.persona = new Persona();
        
    }
    
     public void procesoIngresar() {
        if (validarDatos()) {
            // Procede a guardar los datos
            persona.setNombre(ingresar.getNombre());
            persona.setApellido(ingresar.getApellido());
            persona.setCedula(ingresar.getCedula());
            persona.setTipoDeEvento(ingresar.getTipoDeEvento());
            persona.setFechaDelEvento(ingresar.getFechaDelEvento());
            persona.setHora(ingresar.getHora());
            persona.setLugar(ingresar.getLugar());

            String mensaje = persona.ingresarDatos();
            ingresar.mostrarResultado(mensaje);
            ingresar.mostrarMensajeError("");
        }
    }

    public void limiparCamposTexto() {
       this.ingresar.limpiarCamposTexto();
    }
   
    private boolean validarDatos() {
        // Validar nombre
        if (ingresar.getNombre().isEmpty()) {
            ingresar.mostrarMensajeError("Ingrese el nombre");
            return false;
        }

        // Validar apellido
        if (ingresar.getApellido().isEmpty()) {
            ingresar.mostrarMensajeError("Ingrese el apellido");
            return false;
        }

        // Validar cédula
        if (ingresar.getCedula().isEmpty()) {
            ingresar.mostrarMensajeError("Ingrese la cédula");
            return false;
        }

        return true;
    }
   
}
