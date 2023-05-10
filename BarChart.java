public class BarChart {
    static int maximum(int a[], int n){
        int max=a[0];
        for(int i=0; i<n;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,0,5,7};
        int len= arr.length;
        int max= maximum(arr, len);
        for(int i=max;i>=1;i--){
            for(int j=0;j<len;j++){
                if(i<=arr[j]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
