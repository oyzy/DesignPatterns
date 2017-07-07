package designPatterns.structuralPattern.composite;

/**
 * Created by Administrator on 2017/7/7.
 */
public class Tree {

    TreeNode root = null;

    public Tree(String name){
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("..........");
    }
}
