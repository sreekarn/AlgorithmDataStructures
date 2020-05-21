import java.util.Scanner;

public class TowerOfHanoi {
    public static int TOH(int n,int a,int b,int c){
        if(n>0){
            TOH(n-1,a,c,b);
            System.out.println("Move disk " + n +  " from rod " +  a + " to rod " + c);
            TOH(n-1,b,a,c);

        }
        return 1;
    }

    public static void main(String[] args) {
        TowerOfHanoi toh=new TowerOfHanoi();
        System.out.println("Enter the number of disks: ");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.close();
        System.out.println("Move disks as below: ");
        toh.TOH(n,1,2,3);

    }
}
