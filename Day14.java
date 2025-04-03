/**Day 14*/
import java.io.*;
import java.util.*;

public class Day14 {
	public static void main(String [] args) {
		int [][] nums = {{23,45,78,12},{56,90,34,67},{89,21,43,76}};

		//notice how the data type matches the method return type
		int [] max = maxValue(nums);

		//toString method to print the array in a suitable format
		System.out.println(Arrays.toString(max));

		int [] maxCol = maxColumn(nums);

		System.out.println(Arrays.toString(maxCol));

		int [][] mxnArray = transformation(nums);

		//note the method from imported libaries are case sensitive
		System.out.println(Arrays.deepToString(mxnArray));
	}

	/**
	 * Method to calculate the maximum value in each row
	 * 
	 * @param the 2d array nums
	 * @return the array containing the max value of each row*/
	private static int[] maxValue(int[][] nums) {
		int max = 0;
		int[] maxArray = new int[3];

		for (int i = 0; i < nums.length; i++) {
			//assign the first value of the array as the max
			max = nums[i][0];
			for (int j = 0; j < nums[i].length - 1; j++) {
				//if the value we're comapring is greater than the current max 
				//value assign it to max variable
				//otherwise the max stays the same
				if (nums[i][j] > max) {
					max = nums[i][j];
				}
				else {
					max = max;
				}

				//I kept this to remind myself of the inefficient method
				//although it worked there was a simpler way
				// //these if statements assign the max values to an array
				// if (i == 0) {
				// 	maxArray[0] = max;
				// }
				// else if (i == 1) {
				// 	maxArray[1] = max;
				// }
				// else {
				// 	maxArray[2] = max;
				// }
			}
			//so I used this line to make my code more efficient
			/*Rather than using if statement to fill the array
			I took advantage of the loop*/
			/*I'm glad it worked cuz it means I'm learning more 
			and I understand the positioning of my code better*/
			maxArray[i] = max;
		}

		return maxArray;
	}

	/**
	 * Method to calculate the maximum value in each column
	 * 
	 * @param the 2d array nums
	 * @return the array containing the max value of each column*/
	private static int[] maxColumn(int[][] nums) {
		//declare and initialise variable
		int maxVal = 0;
		//allocate space for array
		int [] maxValColumn = new int [4];

		//loop through the array as columns instead or rows
		/*ok so this was a very subtle thing that I didn't
		notice was that I was using i in the first loop condition
		to refer to the rows and using it to refer to the columns
		which was causing an out of bound error because there are
		more columns than rows*/
		for (int i = 0; i < nums[0].length; i++) {
			maxVal = nums[0][i];
			for (int j = 0; j < nums.length; j++) {
				//find the max in the column
				if (nums[j][i] > maxVal) {
					maxVal = nums[j][i];
				}
				else 
					maxVal = maxVal;
			}
			//add the value to the array
			/*thank God I realised there are 4 columns so I
			changed how much space I allocated*/
			maxValColumn[i] = maxVal;	
		}

		return maxValColumn;
	}

	/**
	 * Method to calculate the transformed matrix
	 * 
	 * @param the 2d array nums
	 * @return the 2d array of the transformed matrix*/
	private static int[][] transformation(int[][] nums) {
		//declare and allocate memory for a 2d array in which 
		//column and row numbers are swapped
		int[][] transformed = new int [nums[0].length][nums.length];

		//I think easiest way is to traverse column major wise
		//and just input values as such
		//I also realised form the last method that using i and j gets confusing
		for (int col = 0; col < nums[0].length; col++) {
			for(int row = 0; row < nums.length; row++) {
				transformed[col][row] = nums[row][col];
			}
		} 

		return transformed;
	}
}