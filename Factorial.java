public class Factorial {
    public static int fact(int x){
        if(x==0 || x==1){
            return 1;
        }
        return x*(fact(x-1));
    }

    public static void main(String[] args) {
        int output=fact(1);
        
        System.out.println(output);

    }
}
