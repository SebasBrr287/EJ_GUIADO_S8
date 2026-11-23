public class Administrador extends Usuario {
    private int nivelAdministracion;

    public Administrador(String username, String correo, int nivelAdministracion) {
        super(username, correo);
        this.nivelAdministracion = nivelAdministracion;
    }

    @Override
    public String obtenerPermisos() {
        return "Control total del sistema, gestión de usuarios y configuración (Nivel " + nivelAdministracion + ")";
    }

    @Override
    public String mostrarInformacion() {
        return "[ADMIN] " + super.mostrarInformacion() + " | Nivel: " + nivelAdministracion + " | Permisos: " + obtenerPermisos();
    }
}


