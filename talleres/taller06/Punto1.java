public class Punto1
{
    public Punto1(int n, int [] denominaciones){
        int [] mon = new int[denominaciones.length];
        int cont = 0;
        boolean resp = true;
        while(cont < denominaciones.length){
            int aux = n;
            mon[cont] = mon[cont] + 1;
            n = n-(denominaciones[cont]*mon[cont]);
            if (n < denominaciones[cont] && n > 0){
                cont++;
            }else if (n < 0){
                n = aux;
                mon[cont] = 0;
                cont++; 
            }else if(cont == denominaciones.length){
            
            }
        }
        mostrar(mon);
    }
    
    public void mostrar(int [] resp){
        for(int i=0; i < resp.length; i++){
            System.out.println(resp[i]);
        }
    }
}
