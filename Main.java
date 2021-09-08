public class Main {

  static class Node
  {
    int value;
    Node left;
    Node right;
    Node(int value)
    {
      this.value = value;
      left = null;
      right =null;
    }
  }

  public void insert(Node node, int value)
  {
    if(value<node.value)
    {
      if(node.left!=null)
      {
        insert(node.left,value);
      }
      else
      {
        node.left =new Node(value);
         System.out.println(" Inserted " + value + " to left of " + node.value);
      }
    }
    else if(value>node.value)
    {
      if(node.right!=null)
      {
        insert(node.right, value);
      }
      else
      {
        node.right = new Node(value);
        System.out.println("  Inserted " + value + " to right of "+ node.value);
      }
    }
  }

  public void traverseInorder(Node node)
  {
    if(node!=null)
    {
      traverseInorder(node.left);
      System.out.print(" "+node.value);
      traverseInorder(node.right);
    }
  }

  public static void main(String[] args) {
    Main tree = new Main();
    Node root = new Node(5);
    System.out.println("Binary Tree Example");
                System.out.println("Building tree with root value " + root.value);
                tree.insert(root, 2);
                tree.insert(root, 4);
                tree.insert(root, 8);
                tree.insert(root, 6);
                tree.insert(root, 7);
                tree.insert(root, 3);
                tree.insert(root, 9);
                System.out.println("Traversing tree in order");
                tree.traverseInorder(root);
  }
}