package Trabajopractico3;

import java.util.Scanner;

public class ProcesamientoTweets {

    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un tweet: ");
        String tweet = sc.nextLine();

        // TODO: Calcular longitud y verificar límite
        int longitud = calcularLongitud(tweet);
        boolean cumpleLimite = verificarLimite(tweet);

        System.out.println("\nLongitud del tweet: " + longitud + " caracteres");
        System.out.println("¿Cumple con el límite de 280 caracteres? " + (cumpleLimite ? "Sí" : "No"));

        // TODO: Concatenar hashtag
        System.out.print("\nIngrese un hashtag para agregar: ");
        String hashtag = sc.nextLine();
        String tweetConHashtag = concatenarHashtag(tweet, hashtag);
        System.out.println("Tweet con hashtag: " + tweetConHashtag);

        // TODO: Extraer nombre de usuario
        String nombreUsuario = extraerNombreUsuario(tweet);
        if (nombreUsuario != null) {
            System.out.println("Nombre de usuario encontrado: " + nombreUsuario);
        } else {
            System.out.println("No se encontró ningún nombre de usuario.");
        }

        // TODO: Construir tweet con StringBuilder
        StringBuilder nuevoTweet = construirTweetConFragmentos();
        System.out.println("\nTweet construido con StringBuilder:");
        System.out.println(nuevoTweet.toString());
    }

    private static int calcularLongitud(String tweet) {
        return tweet.length();
    }

    private static boolean verificarLimite(String tweet) {
        return tweet.length() <= 280;
    }

    private static String concatenarHashtag(String tweet, String hashtag) {
        if (!hashtag.startsWith("#")) {
            hashtag = "#" + hashtag;
        }
        return tweet + " " + hashtag;
    }

    private static String extraerNombreUsuario(String tweet) {
        // TODO: Buscar @ y extraer el nombre de usuario
        int indice = tweet.indexOf("@");
        if (indice == -1) {
            return null;
        }

        int finNombre = indice + 1;
        while (finNombre < tweet.length() &&
                (Character.isLetterOrDigit(tweet.charAt(finNombre)) ||
                        tweet.charAt(finNombre) == '_')) {
            finNombre++;
        }

        return tweet.substring(indice, finNombre);
    }

    private static StringBuilder construirTweetConFragmentos() {
        StringBuilder sb = new StringBuilder();
        sb.append("¡Hola! ");
        sb.append("Este es un tweet construido ");
        sb.append("con varios fragmentos. ");
        sb.append("#Java #Programming");
        return sb;
    }
}