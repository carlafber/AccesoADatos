package org.example;

import java.util.*;

public class CRUDusuarios {
    public static void anadir() {
    }

    public static ArrayList anadirUsusario(ArrayList lista) {
        Scanner in = new Scanner(System.in);
        System.out.print("\nPara añadir un usuario, introduzca los siguientes datos: \n Identificador (correo electrónico): ");
        String id = in.nextLine();
        System.out.print(" Contraseña: ");
        String contrasena = in.nextLine();
        System.out.print(" Importe de los descuentos aplicados: ");
        double descuentos = in.nextDouble();
        System.out.print(" ¿Desea adquirir la condición de 'premium'? (Para adquirirla, introduzca '1', si no, '2'): ");
        int respuesta = in.nextInt();
        boolean premium = false;
        if (respuesta == 1) {
            premium = true;
        } else if (respuesta == 2) {
            premium = false;
        } else {
            System.out.println("Respuesta inválida.");
        }
        Usuario nuevo_usuario = new Usuario(id, contrasena, descuentos, premium);
        lista.add(nuevo_usuario);

        for (Object usuario : lista) {
            System.out.println("Nuevo usuario creado " + usuario);
        }

        return lista;
    }
}
