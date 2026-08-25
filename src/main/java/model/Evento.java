package model;

import java.util.Date;

public class Evento {
    private int idEvento;
    private String nombreEvento;
    private Date fecha;
    private String lugar;

    public Evento(int idEvento, String nombreEvento, String lugar) {
        this.idEvento = idEvento;
        this.nombreEvento = nombreEvento;
        this.fecha = new Date();
        this.lugar = lugar;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }
}