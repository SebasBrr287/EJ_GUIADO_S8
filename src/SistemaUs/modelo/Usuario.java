package SistemaUs.modelo;

public class Usuario {

    private String username;

    private String correo;

    public Usuario(String username, String correo) {
        this.username = username;
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public String obtenerPermiso() {
        return obtenerPermiso();
    }

    public String mostrarInformacion(){
        return "username: "+username+"\nCorreo: "+correo;
    }
}
