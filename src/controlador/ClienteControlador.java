package controlador;

import modelo.ClienteModelo;
import vista.ClienteVista;

public class ClienteControlador {

    private ClienteModelo clienteModelo;
    private ClienteVista clienteVista;

    public ClienteControlador() {
       clienteModelo= new ClienteModelo();
       clienteVista = new ClienteVista();
    }

    public void Interacciones(){
        while(true){
            //---------------------
            try{
                clienteVista.capturaDatos();
                clienteModelo.setId(Integer.parseInt(clienteVista.getTextoId()));

                if(clienteVista.getTextoNombre().isBlank()) {
                    throw new Exception("El nombre no puede estar en blanco!!");
                }else{
                    clienteModelo.setNombre(clienteVista.getTextoNombre());
                }

                if(clienteVista.getTextoApellido().isBlank()) {
                    throw new Exception("El apellido no puede estar en blanco!!");
                }else{
                    clienteModelo.setApellido(clienteVista.getTextoApellido());
                }

                clienteVista.mostrarDatos(clienteModelo.toString());
                break;

            }catch (NumberFormatException exception){
                clienteVista.mostrarMensajeError("Solo se aceptan numeros en id!!");
            }catch(Exception exception){
                clienteVista.mostrarMensajeError(exception.getMessage());
            }
            //---------------------
        }
    }
}
