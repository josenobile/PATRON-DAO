//**********************************************************
// DESARROLLO DE SOFTWARE II
// TALLER: PATRON-DAO
//
// ARCHIVO: ControladorConfiguracionBD.java
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

import ACCESO_DATOS.FachadaBD;

public class ControladorConfiguracionBD {

    public ControladorConfiguracionBD() {
    }

    public String setParametros(String host, String port, String database, String user, String password) {

        if (!host.isEmpty() && !port.isEmpty() && !database.isEmpty() && !user.isEmpty() && !password.isEmpty()) {

            FachadaBD.setHost(host);
            FachadaBD.setPort(port);
            FachadaBD.setDatabase(database);
            FachadaBD.setUsuario(user);
            FachadaBD.setPassword(password);

            return "OK";

        } else {
            return "Por favor ingrese la informacion de todos los campos";
        }
    }
}