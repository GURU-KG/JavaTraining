 class ArrReverseLastthreeDigit {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        
       int temp1=arr[3];
       arr[3]=arr[5];
       arr[5]=temp1;
       
       int temp2=arr[4];
       arr[4]=arr[4];
       
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]);
       }
    }
}
