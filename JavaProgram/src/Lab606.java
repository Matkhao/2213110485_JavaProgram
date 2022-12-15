import javax.swing.*;

public class Lab606 {
	static boolean check = false;
	static int[] nums = {25, 78, 41, 22, 36, 85, 37};
	public static void main(String[] args) {
		int array = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while(!checkIndex(nums,array)) {
			array = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
		};
		int curr = currentData(nums,array);
		JOptionPane.showMessageDialog(null,
				"Current data,nums["+array+"] is "+curr + "\n" +
				(array!=0
				? "Previous data,nums["+(array-1)+"] is " + prevData(nums,array)
				: "No Previous data")
				+ "\n" +
				(array!= nums.length
				?"Next data,nums["+(array+1)+"] is " + nextData(nums,array)
				: "No next data"));
	}

	public static boolean checkIndex(int[] nums , int index) {
		return index >= nums.length?false:true;
	}
	
	public static int currentData(int[] nums , int index) {
		
		return nums[index];
	}
	public static int prevData(int[] nums , int index) {
		
		return nums[index-1];
	}
	public static int nextData(int[] nums , int index) {
		
		return nums[index+1];
	}
}
