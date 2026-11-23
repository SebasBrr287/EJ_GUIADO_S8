
public class Cliente extends Usuario {
    private String planSuscripcion;

    public Cliente(String username, String correo, String planSuscripcion) {
        super(username, correo);
        this.planSuscripcion = planSuscripcion;
    }

    @Override
    public String obtenerPermisos() {
        return "Acceso al portal de usuario y consumo de servicios del plan " + planSuscripcion;
    }

    @Override
    public String mostrarInformacion() {
        return "[CLIENTE] " + super.mostrarInformacion() + " | Plan: " + planSuscripcion + " | Permisos: " + obtenerPermisos();
    }
}