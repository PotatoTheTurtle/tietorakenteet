/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree;

/**
 *
 * @author kamaj
 */
public class BinaryTree {

    private Node root;

    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }
    
    public BinaryTree() {
        root = null;
    }
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */
    
    private Node insertRecursive(Node current, String aData){ // boolean paluuarvoksi?
        if(current == null){
            return new Node(aData);
        }

        if (aData.length() < current.getData().length()) {
            current.setLeft(insertRecursive(current.left(), aData));
        }else if(aData.length() > current.getData().length()){
            current.setRight(insertRecursive(current.right(), aData));
        }else{
            return current;
        }

        return current;
    }

    public void insert(String aData){
        root = insertRecursive(root, aData);
    }

    private Node containsNodeRecursive(Node current, String aData){
        if (current == null) {
            return null;
        }
        if (aData.equals(current.getData())) {
            return current;
        }

        if(aData.length() < current.getData().length()){
            return containsNodeRecursive(current.left(), aData);
        }else{
            return containsNodeRecursive(current.right(), aData);
        }
    }


    public Node find(String aData){
        return containsNodeRecursive(root, aData);
    }

    private String findSmallestValue(Node current) {
        return current.left() == null ? current.getData() : findSmallestValue(current.left());
    }

    public void delete(String value){
        root = deleteRecursive(root, value);
    }

    private Node deleteRecursive(Node current, String aData){
        if (current == null) {
            return null;
        }

        if (aData.equals(current.getData())) {
            if (current.left() == null && current.right() == null) {
                return null;
            }

            if (current.left() == null) {
                return current.left();
            }

            if (current.right() == null) {
                return current.right();
            }

            String smallestValue = findSmallestValue(current.right());
            current.setData(smallestValue);
            current.setRight(deleteRecursive(current.right(), smallestValue));
            return current;
        }

        if (aData.length() < current.getData().length()) {
            current.setLeft(deleteRecursive(current.left(), aData));
            return current;
        }

        current.setRight(deleteRecursive(current.right(), aData));
        return current;
    }


    public void preOrder() {
        /*if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }
*/
    }
}
