public class Punto3{
	public static void queens(int n) {
		  return queensAux(n,0, new int[n]);
	}
  
  private static void queensAux(int n, int columna, int[] tablero) {
     if (tablero[columna]-tablero[columna-n]==n) 
        System.out.println("Las reinas están en peligro");
        break;
     else
        queensAux(tablero[columna-n]+1,tablero[columna+1],tablero[]);
        queensAux(n);
	}
  
   public static boolean esValido(int[] tablero) {
		   for (int i = 0; i < tablero.length; i++)
          for (int j = i+1; j < tablero.length - 1; j++)
               //if ( tablero[i] - tablero[j] == i - j 
                //  || tablero[i] - tablero[j] == (i - j)*-1 )
             if ( Math.abs(tablero[i] - tablero[j]) == Math.abs(i - j ))                 
                     return false;
      return true;   
	 }
}