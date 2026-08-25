 package model;

import java.util.Date;

public class Boleto {
    private int idBoleto;
    private Date fechaEmision;
    private double precio;
    private String asiento;
    private String estado;

    public Boleto(int idBoleto, double precio, String asiento) {
        this.idBoleto = idBoleto;
        this.fechaEmision = new Date();
        this.precio = precio;
        this.asiento = asiento;
        this.estado = "Vigente";
    }

    public int getIdBoleto() {
        return idBoleto;
    }

    public void cancelarBoleto() {
        this.estado = "Cancelado";
        System.out.println("Boleto " + idBoleto + " ha sido cancelado.");
    }

    public boolean validarBoleto() {
        return "Vigente".equalsIgnoreCase(this.estado);
    }
}
