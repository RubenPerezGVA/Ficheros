import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerCSV {
    public static void main(String[] args) {
        String ruta = "personas.csv";
        String linea;
        String separador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            // Leer cabecera
            linea = br.readLine();
            System.out.println("Cabecera: " + linea);

            // Leer datos
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(separador);

                String nombre = datos[0];
                String edad = datos[1];
                String ciudad = datos[2];

                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println("Ciudad: " + ciudad);
                System.out.println("-------------------");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el CSV: " + e.getMessage());
        }
    }
}