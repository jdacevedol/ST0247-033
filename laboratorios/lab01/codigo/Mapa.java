import java.io.*;
import java.util.HashMap;

public class Mapa{
        HashMap<Long, HashMap<Long, Double>>mapaPrueba = new HashMap<Long,HashMap<Long, Double>>();
    /**
     * @param archivo  Es el archivo que incluye las direcciones o vertices ,en este caso, que conforman el grafo.
     * @throws FileNotFoundException En caso de que el archivo no exista.
     * @throws IOException En caso de que el archivo no pueda ser utilizado.
     */
    public void leerArchvo(String archivo)throws FileNotFoundException, IOException {
            String cadena;
            BufferedReader b = new BufferedReader(new FileReader(archivo));
            Long key;
            Long key2;
            Double dist;
        /**
         * Este ciclo toma cada una de las partes de la línea dentro del archivo de direcciones, y las separa unas de
         * otras para que puedan ser manipuladas en código.
         */
        b.readLine();
        while((cadena = b.readLine())!=null) {
                String [] parte = cadena.split(" ");
                key = Long.parseLong(parte[0]);
                key2 = Long.parseLong(parte[1]);
                dist = Double.parseDouble(parte[2]);
            /**
             * Verifica la existencia de una llave, si existe le agrega el valor encontrado previamente en el string
             * , sino, crea una nueva llave en su lugar.
             */
            mapaPrueba.put(key,new HashMap<Long,Double>());
            mapaPrueba.get(key).put(key2,dist);

        }

        /**
         * Cierra el lector de archivos, además de guardar el HashMap e imprimir los valores adyacentes y su distancia.
         */
        b.close();
        System.out.println("Guardado");
        mapaPrueba.forEach((k,v) -> System.out.println("Vertice 1: " + k + "  " + " Vertice 2 y Distancia : " + v));
            
        }


}