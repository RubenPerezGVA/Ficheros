import java.io.*;

public class LeerTexto {
    public static void main(String[] args) {
        String ruta = "archivo.txt";

        String carpeta = "Ficheros";

        File archivo = new File(carpeta + "/" + ruta);
        File creacion_CARPETA = new File(carpeta );


        if ( archivo.exists() == true) {
            archivo.delete();
        } else{
            creacion_CARPETA.mkdir();

        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, false))) {
            bw.write("Iniciando archivo\n");
            bw.newLine();
            bw.write("Hola Mundo.\n");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}