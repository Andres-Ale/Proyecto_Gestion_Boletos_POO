package model;

public abstract class Usuario {
    protected int idUsuario;
    protected String nombre;
    protected String correo;
    protected String tipoUsuario;

    public Usuario(int idUsuario, String nombre, String correo, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
    }

    public void registrarse() {
        System.out.println("Usuario " + nombre + " registrado con éxito.");
    }

    public boolean iniciarSesion() {
        System.out.println("Sesión iniciada para " + correo);
        return true;
    }

    public void actualizarPerfil() {
        System.out.println("Perfil actualizado.");
    }
    public abstract void mostrarMenu();
}