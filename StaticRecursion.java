public class StaticRecursion {

    public static int Stat(int x){
        if(x>0){
            Stat((x-1)+x);
        }
        return 0;

    }

    public static void main(String[] args) {
        Stat(5);
        int x=5;
        System.out.println(x);
    }

}
