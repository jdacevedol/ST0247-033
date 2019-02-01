import java.util.LinkedList;

/**
 * Clase en la cual se implementan los metodos del Taller 2
 * 
 * @author Jonatan David Acevedo Lopez, Alfredo Jose Ospino
 */
public class Punto1 {
   public static void subconjuntos(String s) {
        subconjuntosAux("",s);
    }
    
    public static void subconjuntosAux(String respuesta, String pregunta){
            if (pregunta.length() == 0)
                System.out.println(respuesta);
            else{
                subconjuntosAux(respuesta,pregunta.substring(1));
                subconjuntosAux(respuesta+pregunta.substring(0,1),pregunta.substring(1));
            }
    }

}
