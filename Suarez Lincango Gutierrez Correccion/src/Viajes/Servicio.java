package Viajes;

public class Servicio extends Ruta {
    String asiento;
    boolean maleta;
    boolean maletaextra;

    public Servicio(String codigoTicket, String fechaTicket, String nombre, String cedula, int edad, String telefono, String origen, String destino, double precio, String asiento, boolean maleta, boolean maletaextra) {
        super(codigoTicket, fechaTicket, nombre, cedula, edad, telefono, origen, destino, precio);
        this.asiento = asiento;
        this.maleta = maleta;
        this.maletaextra = maletaextra;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public boolean isMaleta() {
        return maleta;
    }

    public void setMaleta(boolean maleta) {
        this.maleta = maleta;
    }

    public boolean isMaletaextra() {
        return maletaextra;
    }

    public void setMaletaextra(boolean maletaextra) {
        this.maletaextra = maletaextra;
    }

    public void mostrarTicket() {
    //ya veremos
    }
}

