package org.example;
import java.util.*;

public class Usuario extends Cliente {
    private boolean premium;

    public Usuario() {
    }

    public Usuario(String id, String contrasena, double descuentos, boolean premium) {
        super(id, contrasena, descuentos);
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "\n Id: " + getId() + "\n Contraseña: " + getContrasena() + "\n Descuentos: " + getDescuentos() + "\n Premium: " + isPremium();
    }
}
