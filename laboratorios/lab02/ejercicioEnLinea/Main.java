import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner lec = new Scanner(System.in);
        int num;
        int fil = -1;
        int colm = -1;
        String mat;
        System.out.println("introduzca numero");
        num = lec.nextInt();
        for (int i = 0; i < num; i++){
            System.out.println("introduzca matriz");
            mat = lec.nextLine();
            for(int j = 0; j < mat.length(); j++){
                System.out.println(mat.charAt(2));
                if (mat.charAt(i) == '*'){
                    fil = i;
                    colm = j;
                }
            }
        }
        System.out.println(fil);
        System.out.println(colm);
        nReinas f = new nReinas(num,fil,colm);
        
    }
}