
package ec.edu.espoch.Controlador;


import ec.edu.espoch.Modelo.Archivo;
import static ec.edu.espoch.Modelo.Archivo.leerArchivo;
import ec.edu.espoch.Modelo.Persona;
import ec.edu.espoch.Vista.MostrarAgenda;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ControladorListar {
   private MostrarAgenda mostrarAgenda;
   private Persona persona;
  
   
    public ControladorListar(MostrarAgenda mostrarAgenda) {
        this.mostrarAgenda = mostrarAgenda;
        this.persona = new Persona(); 
    }

    public void procesoListar() {
        
       ArrayList<Persona> personas = Archivo.leerArchivo(); 

        DefaultTableModel modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Cédula");
        modeloTabla.addColumn("Tipo Evento");
        modeloTabla.addColumn("Fecha Evento");
        modeloTabla.addColumn("Hora");
        modeloTabla.addColumn("Lugar");

    
        for(Persona p : personas){
            Object[] fila = {p.getNombre(), p.getApellido(), p.getCedula(), 
                      p.getTipoDeEvento(), p.getFechaDelEvento(),
                      p.getHora(), p.getLugar()};
            modeloTabla.addRow(fila); 
        }
        
       mostrarAgenda.mostrar(personas);
    }
}
   

