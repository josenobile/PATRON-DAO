//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: DaoPrograma.java
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

//~--- non-JDK imports --------------------------------------------------------
import LOGICA.Programa;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoPrograma {

    FachadaBD fachada;

    public DaoPrograma() {
        fachada = new FachadaBD();
    }

    public int guardarPrograma(Programa p) {
        String sql_guardar;
        int numFilas = 0;

        sql_guardar = "INSERT INTO programa VALUES ('" + p.getCodigo() + "', '" + p.getNombre() + "', '" + p.getNivel()
                + "', " + p.getCreditos() + ")";

        try {
            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();

            return numFilas;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return -1;
    }

    public Programa consultarPrograma(String codigo) {
        Programa p = new Programa();
        String sql_select;

        sql_select = "SELECT codigo, nombre,nivel, num_creditos FROM  programa WHERE codigo='" + codigo + "'";

        try {
            Connection conn = fachada.conectar();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            while (tabla.next()) {
                p.setCodigo(tabla.getString(1));
                p.setNombre(tabla.getString(2));
                p.setNivel(tabla.getString(3));
                p.setCreditos(tabla.getInt(4));
                System.out.println("ok");
            }

            conn.close();

            return p;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public ArrayList<Programa> consultarProgramas(String codigo, String nombre, String nivel, String numCreditos) {

        ArrayList<Programa> programasConsulta = new ArrayList<>();

        String sql_select = "SELECT * FROM programa     ";
        if (!codigo.isEmpty() || !nombre.isEmpty() || !nivel.isEmpty() || !numCreditos.isEmpty()) {
            sql_select += "WHERE ";
        }
        if (!codigo.isEmpty()) {
            sql_select += "codigo = '" + codigo + "' AND ";
        }
        if (!nombre.isEmpty()) {
            sql_select += "nombre LIKE '%" + nombre + "%' AND ";
        }
        if (!nivel.isEmpty()) {
            sql_select += "nivel LIKE '%" + nivel + "%' AND ";
        }
        if (!numCreditos.isEmpty()) {
            sql_select += "num_creditos = " + numCreditos + " AND ";
        }


        sql_select = sql_select.substring(0, sql_select.length() - 5);
        System.out.println("Consulta: " + sql_select);

        try {
            Connection conn = fachada.conectar();
            System.out.println("consultando en la bd");
            Statement sentencia = conn.createStatement();
            ResultSet tabla = sentencia.executeQuery(sql_select);

            int counter = 0;
            while (tabla.next()) {
                programasConsulta.add(new Programa());
                programasConsulta.get(counter).setCodigo(tabla.getString(1));
                System.out.println("Codigo: " + programasConsulta.get(counter).getCodigo());
                programasConsulta.get(counter).setNombre(tabla.getString(2));
                System.out.println("Nombre: " + programasConsulta.get(counter).getNombre());
                programasConsulta.get(counter).setNivel(tabla.getString(3));
                System.out.println("Nivel: " + programasConsulta.get(counter).getNivel());
                programasConsulta.get(counter).setCreditos(tabla.getInt(4));
                System.out.println("Creditos: " + programasConsulta.get(counter).getCreditos());
                System.out.println(counter + " ok");
                counter++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoPrograma.class.getName()).log(Level.SEVERE, null, ex);
        }
        return programasConsulta;
    }

    public void modificarPrograma(Programa seleccionadoParaEditar) {
        try {
            String sql_guardar = "UPDATE programa";
            sql_guardar += " set codigo = '" + seleccionadoParaEditar.getCodigo() + "'";
            sql_guardar += " set  nombre + '" + seleccionadoParaEditar.getNivel() + "'";
            sql_guardar += " set nivel = '" + seleccionadoParaEditar.getNivel() + "'";
            sql_guardar += " set num_creditos = '" + seleccionadoParaEditar.getCreditos() + "'";

            Connection conn = fachada.conectar();
            Statement sentencia = conn.createStatement();
            sentencia.executeUpdate(sql_guardar);
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoPrograma.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void borrarPrograma(int codigoPrograma) {
    }
}
