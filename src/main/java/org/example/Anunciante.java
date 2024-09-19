package org.example;

public class Anunciante extends Cliente {
    private int num_anuncios;

    public Anunciante() {
    }

    public Anunciante(String id, String contrasena, double descuentos, int num_anuncios) {
        super(id, contrasena, descuentos);
        this.num_anuncios = num_anuncios;
    }

    public int getNum_anuncios() {
        return num_anuncios;
    }

    public void setNum_anuncios(int num_anuncios) {
        this.num_anuncios = num_anuncios;
    }
}
