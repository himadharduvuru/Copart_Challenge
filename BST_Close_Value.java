
public class BST_Close_Value {
	
	// My approach isto Insert nodes in a BST 
	// and do a inorder traversal and compare the numbers and return the min number
	
	
	static Tree root = null;
	
	static int arr[];

	static class Tree{
		int data;
		Tree left; 
		Tree right;
		Tree(int val){
			data = val;
			left=right=null;
		}
	}
	
	
	/*
	 *  Method to insrt into a BST
	 */
	static void insert(Tree node, int value){
		
		if(node == null){
			if(root == null){
				root = new Tree(value);
			}
			else{
				node = new Tree(value);
			}
			
			return ;
		}
		else if (node.data <= value ){
				insert(node.right, value);
			}
		else{
				insert(node.right, value);
			}
		
	}
	
	
	
	static void inorder(Tree root){
	
		if(root.left != null){
			inorder(root.left);
		}
		System.out.println(root.data);
		if(root.right != null){
			inorder(root.right);
		}
	}
//	
//	static int find_One_Min(Tree root,int find){
//		
//		Tree previous = null;
//		Tree current = root;
//		
//		while(current != null){
//			
//			if(current.data == find){
//				if(current.left != null){
//					return current.left.data;
//				}
//				if(current.left == null){
//					
//					if(previous.data < find){
//					
//						return previous.data;
//						
//					}
//					else{
//						return -1;
//					}
//					
//				}
//			}
//			
//			if(current.data < find){
//				previous = current;
//				current = current.right;
//			}
//			else{
//				previous = current;
//				current = current.left;
//			}
//			
//			
//		}
//		
//		return 0;
//	}
	
	public static void main(String[] args) {
		
		BST_Close_Value my_tree = new BST_Close_Value();
		
		insert(my_tree.root, 5);
		insert(my_tree.root, 3);
		insert(my_tree.root, 4);
		insert(my_tree.root, 2);
		insert(my_tree.root, 1);
		
		inorder(my_tree.root);
		
//		my_Tree.root = new Tree(3);
//		my_Tree.root.left = new Tree(2);
//		my_Tree.root.left.left = new Tree(1);
//		my_Tree.root.right = new Tree(4);
//		my_Tree.root.right.right = new Tree(5);
		
//		int result = find_One_Min(my_tree.root, 1);
//		
//		if(result == -1 ){
//			System.out.println(" Provided number is aready the minimum in the Tree ");
//		}else{
//			System.out.println(result +" : Is the Next minimum value available");
//		}
		
		
	}

}

