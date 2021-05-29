import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private Node root;


    public boolean search(int key){
        return searchTree(key, root);
    }

    private boolean searchTree(int key, Node parent) {
        if (parent == null)
            return false;
        if (key == parent.value)
            return true;
        else if(key < parent.value)
            return searchTree(key, parent.left);
        else
            return searchTree(key, parent.right);
    }


    //loop/recurse to insert in correct position.
    public void insert(Integer value){
        root = insertNode(value, root, root);
    }

    private Node insertNode(Integer value, Node node, Node parent){
        if(node == null){
            node = new Node(value);
            node.parent = parent;
        }else if(value > node.value){
            node.right = insertNode(value,node.right, node);
        }else if (value < node.value){
            node.left = insertNode(value,node.left, node);
        }
        //else duplicates wont be inserted.
        return node;
    }

    public List<Integer> traverse(){
        //in order traversal - DFS
        return traverseTree(root, new ArrayList<>());
    }

    public List<Integer> traverseBFS(){
        List<Integer> result = new ArrayList<>();
        Queue<Node> queue = new Queue<>();
        queue.enqueue(root);

        Node currentNode;
        while(queue.size() > 0){
            currentNode = queue.dequeue().get();    //Already checked in if statement queue is not empty
            result.add(currentNode.value);
            if(currentNode.left !=null)
                queue.enqueue(currentNode.left);
            if(currentNode.right !=null)
                queue.enqueue(currentNode.right);
        }
        return result;
    }

    private List<Integer> traverseTree(Node node, List<Integer> data) {
        //DFS
        if(node == null)
            return data;
        traverseTree(node.left,data);
        data.add(node.value);
        System.out.println("current: " + node.value + " parent: " + (node.parent !=null ? node.parent.value : "null"));
        traverseTree(node.right,data);

        return data;
    }

    public void delete (int value){
        remove(value, root);
    }

    private void remove(int value, Node node){
        if (node != null) {
            if (value > node.value)
                remove(value, node.right);
            else if (value < node.value)
                remove(value, node.left);
            else{
                //case of no child
                if (node.right == node.left) {//this will be true only if both are null
                    //remove the node - i.e mark the parent as null, if parent is null, then mark root as null.
                    replaceNodeInParent(node, null);
                } else if (node.right != null && node.left != null) { //case of 2 child
                    Node successorNode = successor(node.right);
                    node.value = successorNode.value;
                    remove(successorNode.value, successorNode);
                } else if (node.right != null) {    //case of one right child
                    replaceNodeInParent(node, node.right);
                } else {      //case of one left child
                    replaceNodeInParent(node, node.left);
                }

            }
        }
    }

    private void replaceNodeInParent(Node current, Node newNode) {
        if(current.parent != null){
            if(current.value == current.parent.left.value){
                current.parent.left = newNode;
            }else{
                current.parent.right = newNode;
            }
        }

        if (newNode!=null){
            newNode.parent = current.parent;
        }
        if(current == root){
            root=newNode;
        }
        //what if root is the only node and it needs to be deleted?
    }

    public int getRoot(){
        if (root!=null)
            return root.value;
        else
            return Integer.MIN_VALUE;
    }

    private Node successor(Node node) {
        //successor is the left most child of this subtree
        //assumption the caller is passing the root of its own right subtree.
        if (node.left == null)
            return node;
        else
            return successor(node.left);
    }

//    private Node search(int value, Node currentNode){
//        if (currentNode == null){
//            return null;  //stop recursion.
//        }else if (currentNode.value == value){
//            return currentNode;
//        }else if(currentNode.value > value){
//            return search(value,currentNode.left);
//        }else{
//            return search(value,currentNode.right);
//        }
//    }

    private static class Node{
        private int value;
        private Node left=null;
        private Node right=null;
        private Node parent=null;

        Node(Integer value) {
            this.value = value;
        }

    }

}
