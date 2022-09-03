package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;
    Tipo tipo;

    Asignatura() {
        this("Sin nombre",Tipo.FUNDAMENTACION);
    }

    // Considero que el atributo codigoExterno es quien recibe el valor inicial al llamar el constructor

    //Asignatura(int codigoInterno, Tipo tipo) {
    //   this("Sin nombre", codigoInterno, 0, tipo);
    //}

    Asignatura(int codigoExterno,Tipo tipo) {
        this("Sin nombre", 0, codigoExterno, tipo);
    }

    Asignatura(String nombre, Tipo tipo) {
        this(nombre, 0, 0,tipo);
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno,Tipo tipo) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.tipo = tipo;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre,Tipo tipo) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    void cambiarDatos(int codigo) {
        if (this.codigoInterno != 0){
            setCodigoInterno(codigo);
        }
        else{
            setCodigoExterno(codigo);
        }
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoExterno(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
}
