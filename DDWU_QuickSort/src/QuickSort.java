//알고리즘 과제 - 퀵 정렬

import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.print("10개의 데이터 입력: ");
		for (int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sort(arr, 0, arr.length - 1);
		
		System.out.println("퀵 정렬 결과");
		printArr(arr, arr.length);
		
		sc.close();
	}
	
	public static void sort(int[] A, int l, int r) {
		if (l < r) {
			int q = partition(A, l, r);
			sort(A, l, q - 1);
			sort(A, q + 1, r);
		}
	}
	
	public static int partition(int[] A, int left, int right) {
		int pivot = A[right]; //기준 원소
		int i = left - 1;
		
		for (int j = left; j < right; j++) {
			//기준원소보다 작으면 i값 증가 후 A[j]와 A[++i] 교환
			if (A[j] < pivot) {
				int tmp = A[j];
				A[j] = A[++i];
				A[i] = tmp;
			}
		}
		
		A[right] = A[++i];
		A[i] = pivot;
		
		return i;
		
		
	}
	
	public static void printArr(int[] A, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
	}

}
