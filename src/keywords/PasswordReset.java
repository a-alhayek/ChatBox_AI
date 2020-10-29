package keywords;

import java.util.ArrayList;

import binarytree.BinaryTree;
import binarytree.Node;

public class PasswordReset 
	{

	    private BinaryTree passwordreset;

	    public PasswordReset()
	    {
	        createTree();
	    }

	    public void createTree()
	    {
            String nodeName = "PasswordReset";
	        passwordreset = new BinaryTree();
	        ArrayList<String> array = new ArrayList<String>();
            int index = 2;

	        
	        
	        //Root 
	        //forgotten password
	        String[] keyWords=
	        {
	        			"password","reset","forgot","lost"
	        };
	        array = createKeys(keyWords);
	        String[] respondArr =
	        {
	            "No worries, what account do you need to reset?"
	        };
	        passwordreset.addTo(array, respondArr,nodeName,index);

	        
	        
	        
	        
	        
	        //Node1
	        //website
	        String[] keyWords1  = {
	            "navigator","outlook","navigate", "canvas"	        };
	        array = createKeys(keyWords1);
	        
	        String[] respondArr1 =
	        {
	            "Go to the website and click forget password..."+ "\n"+"continue to the link below with complete steps"
	            + "\n"+"link: https://ask.salemstate.edu/kb/reset-ssu-employee-account-password;"
	        };
	        passwordreset.addTo(array, respondArr1,nodeName,index);
	        
	        
	        
	    }

	    public Node getRoot()
	    {
	        return passwordreset.getRoot();
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
