import java.util.ArrayList;


public class nReinas {
    /*
     * r = reinas
     * etapa = columnas
     */
    int r;
    int cant = 0;
    int fil;
    int colm;
    public nReinas(int rei, int fila,int colmu){
            fil = fila;
            colm = colmu;
            int [] tal = new int[rei];
            r = rei;
            mirarPosiciones(tal,0);
    }
    
    public boolean mirarPosiciones(int [] tablero, int etapa){
                if (etapa > r-1){ 
                return false;
                }
                boolean ex = false;
                tablero[etapa] = -1;
                for (int i = 0; i < r; i++){
                    tablero[etapa] = tablero[etapa] + 1;
                    if(i != fil && etapa != colm){
                        if (validarPosicion(tablero,etapa)){
                            if (etapa != r-1){
                                ex = mirarPosiciones(tablero,etapa+1);                          
                       
                            }else{
                                cant ++;
                                imprimirTal(tablero);
                                System.out.println(cant);
                                return true;
                            }
                        }
                    }else{
                        System.out.println("1s");
                        System.out.println(etapa);
                    }
                }
          return ex;
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