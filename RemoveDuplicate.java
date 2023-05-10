public class RemoveDuplicate {
    static int removeDuplicateElement(int a[], int n){
        if(n==0||n==1){
            return n;
        }
        int j=0;
        for(int i=0;i<n-1;i++){
            if(a[i]!=a[i+1]){
                a[j++]=a[i];
            };
        }
        a[j++]=a[n-1];
        return j;
    }
    public static void main(String[] args) {
        int arr[]= {10,10,20,20,20,30,40,40,50,50};
        int length= arr.length;
        length = removeDuplicateElement(arr,length);
        for(int i=0;i<length; i++){
            System.out.println(arr[i]+" ");
        }
    }    
}
