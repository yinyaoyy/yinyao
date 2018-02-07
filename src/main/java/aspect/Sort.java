package aspect;

public class Sort {

	public static void main(String[] args) {
		
		int [] a = {1,2,56,65,76,32,12};
		sort(a);
		
		
	}
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for(int j = 0;j<arr.length-1-i;i++) {
				if(arr[j]>arr[j+1]) {
					int a = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
}
