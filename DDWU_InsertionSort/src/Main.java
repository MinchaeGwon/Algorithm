//알고리즘 과제 - 삽입 정렬

import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.print("10개의 데이터를 입력하세요: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		insertionSort(arr, arr.length);
	
		printArr(arr, arr.length);
		
		sc.close();

	}
	
	public static void insertionSort(int[] sort, int n) {
		for (int i = 1; i < n; i++) {
			int loc = i - 1;
			int newItem = sort[i]; //삽입할 값 저장
			
			while (loc >= 0 && newItem < sort[loc]) {
				sort[loc + 1] = sort[loc];
				loc--;
			}
			sort[loc + 1] = newItem; //최종 위치에 삽입
		}
		
	}
	
	public static void printArr(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	

}
