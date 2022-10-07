package WELCOME;

public class ArrayDuplicateFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {1,3,3,4,4};
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++)
				if(array[i]==array[j]) {
					System.out.println(array[j]);
					System.out.println(array[i]);
				}
		}

	}
}
