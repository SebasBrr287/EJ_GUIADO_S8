//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public static void main() {
    Scanner sc = new Scanner(System.in);
    SistemaUsuarios sistema = new SistemaUsuarios();

    System.out.println("** REGISTRO DE USUARIOS **");
    System.out.print("¿Cuántos usuarios deseas registrar?: ");
    int cantidad = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < cantidad; i++) {
        System.out.println("\nUsuario #" + (i + 1) + "\n1:Admin\n2: Dev\n3:Cliente ");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Correo: ");
        String correo = sc.nextLine();

        if (tipo == 1) {
            System.out.print("Nivel de administración: ");
            int nivel = Integer.parseInt(sc.nextLine());
            sistema.agregarUsuario(new Administrador(user, correo, nivel));
        } else if (tipo == 2) {
            System.out.print("Lenguaje principal: ");
            String lang = sc.nextLine();
            sistema.agregarUsuario(new Desarrollador(user, correo, lang));
        } else if (tipo == 3) {
            System.out.print("Plan de suscripción: ");
            String plan = sc.nextLine();
            sistema.agregarUsuario(new Cliente(user, correo, plan));
        }
    }

    System.out.println("\n" + sistema.mostrarUsuarios());

    System.out.print("Ingresa un username para buscar permisos: ");
    String buscarUser = sc.nextLine();
    Usuario encontrado = sistema.buscarUsuario(buscarUser);
    System.out.println(encontrado != null ? "Permisos: " + encontrado.obtenerPermisos() : "Usuario no encontrado.");

    System.out.print("Ingresa un username para eliminar: ");
    String elimUser = sc.nextLine();
    System.out.println("Eliminado: " + sistema.eliminarUsuario(elimUser));
    System.out.println("\n" + sistema.mostrarUsuarios());

    sc.close();
}

