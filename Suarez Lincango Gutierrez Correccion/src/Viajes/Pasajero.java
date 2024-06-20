package Viajes;

public class Pasajero extends Ticket{
    String nombre;
    String cedula;
    int edad;
    String telefono;

    public Pasajero() {
    }

    public Pasajero(String codigoTicket, String fechaTicket, String nombre, String cedula, int edad, String telefono) {
        super(codigoTicket, fechaTicket);
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    @Override
    public void mostrarTicket() {
        System.out.println("Ticket: "+codigoTicket);
        System.out.println("Fecha: "+fechaTicket);
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+telefono);
    }
}