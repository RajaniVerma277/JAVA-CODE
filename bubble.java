class bubble{
	public static void main(string args[]){
		int arr[]={1,7,8,4};
		for(int i=0;i<arr.length-1;i++){
			int smallest=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[smallest]>arr[j]){
					int swap=j;
					int temp=arr[swap];
					arr[swap]=arr[smallest];
					arr[smallest]=temp;
				}
			}

		}
		System.out.println(arr);
	}
}
					