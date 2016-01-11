//insertion_sort
public class InsertionSort{
	public static void main(String[] args){
	    sort();
	}
	public static void sort(){
	    int[] A = {10,9,8,7,6,5,4,3,2,1};
        System.out.print("A ");
		for (int j = 0; j<10; j++){
		    System.out.print(A[j]+" ");		
		}

	    for (int i=0; i<A.length; i++){
	        int temp = i;
	        while (temp > 0 && A[temp-1]>A[temp]){
	            int temp_b = A[temp];
	            A[temp] = A[temp-1];
	            A[temp-1] = temp_b;
	            temp = temp - 1;
	        }
	    }
	    System.out.println("");
        System.out.print("A ");
		for (int k = 0; k<10; k++){
		    System.out.print(A[k]+" ");		
		}
        System.out.println("");
	}



}