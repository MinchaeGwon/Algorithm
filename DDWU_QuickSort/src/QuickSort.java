//�˰��� ���� - �� ����

import java.util.*;
public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		System.out.print("10���� ������ �Է�: ");
		for (int i = 0 ; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sort(arr, 0, arr.length - 1);
		
		System.out.println("�� ���� ���");
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
		int pivot = A[right]; //���ؿ���
		int i = left - 1;
		
		for (int j = left; j < right; j++) {
			if (A[j] < pivot) { //���ؿ��Һ��� ������ i�� ���� �� A[j]�� A[++i] ��ȯ
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
