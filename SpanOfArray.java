public class SpanOfArray {
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
        static int max(){
            int i;
            int max=arr[0];
            for(i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
        public static void main(String[] args) {
            //max();
            //min();
            System.out.println((+max())- ( +min()));
        }
    }
    
    

