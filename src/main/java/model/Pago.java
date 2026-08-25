package model;

import java.util.Date;

public class Pago {
    private int idPago;
    private double monto;
    private Date fechaPago;
    private String metodoPago;

    public Pago(int idPago, double monto, String metodoPago) {
        this.idPago = idPago;
        this.monto = monto;
        this.fechaPago = new Date();
        this.metodoPago = metodoPago;
    }

    public boolean procesarPago() {
        System.out.println("Procesando pago de $" + monto + " vía " + metodoPago);
        return true;
    }

    public void generarRecibo() {
        System.out.println("Recibo generado para el pago #" + idPago);
    }
}