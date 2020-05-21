
import java.util.Arrays;

public class Reverse {

    public static int[] intArray = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {
        System.out.println(intArray.length);
        for(int start=0,end=intArray.length-1;start<=end;start++,end--){
            int aux=intArray[start];
            intArray[start]=intArray[end];
            intArray[end]=aux;
        }
        System.out.println(Arrays.toString(intArray));
    }


}






