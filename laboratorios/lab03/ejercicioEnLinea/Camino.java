import java.util.ArrayList;
public class Camino{
    ArrayList<String> con = new ArrayList<String>();
    int sum = 1;
    
    public Camino(int n,int m, ArrayList<String> conexion){
        con = conexion;
        int[] areg = new int[n-1];
        Corto(n,m,n,areg,0);
    }

    public void Corto(int n, int m,int min,int[] areg,int i){
        String ex;
        String n1;
        String n2;
            ex = con.get(i);
            n1 = "" + ex.charAt(2);
            if (Integer.parseInt(n1) < min){
                min = Integer.parseInt(n1);
                n1 = "" + ex.charAt(0);
                n2 = "" + ex.charAt(1);
                areg [sum-1] = Integer.parseInt(n1);
                areg [sum] = Integer.parseInt(n2);
            }else if(Integer.parseInt(n1) == min){
                sum = sum+2;
                n1 = "" + ex.charAt(0);
                n2 = "" + ex.charAt(1);
                areg [sum-1] = Integer.parseInt(n1);
                areg [sum] = Integer.parseInt(n2);
            }
            if( i == m-1){
                for(int j=0; j < areg.length; j++){
                     System.out.println(areg[j]);
                }
            }else{
                Corto(n,m,min,areg,i+1);
            }
    }
}