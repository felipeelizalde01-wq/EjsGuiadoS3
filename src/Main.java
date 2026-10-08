public class Main {
    public static void main(String[] args) {
        //NEGOCIOS DIGITALES
        System.out.println("NEGOCIOS DIGITALES");

        Producto producto1 = new Producto();
        producto1.setNombre("Mouse");
        producto1.setPrecio(20.0);
        producto1.setCategoria("Tecnología");

        System.out.println("Datos del producto:");
        System.out.println(producto1.getNombre());
        System.out.println(producto1.getPrecio());
        System.out.println(producto1.getCategoria());

        System.out.println("\nprecio de -100");
        producto1.setPrecio(-100);
        System.out.println("Precio: " + producto1.getPrecio());

        // AUTOMATIZACIÓN
        System.out.println("\nAUTOMATIZACIÓN");

        Sensor sensor1 = new Sensor();
        sensor1.setNombre("Sensor de Temperatura");
        sensor1.setTipo("Térmico");
        sensor1.setLectura(25.5);

        System.out.println("Datos del sensor:");
        System.out.println("Nombre: " + sensor1.getNombre());
        System.out.println("Tipo: " + sensor1.getTipo());
        System.out.println("Lectura: " + sensor1.getLectura());

        System.out.println("\nlectura a 30.2");
        sensor1.actualizarLectura(30.2);
        System.out.println("Nueva lectura: " + sensor1.getLectura());
    }
}