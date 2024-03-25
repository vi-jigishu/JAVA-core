import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int[] arr= {1, 65, 452, 66, 91, 566, 435, 112};
        int n= arr.length;
        System.out.println("Without ordr: "+ Arrays.toString(arr));
        //Swapping elements (asce ordr)
        for(int i=0; i<n; i++){
            for(int j=i+1;j<n; j++){
                if(arr[i]>arr[j]){
                    int a= arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
        }
        System.err.println("Asec ordr: "+Arrays.toString(arr));

    }
}