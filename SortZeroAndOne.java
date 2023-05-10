public class SortZeroAndOne {
    static int arr[]= {0,1,0,0,1,0,1,1,1,0,1};
    static int countZero(){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int len=arr.length;
        int count=countZero();
        for(int i=0;i<count;i++){
            System.out.print(0+"\t");
        }
        for(int i=0;i<(len-count);i++){
            System.out.print(1+"\t");
        }

        
    }
}
