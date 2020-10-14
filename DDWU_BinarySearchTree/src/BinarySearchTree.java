//알고리즘 과제 - 이진탐색트리

import java.util.*;
public class BinarySearchTree {

	public static class TreeNode {
		private int key;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int key) {
			this.key = key;
			left = null;
			right = null;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeNode root = null;
		
		System.out.print("트리에 삽입할 값을 입력하세요(10개 입력): ");
		for (int i = 0; i < 10; i++) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		
		printTree(root); //중위순회로 출력
		System.out.println();
		
		while (true) {
			System.out.print("삭제할 값을 입력하세요(0입력 시 종료): ");
			int num = sc.nextInt();
			
			if (num != 0) {
				if (search(root, num) != null) {
					root = delete(root, num);
					printTree(root);
					System.out.println();
				} else {
					System.out.println("트리에 존재하지 않는 값입니다. 다시 입력하세요.");
				}	
			} else break;
		}
		
		sc.close();
	}
	
	public static TreeNode search(TreeNode node, int key) {
		if (node == null) {
			return null;
		}
		
		if (key == node.key) {
			return node;
		} else if (key < node.key) {
			return search(node.left, key);
		} else {
			return search(node.right, key);
		}
	}

	public static TreeNode insert(TreeNode root, int key) {
		TreeNode newNode = new TreeNode(key);
		
		if (root == null) {
			return newNode;
		}
		
		if (key < root.key) {
			root.left = insert(root.left, key);
		} else if (key > root.key) {
			root.right = insert(root.right, key);
		}
		
		return root;
	}
	
	public static TreeNode min_value_node (TreeNode node) {
		TreeNode current = node;
		
		while (current.left != null) {
			current = current.left;
		}
		return current;
	}
	
	public static TreeNode delete(TreeNode root, int key) {
		TreeNode temp;
		
		if (root == null) {
			return root;
		}
		
		if (key < root.key) {
			root.left = delete(root.left, key);
		} else if (key > root.key) {
			root.right = delete(root.right, key);
		} else {
			if (root.left == null) {
				temp = root.right;
				return temp;
			} else if (root.right == null) {
				temp = root.left;
				return temp;
			}
			
			temp = min_value_node(root.right);
			root.key = temp.key;
			root.right = delete(root.right, temp.key);
		}
		
		return root;
	}
	
	//중위순회로 출력
	public static void printTree(TreeNode root) {
		if (root != null) {
			printTree(root.left);
			System.out.print(root.key + " ");
			printTree(root.right);
		}
	}
}
