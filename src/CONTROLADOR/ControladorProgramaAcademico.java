package CONTROLADOR;

import ACCESO_DATOS.DaoPrograma;
import LOGICA.Programa;
import java.util.Vector;

public class ControladorProgramaAcademico {

    DaoPrograma daoPrograma;

    public ControladorProgramaAcademico() {
        daoPrograma = new DaoPrograma();
    }

    public void insertarPrograma(String nombre, String codigo, String nivel, int numCreditos) {
        Programa p = new Programa();

        p.setCodigo(codigo);
        p.setNombre(nombre);
        p.setNivel(nivel);
        p.setCreditos(numCreditos);

        //Se llama al dao para guardar
        System.out.println("Se va a insertar un programa");

        daoPrograma.guardarPrograma(p);

        System.out.println("Se va a insertó  un  nuevo programa");

    }//end

    public Vector consultarPrograma(String codigo) {
        Vector v = new Vector();

        Programa p = new Programa();


        System.out.println("Se va a consultar un programa");

        p = daoPrograma.consultarPrograma(codigo);

        //se asignan datos al vector
        v.add(p.getCodigo());
        v.add(p.getNombre());
        v.add(p.getNivel());
        v.add(p.getCreditos());

        return v;
    }

    public void listarProgramas() {
    }
}
