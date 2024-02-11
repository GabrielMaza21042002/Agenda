
package ec.edu.espoch.Vista;

import ec.edu.espoch.Controlador.ControladorListar;
import ec.edu.espoch.Modelo.Archivo;
import ec.edu.espoch.Modelo.Persona;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hola
 */
public class MostrarAgenda extends javax.swing.JFrame {
    
    private ControladorListar listar;
    
    public MostrarAgenda() {
        initComponents();
        listar = new ControladorListar(this);
        listar.procesoListar();
    }
    
    public void mostrar(ArrayList<Persona> personas) {
              
       JFrame objListar = new JFrame("Mostrar datos de archivo en JTable");
        
        JTable datosPersonas = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Nombre", "Apellido", "Cedula", "Tipo De Evento", "Fecha del Evento", "Hora", "Lugar"});

        datosPersonas.setModel(model);        
        objListar.add(datosPersonas);
        objListar.setSize(500, 400);
        objListar.setVisible(true);
       
    }
    
    
    public ArrayList<Persona> listarPersonas() {

    ArrayList<Persona> personas = Archivo.leerArchivo();

    return personas;

}
    
    
    
    
    
    
    
    
    

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
