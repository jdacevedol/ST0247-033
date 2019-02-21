import java.util.ArrayList;
public class Punto1 {
    /**
     * Metodo auxiliar para llamar el metodo hayCaminoDFS posterior
     *
     * @param g grafo dado
     * @param v vertices
     * @param w vertice
     * @return true si hay camino, false de lo contrario
     */
    public static boolean hayCaminoDFS(Digraph g, int v, int w) {
        boolean[] visitados = new boolean[g.size()];
        return hayCaminoDFS(g, v, w, visitados);
    }


    /**
     * Metodo que recorre el grafo por medio de dfs
     *
     * @param g         grafo dado
     * @param v         vertices
     * @param w         vertice
     * @param visitados ayuda a tener un conteo acerca de que nodos han sido
     *                  o no visitados
     * @return true si hay camino, false de lo contrario
     */
    private static boolean hayCaminoDFS(Digraph g, int v, int w, boolean[] visitados) {
        visitados[v] = true;
        if (v == w)
            return true;
        else {
            ArrayList<Integer> adyacentes = g.getSuccessors(v);
            if (adyacentes.contains(w))
                return true;
            for (Integer adyacente : adyacentes) {
                if (!visitados[adyacente]) {
                    boolean respuesta = hayCaminoDFS(g, adyacente, w, visitados);
                    if (respuesta)
                        return respuesta;
                }
            }
            return false;
        }
    }

}