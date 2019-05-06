public class Held_Karp {
    public static void main(String [] args){

    }

    public int heldCarp(Digraph g){
        final int vacio = 0;
        int n = g.size();
        int[][] costos = new int[n][(int) Math.pow(2,n)];
        int[][] papas = new int[n][(int) Math.pow(2,n)];

        for (int i = 0; i < n; i++){
            costos[i][vacio] = g.getWeight(0,i);
            papas[i][vacio] = 0;
        }

        imprimir(costos);

        for(int j = 0; j < costos[0].length-1; j++)
            for (int i = 0; i < n; i++)
                costos[i][j+1] = costos[i][j+1] + costos[i][j];
            //if()
        return costos[0][costos[0].length-1];
    }

    public void imprimir(int [][] x){
        for(int i = 0; i< x.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < x.length; i++) {
                System.out.print(x[i][j]);
                if (j != x[i].length - 1) System.out.print("\t");
            }
        }
    }
}
