import java.util.ArrayList;

public class Punto2 {
    /**
     * Metodo que recorre el grafo por medio de dfs teniendo en cuenta que
     * se quiere encontrar el de menor costo
     * @param g grafo dado
     * @param v nodo desde el cual empieza el recorrido
     * @param w nodo donde termina el recorrido
     * @return cual es el costo que tiene ir desde inicio a fin
     */
    public static int costoMinimo(Digraph g, int v, int w, boolean[] visitados) {
        visitados[v] = true;
        if (v == w)
            return 0;
        else{
            ArrayList<Integer> adyacentes = g.getSuccessors(v);
            if (adyacentes.contains(w))
                return g.getWeight(v,w);
            for (Integer adyacente: adyacentes){
                if (!visitados[adyacente]){
                    int respuesta = costoMinimo(g, adyacente, w, visitados);
                    int respuestaConLoQueYaTengo = respuesta + g.getWeight(v,adyacente);
                    if (respuestaConLoQueYaTengo < g.getWeight(v,w))
                        return respuestaConLoQueYaTengo;

                }
            }

            return Integer.MAX_VALUE; //infinito
        }
    }



}
