import java.util.Arrays;

public class MoveAllZerosEnd {
    

    public static void main(String[] args) {
        int arr[]={1,0,2,0,3,0,4,0,4,0};
        System.out.println("The Actual Array is: "+Arrays.toString(arr));
        System.out.println("The Result Array is: "+Arrays.toString(moveZeroEnd(arr)));
    }
    public static int[] moveZeroEnd(int a[]){

        int res[]=new int[a.length];
        int count=0;
        for(int i=0;i<a.length;i++){
            if (a[i]!=0) {
                res[count++]=a[i];
            }
        }
        while (count<a.length) {
            res[count++]=0;
        }
        return res;
    }
}
