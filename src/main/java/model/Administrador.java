package model;

public class Administrador extends Usuario {

    public Administrador(int idUsuario, String nombre, String correo) {
        super(idUsuario, nombre, correo, "Administrador");
    }

    public void gestionarEvento(Evento evento) {
        System.out.println("Administrador " + nombre + " gestionando evento: " + evento.getNombreEvento());
    }
        @Override
        public void mostrarMenu() {
            System.out.println("--- Menú de Administrador ---");
            System.out.println("1. Crear evento");
            System.out.println("2. Ver estadísticas");
    }
}
