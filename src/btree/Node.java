/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree;

/**
 *
 * @author kamaj
 */
public class Node {
    private String data;
    private Node left;
    private Node right;

    public Node(String value) {
        data = new String(value);
        left = right = null;
    }
    public  Node (String value, Node left, Node right) {
        data = new String(value);
        this.left = left;
        this.right = right;
    }

    public String getData() {
        return data;
    }

    public Node left() {
        return left;
    }

    public Node right() {
        return right;
    }

    public void setLeft(Node tree) {
        left = tree;
    }

    public void setRight(Node tree) {
        right = tree;
    }

    @Override
    public String toString() {
        if(left == null && right == null){
            return "None";
        }
        if(left == null){
            return "right: " + right.getData();
        }
        if(right == null){
            return "left: " + left.getData();
        }
        return "left: " + left.getData() + " right: " + right.getData();
    }
}
