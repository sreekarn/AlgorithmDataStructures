public class Power {

    public static int pwr(int m,int n){
        if(n==0){
            return 1;
        }
        return pwr(m,n-1)*m;
    }

    public static void main(String[] args) {
        int output=pwr(2,3);
        System.out.println(output);

    }
}
