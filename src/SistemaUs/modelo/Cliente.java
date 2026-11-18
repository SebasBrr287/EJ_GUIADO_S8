package SistemaUs.modelo;

public class Cliente extends Usuario{
    private String nivelAdministracion;

    public Cliente(String username, String correo, String nivelAdministracion) {
        super(username, correo);
        this.nivelAdministracion = nivelAdministracion;
    }

    @Override
    public String obtenerPermiso() {
        return super.obtenerPermiso()+"\n Permiso:"+nivelAdministracion;
    }
}
