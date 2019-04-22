import java.util.Scanner;
public class Rutas{
    public Rutas(){
        Scanner esc = new Scanner(System.in);
        String datos;
        System.out.println("introduzca n,d,r");
        datos = esc.nextLine();
        String[] dat = datos.split(" ");
        int n = Integer.parseInt(dat[0]);
        int d = Integer.parseInt(dat[1]);
        int r = Integer.parseInt(dat[2]);
        if (n > 0 && n < 100 && d > 0 && d < 10000 && r > 0 && r <= 5){
            int prim = Primera(n,d,r);
            int seg = Segunda(n,d,r);
            int rel = prim + seg;
            System.out.println("Resultado: " + rel);
        }else{
            System.out.println("Valores no validos");
        }
        while(1 == 1){
            System.out.println("introduzca n,d,r");
            datos = esc.nextLine();
            dat = datos.split(" ");
            n = Integer.parseInt(dat[0]);
            d = Integer.parseInt(dat[1]);
            r = Integer.parseInt(dat[2]);
            if (n == 0 && d == 0 && r == 0){
                break;
            }
            if (n > 0 && n < 100 && d > 0 && d < 10000 && r > 0 && r <= 5){
                int prim = Primera(n,d,r);
                int seg = Segunda(n,d,r);
                int rel = prim + seg;
                System.out.println("Resultado: " + rel);
            }else{
                System.out.println("Valores no validos");
            }
        }
    }

    public int Primera(int n, int d, int r){
        Scanner esc = new Scanner(System.in);
        int rel;
        System.out.println("introduzca primera ruta");
        String prim = esc.nextLine();
        String[] dat = prim.split(" ");
        int tol = 0;
        if(n == dat.length){
            for(int i=0; i < dat.length; i++){
                tol= tol + Integer.parseInt(dat[i]);
            }
            if (tol > d){
                tol = tol - d;
                rel = tol * r;
            }else{
                rel = 0;
            }
            System.out.println("Ruta 1: " + rel);
            return rel;
        }else{
            System.out.println("Primera ruta no valida");
            return 0;
        }
    }

    public int Segunda(int n, int d, int r){
        Scanner esc = new Scanner(System.in);
        int rel;
        System.out.println("introduzca segunda ruta");
        String seg = esc.nextLine();
        String[] dat = seg.split(" ");
        int tol = 0;
        if(n == dat.length){
            for(int i=0; i < dat.length; i++){
                tol= tol + Integer.parseInt(dat[i]);
            }
            if (tol > d){
                tol = tol - d;
                rel = tol * r;
            }else{
                rel = 0;
            }
            System.out.println("Ruta 2: " + rel);
            return rel;
        }else{
            System.out.println("Segunda ruta no valida");
            return 0;
        }
    }
}