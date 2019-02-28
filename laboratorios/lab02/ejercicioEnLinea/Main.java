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
        for (int i = -1; i < num; i++){
            System.out.println("introduzca matriz");
            mat = lec.nextLine();
            for(int j = 0; j < mat.length(); j++){
                System.out.println(mat.charAt(j));
                if (mat.charAt(j) == '*'){
                    fil = i;
                    colm = j;
                }
            }
        }
        nReinas f = new nReinas(num,fil,colm);
        
    }
}
