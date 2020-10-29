package keywords;

import java.util.ArrayList;

import binarytree.BinaryTree;
import binarytree.Node;

public class NullFind {

    private BinaryTree nullfind;

    public NullFind()
    {
        createTree();
    }

    public void createTree()
    {
        String nodeName = "NullFind";
        nullfind = new BinaryTree();
        ArrayList<String> array = new ArrayList<String>();
        int index = 4;

        
        
        //Root 
        
        String[] keyWords=
        {
        	null		
        };
        array = createKeys(keyWords);
        String[] respondArr =
        {
            "Sorry we could not be much help go to the Salem State IT page for mor help"+ "\n"
        +"We are open from 9AM to 5PM."
        };
        nullfind.addTo(array, respondArr,nodeName,index);

        
    }

    public Node getRoot()
    {
        return nullfind.getRoot();
    }

    private ArrayList<String> createKeys( String[] keyWords )
    {
        ArrayList<String> array = new ArrayList<String>();
        for ( String s : keyWords )
        {
            array.add(s);

        }
        return array;
    }
}
