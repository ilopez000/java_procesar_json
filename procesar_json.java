//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class Main {

        public static void main(String[] args) throws IOException, ParseException {

            // Ruta del archivo JSON
            String rutaArchivo = "C:\\Users\\ignac\\PycharmProjects\\pythonProject10\\venta_libros.json";

            // Leer el archivo JSON
            JSONParser parser = new JSONParser();
            FileReader fileReader = new FileReader(new File(rutaArchivo));
            JSONArray librosJSON = (JSONArray) parser.parse(fileReader);



            // Recorrer el array JSON y crear objetos Libro
            for (Object libroJSON : librosJSON) {
                JSONObject libroJSONObject = (JSONObject) libroJSON;

                // Obtener los datos del libro
                String titulo = (String) libroJSONObject.get("titulo");
                String autor = (String) libroJSONObject.get("autor");
                String isbn = (String) libroJSONObject.get("isbn");
                int paginas = ((Long) libroJSONObject.get("paginas")).intValue();
                int precio = ((Long) libroJSONObject.get("precio")).intValue();
                int ventas = ((Long) libroJSONObject.get("ventas")).intValue();

                System.out.println("**Libro:**");
                System.out.println("  Título: " + titulo);
                System.out.println("  Autor: " + autor);
                System.out.println("  ISBN: " + isbn);
                System.out.println("  Páginas: " + paginas);
                System.out.println("  Precio: " + precio);
                System.out.println("  Ventas: " + ventas);
                System.out.println();
            }



            System.out.println("¡Libros leídos con éxito!");
        }

}
