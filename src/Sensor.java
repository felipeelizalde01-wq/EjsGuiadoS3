public class Sensor {
    private String nombre;
    private String tipo;
    private double lectura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLectura() {
        return lectura;
    }

    public void setLectura(double lectura) {
        if (lectura >= 0) {
            this.lectura = lectura;
        } else {
            System.out.println("Error: La lectura del sensor es inválida.");
        }
    }

    public void actualizarLectura(double nuevaLectura) {
        setLectura(nuevaLectura);
    }
}