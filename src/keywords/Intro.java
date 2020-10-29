/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keywords;


import java.util.ArrayList;

import binarytree.BinaryTree;
import binarytree.Node;


/**
 *
 * @author ahmadalhayek
 */
public class Intro
{
    private BinaryTree intro ;
    
    public Intro(){
       createTree();
    }
    public void createTree()
    {
        String nodeName = "Intro";
        intro = new BinaryTree();
        ArrayList<String> array = new ArrayList<String>();
        int index = 1;

        
        
        //Root 
        String[] keyWords =
        {
            "hi" , "hello" ,"howdy", "hey", "whats up"
        };
        array = createKeys(keyWords);
        String[] respondArr =
        {
            "Hi, how's it going","hi there, how are you"
        };
        intro.addTo(array, respondArr,nodeName,index);

        
        
        
        
        
        //Node1
        // User is feeling good
        String[] keyWords1 = {
            "good","great","awesome","wonderful","not","feeling","well"//possible of more key words
        };
        array = createKeys(keyWords1);
        
        String[] respondArr1 =
        {
            "That's good to hear! Do you have any 'IT problems' " // possible of more answers
        };
        intro.addTo(array, respondArr1,nodeName,index);

        
        
        
        
        
        //Node2
        //User is feeling bad
        String[] keyWords2 = {"terribe", "bad","awful", "dissapointed","not", "feeling"};
        array = createKeys(keyWords2);
        String[] respondArr2 =
        {
            "would you like to here an IT joke?"
        };
        intro.addTo(array, respondArr2,nodeName,index);
        
        
        
        
        //Node3
        String[] keyWords3 = {"no", "nah", "im","good","joke"};
        array = createKeys(keyWords3);
        String[] respondArr3 =
        {
            "Well do you have have an IT problem?"
        };
        intro.addTo(array, respondArr3,nodeName,index);

        
        
        //Node4
        String[] keyWords4 = {"yes","yeah","for sure","joke"};
        array = createKeys(keyWords4);    
        String[] respondArr4 =
        {
            "Did you hear about the monkeys who shared an Amazon account? They were Prime mates."
            + "\n"+"this is an IT Chat bot not a personal therapy session have a nice day",
            "Dont use beef stew as a computer password. Its not stroganoff."
            + "\n"+"this is an IT Chat bot not a personal therapy session have a nice day",
            "Why are iPhone chargers not called Apple Juice?!"
            + "\n"+"this is an IT Chat bot not a personal therapy session have a nice day",
            "Have you heard of that new band 1023 Megabytes? Theyre pretty good, but they dont have a gig just yet."
            +"\n" +"this is an IT Chat bot not a personal therapy session have a nice day"
        };
        intro.addTo(array, respondArr4,nodeName,index);

        

    }

    public Node getRoot()
    {
        return intro.getRoot();
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
