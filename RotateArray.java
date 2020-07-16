package com.netz.Array;

public class RotateArray {

	public static void main(String args[]) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };// 3,4,5,6,7,1,2

		int rotate = 2;

		// //// Temp Array logic

		int tempArray[] = new int[2];
		for (int i = 0; i < 2; i++) {
			tempArray[i] = arr[i];
		}

		for (int i = 0; i < arr.length - rotate; i++) {
			arr[i] = arr[i + rotate];
		}

		for (int i = 0; i <= tempArray.length - 1; i++) {

			arr[(arr.length - rotate)] = tempArray[i];
			rotate--;
		}

		for (int i = 0; i <= arr.length - 1; i++)
			System.out.print(arr[i] + " ");

		// /// shift array to left by 1. n keep the arr[0] in temp. Rotate 2
		// times keeping the arr[0],arr[1] in temp.

		for (int i = 0; i < rotate; i++) {
			int temp = arr[0];
			for (int j = 0; j <= arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[arr.length - i] = temp;
		}
		System.out.println();
		for (int i = 0; i <= arr.length - 1; i++)
			System.out.print(arr[i] + " ");

		// //LCM

		System.out.println();

		int a = 20;
		int b = 30;
		int LCM = a > b ? a : b;

		while (Boolean.TRUE) {

			if (LCM % a == 0 && LCM % b == 0) {
				System.out.println("LMC >" + LCM);
				break;
			}
			LCM++;

		}
		
		
		int gcd = 1;
		int i=2;
		while(i<b){
			if(a%i ==0 && b%i==0){
				gcd = gcd*i;
				i++;
			}
		}
		
		System.out.println("GCD >"+gcd);



	}

}
