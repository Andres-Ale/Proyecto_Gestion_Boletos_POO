package org.example;

import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA DE GESTIÓN DE VENTA DE BOLETOS ---");

        SistemaGestionBoletos sistema = new SistemaGestionBoletos();
        Cliente cliente = new Cliente(101, "Carlos Perez", "carlosperez@gmail.com");
        Boleto boleto = new Boleto(303, 25.00, "Fila A, Asiento 12");

        sistema.registrarUsuario(cliente);
        sistema.venderBoleto(boleto, cliente);
    }
}