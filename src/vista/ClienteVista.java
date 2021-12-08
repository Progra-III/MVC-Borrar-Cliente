package vista;

import java.util.Scanner;

public class ClienteVista {

    private String textoId;
    private String textoNombre;
    private String textoApellido;

    public String getTextoId() {
        return textoId;
    }

    public void setTextoId(String textoId) {
        this.textoId = textoId;
    }

    public String getTextoNombre() {
        return textoNombre;
    }

    public void setTextoNombre(String textoNombre) {
        this.textoNombre = textoNombre;
    }

    public String getTextoApellido() {
        return textoApellido;
    }

    public void setTextoApellido(String textoApellido) {
        this.textoApellido = textoApellido;
    }

    public void capturaDatos(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el id: ");
        setTextoId(scanner.nextLine());

        System.out.println("Introduzca el nombre: ");
        setTextoNombre(scanner.nextLine());

        System.out.println("Introduzca el apellido: ");
        setTextoApellido(scanner.nextLine());
    }

    public void mostrarMensajeError(String mensaje){
        System.out.println("ERROR: " +mensaje);
    }

    public void mostrarDatos(String datos){
        System.out.println(datos);
    }
}
