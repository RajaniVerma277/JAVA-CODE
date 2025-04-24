/*
The outer loop picks elements one by one starting from the second element.

The inner loop compares the picked element with its predecessors and shifts larger elements to the right to make space for the key element.

The key is then placed in its correct position.
*/ 


public class insertion{
    public static void insertionsort(int[] array){
        for(int i=1;i<array.length;i++){
            int key = array[i];
            int j = i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }
    }
    public static void main(String args[]){
        int[] number = {12,11,13,5,6};
        System.out.println("before sorting");
        for(int num : number){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println("after sorting");
        insertionsort(number);
        for(int num : number){
            System.out.print(num+" ");

        }
    }
}