public class ToFindMax {
    static int arr[]= {10,8,12,4,16,7};
    static void maximum(){
        int i=0;
        int max=arr[0];
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        //return max;
        System.out.println(max);
    }
    public static void main(String[] args) {
        //System.out.println("Maximum is="+ maximum());
        maximum();
    }
}
