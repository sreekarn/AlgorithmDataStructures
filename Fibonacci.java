public class Fibonacci {
    public static int Fib(int x){
        if(x<=1){

            return x;
        }
        return Fib(x-2)+Fib(x-1);
    }

    public static void main(String[] args) {
        int output=Fib(9);
        System.out.println(output);
    }
}
