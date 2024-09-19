package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Usuario> lista_usuarios = new ArrayList();
        int opcion;
        try {
            do {
                System.out.println("MENÚ:\n  1. Añadir usuario.\n  2. Buscar usuario.\n  3. Total ingresos.\n  -------------------\n  0. SALIR  ");
                System.out.print("Seleccione una opción: ");
                opcion = in.nextInt();
                in.nextLine();

                switch (opcion) {
                    case 1:
                        CRUDusuarios.anadirUsusario(lista_usuarios);
                        break;
                    case 2:
                        CRUDusuarios.buscarUsusario(lista_usuarios);
                        break;
                    case 3:
                        break;
                }
            } while (opcion != 0);
        }catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}