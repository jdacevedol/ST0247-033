import java.util.ArrayList;

public abstract class Grafo {
    int tamaño;

    public Grafo(int nodos){tamaño = nodos;}

     public abstract ArrayList<Integer> adyacentes(int nodo);

    public abstract int peso(int origen, int fin);

    public int getTamaño(){return tamaño;}

}
