package CONTROLADOR;

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

        Estudiante e = new Estudiante();

        Programa programa = new DaoPrograma().consultarPrograma(codPrograma);
        
        char sex = sexo.toCharArray()[0];

        e.setCodigo(codigo);
        e.setNombre(nombre);
        e.setPrograma(programa);
        e.setSexo(sex);

        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");

        daoEstudiante.guardarEstudiante(e);

        System.out.println("Se va a insertó  un  nuevo programa");

    }
}
