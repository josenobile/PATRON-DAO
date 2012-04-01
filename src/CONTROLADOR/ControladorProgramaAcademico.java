//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: ControladorProgramaAcademico.java
//
// FECHA:12/03/30
//
// AUTORES:
// Gustavo Adolfo Rodriguez    0932979-3743
// gustalibreros@hotmail.com
//
// José Antonio Nobile Rendón  0747102-2711
// jose.nobile@gmail.com
//
// Roberto Ceballos            0441812-3743
// robertrock2000@gmail.com
//
// ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION
// UNIVERSIDAD DEL VALLE
//*********************************************************
package CONTROLADOR;

//~--- non-JDK imports --------------------------------------------------------
import ACCESO_DATOS.DaoPrograma;

import LOGICA.Programa;
import java.util.ArrayList;

//~--- JDK imports ------------------------------------------------------------

import java.util.Vector;

public class ControladorProgramaAcademico {

    DaoPrograma daoPrograma;
    Programa seleccionadoParaEditar;
    ArrayList<Programa> ultimaConsulta;

    public ControladorProgramaAcademico() {
        daoPrograma = new DaoPrograma();
    }

    public void insertarPrograma(String nombre, String codigo, String nivel, int numCreditos) {
        Programa p = new Programa();

        p.setCodigo(codigo);
        p.setNombre(nombre);
        p.setNivel(nivel);
        p.setCreditos(numCreditos);

        // Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");
        daoPrograma.guardarPrograma(p);
        System.out.println("Se va a insertó  un  nuevo programa");
    }    // end

    public Object[][] consultarProgramas(String codigo, String nombrel, String nivel, String creditos) {

        ultimaConsulta= daoPrograma.consultarProgramas(codigo, nombrel, nivel, creditos);
        Object resultado[][] = new Object[ultimaConsulta.size()][4];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i][0] = ultimaConsulta.get(i).getCodigo().toString();
            resultado[i][1] = ultimaConsulta.get(i).getNombre().toString();
            resultado[i][2] = ultimaConsulta.get(i).getNivel().toString();
            resultado[i][3] = Integer.toString(ultimaConsulta.get(i).getCreditos());
        }
        return resultado;
    }

    public String[] programaSeleccionado(int seleccionado) {
        
        String programa[]= new String[4]; 
        seleccionadoParaEditar=ultimaConsulta.get(seleccionado);
    
        programa[0]=seleccionadoParaEditar.getCodigo();
        programa[1]=seleccionadoParaEditar.getNombre();
        programa[2]=seleccionadoParaEditar.getNivel();
        programa[3]=Integer.toString(seleccionadoParaEditar.getCreditos());
        
        return programa;
        
    }

    public void actualizarPrograma(String nombre, String nivel, int creditos) {
        
        seleccionadoParaEditar.setNombre(nombre);
        seleccionadoParaEditar.setNivel(nivel);
        seleccionadoParaEditar.setCreditos(creditos);  
        
        System.out.println("Dentro del contorlador");
        System.out.println("Progama Seleccionado: ");
        System.out.println("Codigo: "+seleccionadoParaEditar.getCodigo());
        System.out.println("Nombre: "+seleccionadoParaEditar.getNombre());
        System.out.println("Nivel: "+seleccionadoParaEditar.getNivel());
        System.out.println("Creditos: "+seleccionadoParaEditar.getCreditos());
               
        daoPrograma.modificarPrograma(seleccionadoParaEditar);
        
    }

    

}


//~ Formatted by Jindent --- http://www.jindent.com
