package model;

public class Cliente extends Usuario {

    public Cliente(int idUsuario, String nombre, String correo) {
        super(idUsuario, nombre, correo, "Cliente");
    }

    public void comprarBoleto(Boleto boleto) {
        System.out.println("Cliente " + nombre + " compró el boleto ID: " + boleto.getIdBoleto());
    }
    @Override
    public void mostrarMenu() {
        System.out.println("--- Menú Cliente ---");
    }
}