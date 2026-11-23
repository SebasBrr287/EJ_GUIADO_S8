import java.util.ArrayList;

public class SistemaUsuarios {
    private ArrayList<Usuario> usuarios;

    public SistemaUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        if (usuario != null) {
            usuarios.add(usuario);
        }
    }

    public Usuario buscarUsuario(String username) {
        for (Usuario u : usuarios) {
            if (u.getUsername().equalsIgnoreCase(username)) {
                return u;
            }
        }
        return null;
    }

    public boolean eliminarUsuario(String username) {
        Usuario encontrado = buscarUsuario(username);
        if (encontrado != null) {
            return usuarios.remove(encontrado);
        }
        return false;
    }

    public String mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            return "No hay usuarios registrados en el sistema.";
        }
        StringBuilder sb = new StringBuilder();
        for (Usuario u : usuarios) {
            sb.append(u.mostrarInformacion()).append("\n");
        }
        return sb.toString();
    }
}