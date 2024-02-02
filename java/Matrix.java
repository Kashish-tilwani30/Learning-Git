import java.util.*;
public class Matrix{
    public static void main(string args[]) {
        Scanner Sc=new Scanner(system.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int[][] numbers=new int[rows][col];
        for (int i=0;i<rows;i++) {
            for (int j=0;j<col;j++) {
                
                numbers[i][j]=Sc.nextInt();
            }
       }
       for(int i =0;i<rows;i++){
        for(int j=0;j<=i;j++){
            System.out.print(numbers[i][j]+" ");
        }
           system.out.println();


       }
}
}