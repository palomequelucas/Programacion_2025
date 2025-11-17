package Trabajopractico3;

import java.util.Scanner;

public class ValidacionContrasenas {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una contraseña para validar: ");
        String contrasena = sc.nextLine();

        System.out.println("\n--- Validación de Contraseña ---");

        boolean longitudValida = verificarLongitud(contrasena);
        boolean tieneDigito = verificarDigito(contrasena);
        boolean tieneEspecial = verificarCaracterEspecial(contrasena);

        System.out.println("¿Tiene al menos 8 caracteres? " + (longitudValida ? "Sí" : "No"));
        System.out.println("¿Contiene al menos un dígito? " + (tieneDigito ? "Sí" : "No"));
        System.out.println("¿Contiene al menos un carácter especial? " + (tieneEspecial ? "Sí" : "No"));

        boolean esSegura = longitudValida && tieneDigito && tieneEspecial;
        System.out.println("\n¿Contraseña segura? " + (esSegura ? "SÍ ✓" : "NO ✗"));

        // TODO: Construir contraseña segura con StringBuilder
        System.out.println("\n--- Generación de Contraseña Segura ---");
        StringBuilder contrasenaSegura = construirContrasenaSegura();
        System.out.println("Contraseña generada: " + contrasenaSegura.toString());
    }

    private static boolean verificarLongitud(String contrasena) {
        return contrasena.length() >= 8;
    }

    private static boolean verificarDigito(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean verificarCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*";
        for (char c : contrasena.toCharArray()) {
            if (caracteresEspeciales.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }

    private static StringBuilder construirContrasenaSegura() {
        StringBuilder sb = new StringBuilder();
        sb.append("Segura"); // Base
        sb.append("2024");   // Dígitos
        sb.append("!");      // Carácter especial
        sb.append("Pass");   // Más texto
        sb.append("#@");     // Más especiales
        return sb;
    }
}