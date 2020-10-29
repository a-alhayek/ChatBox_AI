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
public class Node
{
    
    private ArrayList<String> value; // 
    public Node left;
    public Node right;
    private ArrayList<String> respond;
    private String nodeName;
    private int index;
    
    public Node (ArrayList<String> value, String nodeName,int index){
        this.value = value;
        respond = null;
        right = null;
        left = null;
        respond = new ArrayList<String>();
        this.nodeName = nodeName;
        this.index = index;
        
    }
    public void addStringToNode(String value){
       
        this.value.add(value);
    }
  
   
    public ArrayList<String> getValue(){
        return value;
    }
    public void setRespond(String respond){
        this.respond.add(respond);
    }
     public ArrayList<String> getRespond(){
         return respond;
        
    }
     public String getNodename(){
         return nodeName;
     }
     public int getIndex(){
         return index;
     }
   
    
}
