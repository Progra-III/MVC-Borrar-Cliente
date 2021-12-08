package modelo;

import java.util.Objects;

public class ClienteModelo {

    private int id;
    private String nombre;
    private String apellido;

    public ClienteModelo(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public ClienteModelo() {
        this.id= 0;
        this.nombre="Indefinido";
        this.apellido="Indefinido";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Datos del cliente {" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClienteModelo)) return false;
        ClienteModelo that = (ClienteModelo) o;
        return getId() == that.getId() && Objects.equals(getNombre(), that.getNombre()) && Objects.equals(getApellido(), that.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNombre(), getApellido());
    }
}

