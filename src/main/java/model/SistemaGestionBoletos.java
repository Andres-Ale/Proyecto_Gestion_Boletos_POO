package model;

import java.util.ArrayList;
import java.util.List;

public class SistemaGestionBoletos {
    private List<Usuario> listaUsuarios;
    private List<Evento> listaEventos;
    private List<Boleto> listaBoletos;

    public SistemaGestionBoletos() {
        this.listaUsuarios = new ArrayList<>();
        this.listaEventos = new ArrayList<>();
        this.listaBoletos = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
        System.out.println("Usuario registrado en el sistema: " + usuario.nombre);
    }

    public void venderBoleto(Boleto boleto, Cliente cliente) {
        listaBoletos.add(boleto);
        cliente.comprarBoleto(boleto);
    }
}