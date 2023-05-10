public class Reverse {
    static void reverse(int a[], int n){
        int b[]= new int[n];
        int len= n;
        for(int i=0; i<n; i++){
            b[len-1]=a[i];
            len=len-1;
        }
        System.out.println("Reverse of array is");
        for(int k=0; k<n; k++){
            System.out.println(b[k]);
        }
    }
    public static void main(String[] args) {
        int arr[]= {10,4,7,5,3,9,5,2};
        reverse(arr, arr.length);
    }
}
