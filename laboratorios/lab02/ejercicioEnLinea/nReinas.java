import java.util.ArrayList;

public class nReinas {
    /*
     * r = reinas
     * etapa = columnas
     */
    int cant;

    public nReinas(int rei, int fila,int colmu){
        int [] tal = new int[rei];
        mirarPosiciones(tal,0,fila,colmu,rei);
    }

    public void mirarPosiciones(int [] tablero, int etapa,int fil,int colm,int r){
        if (etapa == r){ 
            boolean llave = true;

            for (int j=0; j < r; j++){
                if (j == colm && tablero[j] == fil){
                    llave = false;
                }
            }
            if (llave){
                imprimirTal(tablero);
                cant++;
                System.out.println(cant);
            }
        }
        if(etapa < r){
            for (int i = 0; i < r; i++){
                tablero[etapa] = i;
                if (validarPosicion(tablero,etapa)){
                    mirarPosiciones(tablero,etapa+1,fil,colm,r);  
                }
            }
        }
    }

    public boolean validarPosicion(int [] tablero,int etapa){
        for(int i = 0; i < etapa; i++){
            if (tablero[i] == tablero[etapa]  || Math.abs(tablero[i] - tablero[etapa]) == Math.abs(i-etapa)){
                return false;
            }
        }
        return true;
    }

    public void imprimirTal(int [] tal){
        for(int i = 0; i < tal.length; i++){
            System.out.print(tal[i]);
        }
        System.out.println();
    }

}