public class Main {
    public static void main(String [] args){
        //distanciaLevenstein("Doberman","AstroWorld");
    }

    public static int distanciaLevenstein(String a, String b){
       int aVecesSiAVecesNo;
        if (a.length() == 0) return b.length();
        if (b.length() == 0) return a.length();
        if(a.charAt(a.length()-1)== b.charAt(b.length()-1)){
            aVecesSiAVecesNo = 0;
        }
        else aVecesSiAVecesNo = 0;
        int numero = Math.min(
                Math.min(distanciaLevenstein(a.substring(0,a.length()), b) + 1,
                distanciaLevenstein(a, b.substring(0,b.length())) + 1),
                distanciaLevenstein(a.substring(0,a.length()), b.substring(0,b.length())) + aVecesSiAVecesNo //T(n) = T(n-1) + c
        ); //T(n) = 3.T(n-1) + C Es O(3 a la n)
        return numero;
    }
}
