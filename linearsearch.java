public class linearsearch{
    public static int search(int numbers[] , int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[] ={1,2,5,7,10,4,5};
        int key=10;
        int index = search(number,key);
        if(index==-1){
            System.out.println("key not found");
        }else{
            System.out.println("the key found at index"+index);
        }

    }
}