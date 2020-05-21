public class SumOfNaturalNumbers {
    public static int Sum(int x){
        if(x==0){
             return 0;
        }
        return x+Sum((x-1));
    }

    public static void main(String[] args) {
        int output=Sum(7);
        System.out.println(output);
    }
}
