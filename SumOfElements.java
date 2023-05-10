public class SumOfElements {
    static int arr[]= {8,4,12,6,5};
    static int sumOfElement(){
        int i;
        int sum=0;
        for(i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("sum of element="+sumOfElement());
    }
    
}
