
package ec.edu.espoch.Controlador;

import ec.edu.espoch.Modelo.Archivo;
import ec.edu.espoch.Modelo.Persona;
import ec.edu.espoch.Vista.Ingresar;
import ec.edu.espoch.Vista.MenuPrincipal;
import ec.edu.espoch.Vista.MostrarAgenda;
import java.util.ArrayList;

public class ControladorMenuPrincipal {
    private MenuPrincipal menuPrincipal;
    private Ingresar ingresar;
    private MostrarAgenda mostrarAgenda;
    
    public ControladorMenuPrincipal(MenuPrincipal menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }
    
    public void procesoDireccion(String accion) {

        Archivo.crearArchivo();
        switch (accion) {
            case "Ingresar":
                ingresar = new Ingresar();
                ingresar.setLocationRelativeTo(null);
                ingresar.setVisible(true);
                break;
            case "Listar":
                mostrarAgenda = new MostrarAgenda();
                mostrarAgenda.setLocationRelativeTo(null);
                mostrarAgenda.setVisible(true);
                
                break;
            default:
                throw new AssertionError();
        }

    }

}
