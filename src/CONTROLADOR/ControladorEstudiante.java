//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: ControladorEstudiante.java
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

import ACCESO_DATOS.DaoEstudiante;
import ACCESO_DATOS.DaoPrograma;
import LOGICA.Estudiante;
import LOGICA.Programa;
import java.util.ArrayList;

public class ControladorEstudiante {

    DaoEstudiante daoEstudiante;
    Programa seleccionarPrograma;
    ArrayList<Estudiante> ultimaConsulta;

    public ControladorEstudiante() {
        daoEstudiante = new DaoEstudiante();
    }

    public String insertarEstudiante(String codigo, String nombre, String sexo, String programa) {

        if (!nombre.isEmpty() && !codigo.isEmpty() && !sexo.isEmpty() && !programa.isEmpty()) {
            Estudiante estudiante = new Estudiante();
            estudiante.setCodigo(codigo);
            estudiante.setNombre(nombre);
            estudiante.setSexo(sexo.toCharArray()[0]);
            estudiante.setPrograma(new DaoPrograma().consultarPrograma(programa.split(" -")[0]));

            System.out.println("Codigo Programa: " + estudiante.getPrograma().getCodigo());
            if (daoEstudiante.guardarEstudiante(estudiante)==-1) {
             return "No es posible registrar el Estudiante:\n"
                     + "(1) Verifique la conexion con la base de datos no tenga problemas.\n"
                     + "(2) O que el Estudiante no se encuentre ya registrado";  
            }
            System.out.println("Se insertó un nuevo programa");
            return "OK";
        } else {
        }
        return "Es necesario ingresar la informacion de todos los campos";
    }

    public String[] cargarProgramas() {

        ArrayList<Programa> programas = new DaoPrograma().consultarProgramas("", "", "", "");
        String[] programasRegistrados = new String[programas.size() + 1];

        programasRegistrados[0] = "";
        for (int i = 0; i < programas.size(); i++) {
            programasRegistrados[i + 1] = programas.get(i).getCodigo() + " - " + programas.get(i).getNombre();
            System.out.println(i + " " + programasRegistrados[i + 1]);
        }
        return programasRegistrados;
    }
    public Object[][] consultarEstudiantes(String codigo, String nombre, String sexo, String programa) {
        
        ultimaConsulta = daoEstudiante.consultarEstudiantes(codigo, nombre, sexo, programa);
        Object resultado[][] = new Object[ultimaConsulta.size()][4];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i][0] = ultimaConsulta.get(i).getCodigo().toString();
            resultado[i][1] = ultimaConsulta.get(i).getNombre().toString();
            resultado[i][2] = (ultimaConsulta.get(i).getSexo()=='M')? "Masculino" : "Femenino";
            resultado[i][3] = (ultimaConsulta.get(i).getPrograma().getCodigo());
        }
        return resultado;
    }
//
//    public String[] seleccionarPrograma(int seleccionado) {
//
//        String programa[] = new String[4];
//        seleccionarPrograma = ultimaConsulta.get(seleccionado);
//
//        programa[0] = seleccionarPrograma.getCodigo();
//        programa[1] = seleccionarPrograma.getNombre();
//        programa[2] = seleccionarPrograma.getNivel();
//        programa[3] = Integer.toString(seleccionarPrograma.getCreditos());
//
//        return programa;
//    }
//
//    public String actualizarPrograma(String nombre, String nivel, String creditos) {
//
//        if (!nombre.isEmpty() && !nivel.isEmpty() && !creditos.isEmpty()) {
//            
//            seleccionarPrograma.setNombre(nombre);
//            seleccionarPrograma.setNivel(nivel);
//            try {
//                seleccionarPrograma.setCreditos(Integer.parseInt(creditos));
//            } catch (NumberFormatException numberFormatException) {
//                return "Valor invalido para el numero de creditos. Éste debe ser un numero entero positivo";
//            }
//            daoEstudiante.modificarPrograma(seleccionarPrograma);
//
//            return "OK";
//        } else {
//            return "Es necesario ingresar la informacion de todos los campos";
//        }
//    }
//
//    public void eliminarPrograma() {
//        daoEstudiante.eliminarPrograma(seleccionarPrograma);
//    }
}