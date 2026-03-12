import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerCSVSeguro {
    public static void main(String[] args) {
        String ruta = "personas.csv";
        String linea;

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            br.readLine(); // saltar cabecera

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (datos.length >= 3) {
                    System.out.println("Nombre: " + datos[0]);
                    System.out.println("Edad: " + datos[1]);
                    System.out.println("Ciudad: " + datos[2]);
                } else {
                    System.out.println("Línea inválida: " + linea);
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}