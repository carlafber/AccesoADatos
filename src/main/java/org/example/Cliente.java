package org.example;

public abstract class Cliente {
    private String id;
    private String contrasena;
    private double descuentos;

    public Cliente() {
    }

    public Cliente(String id, String contrasena, double descuentos) {
        this.id = id;
        this.contrasena = contrasena;
        this.descuentos = descuentos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }
}
