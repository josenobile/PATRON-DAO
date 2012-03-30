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

//~--- JDK imports ------------------------------------------------------------

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoPrograma {
    FachadaBD fachada;

    public DaoPrograma() {
        fachada = new FachadaBD();
    }

    public int guardarPrograma(Programa p) {
        String sql_guardar;
        int    numFilas = 0;

        sql_guardar = "INSERT INTO programa VALUES ('" + p.getCodigo() + "', '" + p.getNombre() + "', '" + p.getNivel()
                      + "', " + p.getCreditos() + ")";

        try {
            Connection conn      = fachada.conectar();
            Statement  sentencia = conn.createStatement();

            numFilas = sentencia.executeUpdate(sql_guardar);
            conn.close();

            return numFilas;
        } catch (SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        return -1;
    }    // fin guardar

    public Programa consultarPrograma(String codigo) {
        Programa p = new Programa();
        String   sql_select;

        sql_select = "SELECT codigo, nombre,nivel, num_creditos FROM  programa WHERE codigo='" + codigo + "'";

        try {
            Connection conn = fachada.conectar();

            System.out.println("consultando en la bd");

            Statement sentencia = conn.createStatement();
            ResultSet tabla     = sentencia.executeQuery(sql_select);

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

    public void modificarPrograma(int codigoPrograma) {}

    public void borrarPrograma(int codigoPrograma) {}
}    // fin clase


//~ Formatted by Jindent --- http://www.jindent.com
