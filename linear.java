public class linear{
    public static int search(String[] menu,String order){
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(order)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String[] menu ={"samosa","idli","dosa","macroni"};
        String order="samosa";
        int index = search(menu,order);
        if(index==-1){
            System.out.println("key not found");
        }else{
            System.out.println("the key found at index"+index);
        }

    }
}