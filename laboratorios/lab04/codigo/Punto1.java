public class Punto1 {

    public static int greedy(Grafo mapa, int paquetesCamion ){
        boolean [] visitados = new boolean[paquetesCamion];
        visitados[0] = true;
        int valMin = Integer.MAX_VALUE;
        int valTotal=0;
        for(int i = paquetesCamion; 0<i; i--){
            for(int j = paquetesCamion + 1 ; 0< j - 1; j--) {
                if (mapa.peso(i, mapa.adyacentes(j).get(j)) < valMin) {
                    visitados[i] = true;
                    if(!visitados[j]){
                        valMin = mapa.peso(i, mapa.adyacentes(j).get(j));
                        valTotal = valTotal + valMin;
                    }

                }
            }
        }
        valTotal = valTotal + mapa.peso(1,0);
        return valTotal;
    }


    public static void main(String [] args){
        Grafo g;
        //greedy(g);
    }
}
