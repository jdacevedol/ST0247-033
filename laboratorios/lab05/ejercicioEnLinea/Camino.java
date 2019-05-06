import java.util.Scanner;
public class Camino{
    int y;
    int x;
    public Rutas(){
        Scanner esc = new Scanner(System.in);
        int sce;
        String mat;
        int desechos;
        int x1;
        int y1;
        System.out.println("Introduzca el numero de escenarios");
        sce = esc.nextInt();
        System.out.println("introduzca el tamaño de la matriz");
        mat = esc.nextLine();
        String[] dat = mat.split(" ");
        x = Integer.parseInt(dat[0]);
        y = Integer.parseInt(dat[1]);
        int[][] matriz = new int[x][y];
        System.out.println("introduzca el lugar inicial del robot");
        mat = esc.nextLine();
        String[] dat = mat.split(" ");
        x = Integer.parseInt(dat[0]);
        y = Integer.parseInt(dat[1]);
        System.out.println("introduzca el numero de desechos");
        desechos = esc.nextLine();
        int rel = 0;
        for (int i=0; i < desechos, i++){
            System.out.println("introduzca posicion");
            mat = esc.nextLine();
            dat = mat.split(" ");
            x1 = Integer.parseInt(dat[0]);
            y1 = Integer.parseInt(dat[1]);
            int prim = xy(x1,y1,matriz);
            rel = prim + rel;
        }
        System.out.println(rel);
    }
    
    public int xy(int x1, int y1, int[][] matriz){
        int sum = 0;
        for(int i=x; i < matriz.length; i++){
            if(i == x1){
                for(int j=y; j < matriz[i].length; j++){
                    if(j == y1){
                        y = j
                        break;
                    }else{
                        sum++;
                    }
                }
                x = i;
                break;
            }else{
                sum++;
            }   
        }
     return sum;
    }
}