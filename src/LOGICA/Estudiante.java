package LOGICA;

public class Estudiante {

    String codigo;
    String nombre;
    char sexo;
    Programa programa;

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public Programa getPrograma() {
        return programa;
    }

    public Estudiante() {
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getSexo() {
        return sexo;
    }
}
