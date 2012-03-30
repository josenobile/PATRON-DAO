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

//~--- non-JDK imports --------------------------------------------------------

import ACCESO_DATOS.DaoEstudiante;
import ACCESO_DATOS.DaoPrograma;

import LOGICA.Estudiante;
import LOGICA.Programa;

public class ControladorEstudiante {
    DaoEstudiante daoEstudiante;

    public ControladorEstudiante() {
        daoEstudiante = new DaoEstudiante();
    }

    public void insertarEstudiante(String codigo, String nombre, String sexo, String codPrograma) {
        Estudiante e        = new Estudiante();
        Programa   programa = new DaoPrograma().consultarPrograma(codPrograma);
        char       sex      = sexo.toCharArray()[0];

        e.setCodigo(codigo);
        e.setNombre(nombre);
        e.setPrograma(programa);
        e.setSexo(sex);

        // Se llama al dao para guardar
        System.out.println("Se va a insertar un Estudiante");
        daoEstudiante.guardarEstudiante(e);
        System.out.println("Se insertó  un  nuevo Estudiante");
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
