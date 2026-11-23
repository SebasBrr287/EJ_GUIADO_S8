
public class Desarrollador extends Usuario {
    private String lenguajePrincipal;

    public Desarrollador(String username, String correo, String lenguajePrincipal) {
        super(username, correo);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public String obtenerPermisos() {
        return "Acceso a repositorios, despliegue en staging y ejecución de pruebas";
    }

    @Override
    public String mostrarInformacion() {
        return "[DEV] " + super.mostrarInformacion() + " | Lenguaje: " + lenguajePrincipal + " | Permisos: " + obtenerPermisos();
    }
}