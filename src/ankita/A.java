package ankita;

public class A {
	public static void main(String[] args) {
		int arr[] = {5,5,5};
		largestPerimeter(arr);
	}

	private static void largestPerimeter(int[] nums) {
		int peri = nums[0];
		int counter = 1;
		for(int i = 1; i<nums.length; i++){
			if(nums[i]<2*peri){
				peri = peri + nums[i];
				counter++;
			}
		}
		System.out.println(peri);
		System.out.println(counter);
		if(counter>2){
			System.out.println(peri);
		}else {
			System.out.println(-1);
		}
	}
}
