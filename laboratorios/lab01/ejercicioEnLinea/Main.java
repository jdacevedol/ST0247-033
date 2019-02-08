import javafx.util.Pair;

import java.util.Scanner;

public class Main {
    private static int nodos; //v
    private static int arcos; //e
    private static Pair[] conexiones;

    public static void crearGrafo(int v,int v2){
        conexiones = new Pair[arcos];
        for (int i = 0; i < conexiones.length; i++){
            conexiones[i]= new Pair<>(v,v2);
        }
    }

    public static void BiColor(){
        int cont=0;
        for (int i = 0; i < conexiones.length; i++){
            for(int j = i; j < conexiones.length; j++) {
                if (conexiones[i].getKey()==conexiones[j].getKey()) {
                    if(conexiones[(int)conexiones[i].getKey()].getValue()==conexiones[(int)conexiones[j].getKey()].getValue()){
                        System.out.println("NOT BICOLORABLE.");
                        break;
                    }
                }
                System.out.println("BICOLORABLE.");
                break;
            }
        }

        System.out.println("BICOLORABLE.");
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de arcos del grafo");

        int e = sc.nextInt();
        arcos = e;
        System.out.println("Ingrese la cantidad de nodos del grafo");
        int n = sc.nextInt();
        nodos = n;
        int i=0;
        while(true)
        {
            System.out.println("Ingrese las conexiones del grafo");
            while(i<e) {
                int v = sc.nextInt();
                int v2 = sd.nextInt();
                crearGrafo(v,v2);
                i++;
            }

            System.out.println("Desea terminar? Si = 0/ No = Cualquier número");
            int r = sd.nextInt();
            if(r==0)
                break;
        }

        BiColor();
    }
}
