package model;

public class Administrador extends Usuario {

    public Administrador(int idUsuario, String nombre, String correo) {
        super(idUsuario, nombre, correo, "Administrador");
    }

    public void gestionarEvento(Evento evento) {
        System.out.println("Administrador " + nombre + " gestionando evento: " + evento.getNombreEvento());
    }
}
