public class Punto1_2 {
    int r;
    public void Punto1_2(int rei){
        int [] tal = new int[rei];
        r = rei;
        mirarPosiciones(tal,0);
    }

    public boolean mirarPosiciones(int [] tablero, int etapa){
        tablero[etapa] = -1;
        boolean ex = false;
        if (etapa > r) return false;
        do {
            tablero[etapa] = tablero[etapa] + 1;
            if (validarPosicion(tablero,etapa)){
                if (etapa != r-1){
                    ex = mirarPosiciones(tablero,etapa+1);
                }else{
                    ex = true;
                    imprimirTal(tablero);
                }
            }
        } while(tablero[etapa]==r || ex);

        return ex;
    }

    public boolean validarPosicion(int [] tablero,int etapa){
        boolean resp = true;
        for(int i = 0; i < etapa;i++){
            if (tablero[i] == tablero[etapa]  || Math.abs(tablero[i] - tablero[etapa]) == Math.abs(i-etapa)){
                return !resp;
            }
        }

        return resp;
    }

    public void imprimirTal(int [] tal){
        for(int i = 0; i < tal.length; i++){
            System.out.print(tal[i]);
        }
    }

}
