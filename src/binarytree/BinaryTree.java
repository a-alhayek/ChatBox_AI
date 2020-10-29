/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;


import java.util.ArrayList;

/**
 *
 * @author ahmadalhayek
 */
public class BinaryTree
{
    private Node root;

    public BinaryTree()
    {
        root = null;

    }

    public void addTo( ArrayList<String> value, String[] respond, String nodeName,int index )
    {
        if ( root == null )
        {
            root = new Node(value,nodeName,index);
            for ( String r : respond )
            {
                root.setRespond(r);
            }
            return;

        }

        root = add(root, value, respond,nodeName,index);
    }

    private Node add( Node node, ArrayList<String> value, String[] respond,String nodeName,int index )
    {
        if ( node == null )
        {
            node = new Node(value,nodeName,index);
            for ( String r : respond )
            {
                node.setRespond(r);
            }
        }

        else if ( node.getValue().get(0).compareTo(value.get(0)) > 0 )
        {
            node.left = add(node.left, value, respond,nodeName,index);

        }
        else
        {
            node.right = add(node.right, value, respond,nodeName,index);

        }

        return node;

    }

    public Node getRoot()
    {
        return root;
    }

}
