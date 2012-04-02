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

import ACCESO_DATOS.DaoPrograma;
import LOGICA.Programa;
import java.util.ArrayList;

public class ControladorProgramaAcademico {

    DaoPrograma daoPrograma;
    Programa seleccionarPrograma;
    ArrayList<Programa> ultimaConsulta;

    public ControladorProgramaAcademico() {
        daoPrograma = new DaoPrograma();
    }

    public String insertarPrograma(String nombre, String codigo, String nivel, String numCreditos) {

        if (!nombre.isEmpty() && !codigo.isEmpty() && !nivel.isEmpty() && !numCreditos.isEmpty()) {
            Programa p = new Programa();
            p.setCodigo(codigo);
            p.setNombre(nombre);
            p.setNivel(nivel);
            try {
                p.setCreditos(Integer.parseInt(numCreditos));
            } catch (NumberFormatException numberFormatException) {
                return "Valor invalido para el numero de creditos. Éste debe ser un numero entero positivo";
            }
            daoPrograma.guardarPrograma(p);
            System.out.println("Se va a insertó  un  nuevo programa");
            return "OK";
        } else {
        }
        return "Es necesario ingresar la informacion de todos los campos";
    }

    public Object[][] consultarProgramas(String codigo, String nombrel, String nivel, String creditos) {

        if (!creditos.isEmpty()) {
            try {
                Integer.parseInt(creditos);
            } catch (NumberFormatException numberFormatException) {
                return null;
            }
        }
        
        ultimaConsulta = daoPrograma.consultarProgramas(codigo, nombrel, nivel, creditos);
        Object resultado[][] = new Object[ultimaConsulta.size()][4];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i][0] = ultimaConsulta.get(i).getCodigo().toString();
            resultado[i][1] = ultimaConsulta.get(i).getNombre().toString();
            resultado[i][2] = ultimaConsulta.get(i).getNivel().toString();
            resultado[i][3] = Integer.toString(ultimaConsulta.get(i).getCreditos());
        }
        return resultado;
    }

    public String[] seleccionarPrograma(int seleccionado) {

        String programa[] = new String[4];
        seleccionarPrograma = ultimaConsulta.get(seleccionado);

        programa[0] = seleccionarPrograma.getCodigo();
        programa[1] = seleccionarPrograma.getNombre();
        programa[2] = seleccionarPrograma.getNivel();
        programa[3] = Integer.toString(seleccionarPrograma.getCreditos());

        return programa;
    }

    public String actualizarPrograma(String nombre, String nivel, String creditos) {

        if (!nombre.isEmpty() && !nivel.isEmpty() && !creditos.isEmpty()) {
            
            seleccionarPrograma.setNombre(nombre);
            seleccionarPrograma.setNivel(nivel);
            try {
                seleccionarPrograma.setCreditos(Integer.parseInt(creditos));
            } catch (NumberFormatException numberFormatException) {
                return "Valor invalido para el numero de creditos. Éste debe ser un numero entero positivo";
            }
            daoPrograma.modificarPrograma(seleccionarPrograma);

            return "OK";
        } else {
            return "Es necesario ingresar la informacion de todos los campos";
        }
    }

    public void eliminarPrograma() {
        daoPrograma.eliminarPrograma(seleccionarPrograma);
    }
}