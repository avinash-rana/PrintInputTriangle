import java.util.Scanner;

/**
 * PrintInputTriangle
 */
public class PrintInputTriangle {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the max number for print number triangle");
        a=s.nextInt();
        for(int i= 1;i<=a;i++){
            int p=a;
            for(int j=p  ; j>=i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print(k);
            }
            for(int l = (i-1);l>=1;l--){
                System.out.print(l);
            }
        System.out.print("\n");
        }
        s.close();
    }
}
