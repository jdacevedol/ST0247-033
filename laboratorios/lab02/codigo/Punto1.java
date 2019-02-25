public class Punto1 {

    public static int recorrido(Digraph g, boolean[] visitados){
        int tope = 0;
        visitados[0] = true;
        int valor = 0;
        if(g.size()==0){
            return 0;
        } else {
            for(int i = 0; i < g.size(); i++) {
                for(int j = 0; j < g.size(); j++) {
                    if (g.getWeight(i,g.getSuccessors(i).get(j)) < tope){
                        tope = g.getWeight(i,g.getSuccessors(i).get(j));
                        visitados[i] = true;
                        valor = valor + tope;
                    }

                }

            }
            if(visitados[0] && visitados.length == g.size()){
                valor = valor + g.getWeight(visitados.length-1,0);
                return valor;
            }

        }
    return valor;
    }
}
