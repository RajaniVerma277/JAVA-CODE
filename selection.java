/*hello everyone
Today we are going to discuss  very important topic of language which is sorting
There are various type of sorting
1.Bubble sort 
2.selection sort
3.insertion sort
4.Merge sort
5.Quick sort
sorting is a process of arranging elements in a specific order ascending or descending .
sorting make it easier to search and manage data efficently
In this code we are going to discuss about selection sort
Selection Sort:

Finds the smallest element in the array and places it at the beginning.

Repeats the process for the remaining elements.

Time Complexity: O(n²)*/
public class selection{
    public static void selectionsort(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int minpos = i;
            for(int j = i+1 ; j<arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
            int temp = arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int sort[] ={5,4,1,3,2};
        selectionsort(sort);
    }
}