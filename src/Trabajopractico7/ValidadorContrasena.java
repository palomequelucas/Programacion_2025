package Trabajopractico7;

import java.util.Scanner;

public class ValidadorContrasena {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);
        boolean validacionExitosa = false;

        while (!validacionExitosa) {
            try {
                System.out.print("\nIngrese una contraseña: ");
                String contrasena = sc.nextLine();

                validarContrasena(contrasena);

                System.out.println("✓ Contraseña válida y segura");
                validacionExitosa = true;

            } catch (NullPointerException e) {
                System.out.println("✗ Error: La contraseña no puede ser null");
            } catch (IllegalArgumentException e) {
                System.out.println("✗ Error: " + e.getMessage());
            } catch (Trabajopractico7.ContrasenaCorta e) {
                System.out.println("✗ Error: " + e.getMessage());
            } catch (ContrasenaSinNumeroException e) {
                System.out.println("✗ Error: " + e.getMessage());
            } catch (ContrasenaInvalidaException e) {
                System.out.println("✗ Error: " + e.getMessage());
            }
        }
    }

    private static void validarContrasena(String contrasena)
            throws ContrasenaInvalidaException {

        // Validar null
        if (contrasena == null) {
            throw new NullPointerException("La contraseña no puede ser null");
        }

        // Validar vacía
        if (contrasena.isEmpty() || contrasena.trim().isEmpty()) {
            throw new IllegalArgumentException("La contraseña no puede estar vacía");
        }

        // Validar longitud mínima
        if (contrasena.length() < 8) {
            throw new ContrasenaCorta();
        }

        // Validar que contenga al menos un número
        if (!contieneNumero(contrasena)) {
            throw new ContrasenaSinNumeroException();
        }
    }

    private static boolean contieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}