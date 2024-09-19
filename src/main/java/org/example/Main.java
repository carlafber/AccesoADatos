package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = -1;
        try {
            do {
                System.out.println("MENÚ:\n  1. Añadir usuario.\n  2. Buscar usuario.\n  3. Total ingresos.\n  -------------------\n  0. SALIR  ");
                System.out.println("Seleccione una opción:");
                opcion = in.nextInt();
                in.nextLine();

                switch (opcion) {
                    case 1:

                }

            } while (opcion != 0);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}