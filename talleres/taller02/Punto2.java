public class Punto2 {
   public static void permutaciones(String s) {
        permutacionesAux("",s);
    }
    public static void permutacionesAux(String respuesta, String pregunta){
        if (pregunta.length() == 0) 
            System.out.println(respuesta);
        else {
           for (int i = 0; i < pregunta.length(); i++)
             permutacionesAux(respuesta+pregunta.charAt(i), pregunta.substring(0,i)+pregunta.substring(i+1));
        }
    }
}
