package org.example;

import java.util.*;

public class CRUDusuarios{
    static Scanner in = new Scanner(System.in);
    public static ArrayList<Usuario> anadirUsusario(ArrayList<Usuario> lista) {
        System.out.print("\nPara añadir un usuario, introduzca los siguientes datos: \n Identificador (correo electrónico): ");
        String id = in.next();
        System.out.print(" Contraseña: ");
        String contrasena = in.next();
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

        for (Usuario usuario : lista) {
            System.out.println("Nuevo usuario creado " + usuario);
        }

        return lista;
    }

    public static ArrayList<Usuario> buscarUsusario(ArrayList<Usuario> lista) {
        System.out.print("\nPara buscar un usuario, introduzca el identificador (correo electrónico): ");
        String id = in.next();
        int index = -1;
        for (Usuario usuario : lista) {
            if (usuario.getId().equals(id)) {
                index = lista.indexOf(usuario);
            }
        }
        if (index != -1) {
            System.out.println("Usuario encontrado correctamente." + lista.get(index));
        } else {
            System.out.println("El usuario no existe.");
        }

        return lista;
    }

    public static double totalIngresos(ArrayList<Usuario> lista) {
        double total = 0;
        for (Usuario usuario : lista) {
            if(usuario.isPremium()){
                total += 35.5 - usuario.getDescuentos();
            } else {
                total += 20.5 - usuario.getDescuentos();
            }
        }
        System.out.print("El total de ingresos del periódico es: " + total + "€.");
        return total;
    }
}