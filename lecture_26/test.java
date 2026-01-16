public class test {
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9};
        int n=arr.length-1;
        int k=15;
        int l=0;
        int max=0;
        int r=0;
        int sum=0;
        while(r<=n){
            if(sum==k){
               int x=r-l;
               if(x>max){
                   max=x;
               }
               
            }
            else if(sum<k){
                
                sum=sum+arr[r];
                r++;
            }
            else{
                sum=sum-arr[l];
                l++;
            }
        }
        System.out.println(max);
    }
}
