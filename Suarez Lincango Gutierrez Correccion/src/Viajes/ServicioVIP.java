package Viajes;

public class ServicioVIP extends Ruta {
    String asiento;
    boolean maleta;
    boolean maletaextra;
    boolean television;
    boolean internet;
    String sevicio1;
    String sevicio2;

    public ServicioVIP(String codigoTicket, String fechaTicket, String nombre, String cedula, int edad, String telefono, String origen, String destino, double precio, String asiento, boolean maleta, boolean maletaextra) {
    }

    public ServicioVIP(String codigoTicket, String fechaTicket, String nombre, String cedula, int edad, String telefono, String origen, String destino, double precio, String asiento, boolean maleta, boolean maletaextra, boolean television, boolean internet, String sevicio1, String sevicio2) {
        super(codigoTicket, fechaTicket, nombre, cedula, edad, telefono, origen, destino, precio);
        this.asiento = asiento;
        this.maleta = maleta;
        this.maletaextra = maletaextra;
        this.television = television;
        this.internet = internet;
        this.sevicio1 = sevicio1;
        this.sevicio2 = sevicio2;
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

    public boolean isTelevision() {
        return television;
    }

    public void setTelevision(boolean television) {
        this.television = television;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public String getSevicio1() {
        return sevicio1;
    }

    public void setSevicio1(String sevicio1) {
        this.sevicio1 = sevicio1;
    }

    public String getSevicio2() {
        return sevicio2;
    }

    public void setSevicio2(String sevicio2) {
        this.sevicio2 = sevicio2;
    }

    public void recargo(double precio){
        //metodo
    }
    public void mostrarTicket() {
        //metodo
    }
}
