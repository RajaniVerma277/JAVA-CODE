public class merge{
    public static void mergesort(int[] array,int left, int right){
        if(left<right){
            int mid = left+(right-left)/2;
            mergesort(array,left,mid);
            mergesort(array,mid+1,right);
            merge(array,left,mid,right);
        }
    }
    public static void merge(int[] array,int left, int mid,int right){
        int n1 = mid-left+1;
        int n2 = right-mid;
        int[] leftarray = new int[n1];
        int[] rightarray = new int[n2];
        for(int i=0;i<n1;i++){
            leftarray[i] = array[left+i];
        }
        for(int j=0;j<n2;j++){
            rightarray[j] = array[mid+1+j];
        }
    }
}