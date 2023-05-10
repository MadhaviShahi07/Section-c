public class Minimum {
    static int arr[]= {10,6,8,12,5,23,5,2,14};
    static int min(){
        int i;
        int min=arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Minimum is "+ min());
    }
}
