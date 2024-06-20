package Viajes;

public class Ticket {
    String codigoTicket;
    String fechaTicket;

    public Ticket() {
    }

    public Ticket(String codigoTicket, String fechaTicket) {
        this.codigoTicket = codigoTicket;
        this.fechaTicket = fechaTicket;
    }

    public String getCodigoTicket() {
        return codigoTicket;
    }

    public void setCodigoTicket(String codigoTicket) {
        this.codigoTicket = codigoTicket;
    }

    public String getFechaTicket() {
        return fechaTicket;
    }

    public void setFechaTicket(String fechaTicket) {
        this.fechaTicket = fechaTicket;
    }
    public void mostrarTicket() {
        System.out.println("Ticket: "+codigoTicket);
        System.out.println("Fecha: "+fechaTicket);
    }
}

