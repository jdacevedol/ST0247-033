public class Grafo {
    public boolean biColor(Digraph g, int m) {
        boolean res = false;
        int[] colorsGraph = new int[g.size()];

        for (int i = 0; i < g.size(); i++) {
            colorsGraph[0] = 1; //El valor 0 es un color x
            if (colorsGraph[g.getSuccessors(i).get(i)] == colorsGraph[g.getSuccessors(i).get(0)]) {
                return res;
            } else if (colorsGraph[i] < m) {
                if (biColor(g,m-1)) {
                    return !res;
                }

            }

        }
        return res;
    }
}