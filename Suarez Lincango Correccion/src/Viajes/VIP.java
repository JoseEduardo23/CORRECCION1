package Viajes;

public class VIP extends ServicioVIP{

    double precioFinal;

    public VIP(String codigoTicket, String fechaTicket, String nombre, String cedula, int edad, String telefono, String origen, String destino, double precio, String asiento, boolean maleta, boolean maletaextra, boolean television, boolean internet, String sevicio1, String sevicio2, double precioFinal) {
        super(codigoTicket, fechaTicket, nombre, cedula, edad, telefono, origen, destino, precio, asiento, maleta, maletaextra, television, internet, sevicio1, sevicio2);
        this.precioFinal = precioFinal;
    }
    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
    @Override
    public void mostrarTicket() {
        System.out.println("Ticket: "+codigoTicket);
        System.out.println("Fecha: "+fechaTicket);
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Telefono: "+telefono);
        System.out.println("Origen: "+origen);
        System.out.println("Destino: "+destino);
        System.out.println("Precio: "+precio);
        System.out.println("Asiento: "+asiento);
        System.out.println("Maleta: "+maleta);
        System.out.println("Maletaextra: "+maletaextra);
        System.out.println("Television: "+television);
        System.out.println("Internet: "+internet);
        System.out.println("Sevicio1: "+sevicio1);
        System.out.println("Sevicio2: "+sevicio2);
    }
}