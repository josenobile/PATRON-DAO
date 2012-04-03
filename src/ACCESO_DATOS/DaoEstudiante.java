//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: DaoEstudiante.java
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
package ACCESO_DATOS;

import LOGICA.Estudiante;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoEstudiante {

    FachadaBD fachada;

    public DaoEstudiante() {
        fachada = new FachadaBD();
    }

    public int guardarEstudiante(Estudiante estudiante) {
        String sql_guardar;
        int numFilas = 0;

        sql_guardar = "INSERT INTO estudiante VALUES ('"
                + estudiante.getCodigo() + "', '"
                + estudiante.getNombre() + "', '"
                + estudiante.getSexo() + "', "
                + estudiante.getPrograma().getCodigo() + ")";

        try (Connection conn = fachada.conectar()) {
            Statement sentencia = conn.createStatement();
            System.out.println("SQL: "+sql_guardar);
            numFilas = sentencia.executeUpdate(sql_guardar);
            return numFilas;
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }

        return -1;
    }
    
    public ArrayList<Estudiante> consultarEstudiantes(String codigo, String nombre, String sexo, String programa) {

        System.out.println("Entro al metodo Consultar en el DAO");
        ArrayList<Estudiante> estudiantesConsulta = new ArrayList<>();

        String sql_select = "SELECT * FROM estudiante     ";
        if (!codigo.isEmpty() || !nombre.isEmpty() || !sexo.equals(" ") || !programa.equals(" ")) {
            sql_select += "WHERE ";
        }
        if (!codigo.isEmpty()) {
            sql_select += "codigo = '" + codigo + "' AND ";
        }
        if (!nombre.isEmpty()) {
            sql_select += "nombre LIKE '%" + nombre + "%' AND ";
        }
        if (!sexo.equals(" ")) {
            sql_select += "sexo = '" + sexo + "' AND ";
        }
        if (!programa.equals(" ")) {
            sql_select += "codigo_programa = '" + programa + "' AND ";
        }

        sql_select = sql_select.substring(0, sql_select.length() - 5);

        try {
            Connection conn = fachada.conectar();
            System.out.println("SQL Consulta: "+sql_select);
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            int counter = 0;
            while (tabla.next()) {
                estudiantesConsulta.add(new Estudiante());
                estudiantesConsulta.get(counter).setCodigo(tabla.getString(1));
                estudiantesConsulta.get(counter).setNombre(tabla.getString(2));
                estudiantesConsulta.get(counter).setSexo(tabla.getString(3).toCharArray()[0]);
                estudiantesConsulta.get(counter).setPrograma(new DaoPrograma().consultarPrograma(tabla.getString(4)));
                System.out.println("Estudiante: "+(counter+1)+" programa: "+estudiantesConsulta.get(counter).getPrograma().getCodigo());
                counter++;
            }
            System.out.println("Estudiantes Encontrados "+estudiantesConsulta.size());

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
        return estudiantesConsulta;
    }
//
    public void modificarEstudiante(Estudiante estudiante) {

        try {
            String sql_modificar = "UPDATE estudiante";
            sql_modificar += " set nombre = '" + estudiante.getNombre() + "',";
            sql_modificar += " sexo = '" + estudiante.getSexo() + "',";
            sql_modificar += " codigo_programa = '" + estudiante.getPrograma().getCodigo() + "'";
            sql_modificar += " WHERE codigo = '" + estudiante.getCodigo() + "'";

            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            System.out.println("SQL: " + sql_modificar);
            sentencia.executeUpdate(sql_modificar);
            conn.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
    }

    public void eliminarEstudiante(Estudiante Estudiante) {
        try {
            String sql_eliminar = "DELETE FROM estudiante";
            sql_eliminar += " WHERE codigo = '" + Estudiante.getCodigo() + "'";

            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            System.out.println("SQL: " + sql_eliminar);
            sentencia.executeUpdate(sql_eliminar);
            conn.close();
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex);
        }
    }
}
