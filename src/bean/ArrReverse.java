package bean;


import java.util.ArrayList;


/**
 * @author Administrator
 */
public class ArrReverse {
    public  int[]  arrReverse( int[] arr) {
        int[] rear = new int[arr.length];
        for (int i = arr.length-1; i >=  0 ; i--) {
            rear[arr.length-i-1] = arr[i];
        }
        return rear;



    }

    public static void main(String[] args) {
        ArrReverse ar = new ArrReverse();
        int[] ints = ar.arrReverse(new int[]{1, 2, 3});
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}
