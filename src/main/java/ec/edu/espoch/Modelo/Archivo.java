package ec.edu.espoch.Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    private static final String nombreArchivo = "C:\\Users\\Hola\\OneDrive - ESCUELA SUPERIOR POLITECNICA DE CHIMBORAZO\\Escritorio\\Agenda.txt";

    public static void crearArchivo() {
        File archivo = new File(nombreArchivo);
        try {
            if (!archivo.exists()) {
                PrintWriter salida = new PrintWriter(archivo);
                salida.close();
                System.out.println("El archivo se ha creado correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static boolean escribirArchivo() {
        boolean verificar = false;
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            String contenido = "";
            salida.println(contenido);
            salida.close();
            verificar = true;
        } catch (FileNotFoundException ex) {
            verificar = false;
            ex.printStackTrace(System.out);
        }
        return verificar;
    }

    public static ArrayList<Persona> leerArchivo() {
        ArrayList<Persona> personas = new ArrayList<>();
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {
            String[] datos = lectura.split(";");
                Persona objPersona = new Persona();
                objPersona.setNombre(datos[0]);
                objPersona.setApellido(datos[1]);
                objPersona.setCedula(datos[2]);
                objPersona.setTipoDeEvento(datos[3]);
                objPersona.setFechaDelEvento(datos[4]);
                objPersona.setHora(datos[5]);
                objPersona.setLugar(datos[6]);
                
                personas.add(objPersona);

                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return personas;
    }

    public static String anexarArchivo(String nombre, String apellido, String cedula, String tipoDeEvento, String fechaDelEvento, String hora, String lugar) {
        File archivo = new File(nombreArchivo);
        String verificar ;
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "" + nombre + " " + apellido + " ; " + cedula + " ; " + tipoDeEvento + " ; " + fechaDelEvento + " ; " + hora + " ; " + lugar ;
            salida.println(contenido);
            salida.close();
            verificar = "Registro correcto";
        } catch (FileNotFoundException ex) {
            verificar = "Error, al acceder al archivo";
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            verificar = "Error, escribir en el archivo";
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return verificar;
    }
}
