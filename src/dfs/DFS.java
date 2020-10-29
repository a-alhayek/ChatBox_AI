/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfs;


/**
 *
 * @author ahmadalhayek
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import binarytree.BinaryTree;
import binarytree.Node;

/**
 *
 * @author ahmadalhayek
 */
public class DFS

{
    private TreeMap<Double, Node> map; // map that takes probibility as key and response as string
    private TreeMap<Double, Node> mapWifi;
    private TreeMap<Double, Node> mapIntro;
    private TreeMap<Double, Node> mapDownload;
    private TreeMap<Double, Node> mapPassword;
    private TreeMap<Double, Node> mapNull;
    private final String[] treesNames =
    {
        "","Intro","PasswordReset","Download","NullFind"
    };
    private int  index = 0;
    private double userInputLength; // user input length
    //private boolean found;
    private Random rand;

    public DFS()
    {
        rand = new Random();
        map = new TreeMap();
        mapWifi = new TreeMap();
        mapIntro = new TreeMap();
        mapDownload = new TreeMap();
        mapPassword = new TreeMap();
        mapNull = new TreeMap();

    }

    public void search( String userInput, Node node )
    {

        String[] arr = userInput.split(" ");

        userInputLength = ( double ) arr.length;

        System.out.println("");

        searchTree(arr, node);

    }

    private void searchTree( String[] arr, Node node )
    {

        if ( node == null || false == true )
        {

            return; // random return need fixing
        }
        ArrayList<String> value = node.getValue();
        ArrayList<String> respond;
        respond = node.getRespond();
        double matchNumber = 0;// how many words matching 
        /* if ( map.containsKey(1.0) ) // if i
         * {
         * return;
         * }
         * */

        if ( null != node.getNodename() )
        {
            switch ( node.getNodename() )
            {
                case "Intro":
                    if ( mapIntro.containsKey(1.0) )
                    {
                        return;
                    }
                    break;
                case "PasswordReset":
                    if ( mapPassword.containsKey(1.0) )
                    {
                        return;
                    }
                    break;
                case "Wifi":
                    if ( mapWifi.containsKey(1.0) )
                    {
                        return;
                    }
                    break;
                case "Download":
                    if ( mapDownload.containsKey(1.0) )
                    {
                        return;
                    }
                    break;
                case "NullFind":
                    if ( mapNull.containsKey(1.0) )
                    {
                        return;
                    }
                    break;
                default:
                    break;
            }
        }

        for ( String s : arr )
        {

            if ( value.contains(s) )
            {
                ++matchNumber;

            }

        }

        if ( respond.size() > 0 )
        {

            double key = ( double ) ( matchNumber / userInputLength );

            switch ( node.getNodename() )
            {
                case "Intro":
                    mapIntro.put(key, node);
                    break;
                case "PasswordReset":
                    mapPassword.put(key, node);
                    break;
                case "Wifi":
                    mapWifi.put(key, node);
                    break;
                case "Download":
                    mapDownload.put(key, node);
                    break;

                case "NullFind":
                    mapNull.put(key, node);
                    break;
                default:
                    break;
            }
            /* while ( map.containsKey(key) )
             * {
             * key = key - 0.0000000000001; // Question: can we have same probibility between the
             * nodes
             * }
             * map.put(key, respond);
             */
        }
        //  map.forEach((x,y) -> System.out.println(x + y));

        searchTree(arr, node.left);
        //stop all the operations

        searchTree(arr, node.right);

    }

    private void bestResponsds( String priority )
    {
        switch ( priority )
        {
            case "Intro":
                putBestKeys(mapIntro);
                putBestKeys(mapPassword);
                putBestKeys(mapWifi);
                putBestKeys(mapDownload);
                putBestKeys(mapNull);
                break;
            case "PasswordReset":
                putBestKeys(mapPassword);
                putBestKeys(mapIntro);
                putBestKeys(mapWifi);
                putBestKeys(mapDownload);
                putBestKeys(mapNull);

                break;

            case "Download":
                putBestKeys(mapDownload);
                putBestKeys(mapIntro);
                putBestKeys(mapPassword);
                putBestKeys(mapWifi);
                putBestKeys(mapNull);

                break;

            case "NullFind":
                putBestKeys(mapNull);
                putBestKeys(mapIntro);
                putBestKeys(mapPassword);
                putBestKeys(mapWifi);
                putBestKeys(mapDownload);

                break;
            default:
                putBestKeys(mapWifi);
                putBestKeys(mapIntro);
                putBestKeys(mapPassword);
                putBestKeys(mapDownload);
                putBestKeys(mapNull);
                break;
        }

    }

    private void putBestKeys( TreeMap<Double, Node> selectedMap )
    {
        Double key = selectedMap.floorKey(1.0);
        Node respond = selectedMap.get(key);

        while ( map.containsKey(key) )
        {
            key = key - 0.0000000000001; // Question: can we have same probibility between the nodes

        }
        map.put(key, respond);

    }

    public String getResponse()
    {
        bestResponsds(treesNames[index]);

        map.forEach((x, y) -> System.out.println(x + y.getRespond().toString()));
        ArrayList<String> respons = map.floorEntry(1.0).getValue().getRespond();// this will give the
        index = map.floorEntry(1.0).getValue().getIndex();
        reset();

        return respons.get(rand.nextInt(respons.size()));
    }

    private void reset()
    {
        map.clear();
        mapWifi.clear();
        mapIntro.clear();
        mapNull.clear();
        mapDownload.clear();
        mapPassword.clear();
    }

}
/* if ( node == null )
 * {
 *
 * System.out.println("Can you tell me about the issue again");
 * }
 * ArrayList<String> value = node.getValue();
 * String respond = "";
 * for ( String s : arr )
 * {
 * if ( value.contains(s) )
 * {
 *
 * respond += node.getRespond();
 * System.out.println("Found"+ respond.length() + " "+ node.getRespond());
 * break;
 * }
 * }
 *
 * if ( respond.length() > 0 )
 * {
 * System.out.print(respond);
 * System.out.println("Please enter an input :");
 * input.next();
 * String userInput = input.nextLine();
 * search(userInput, node);
 *
 * }
 * */

// debug DFS
/* if(node == null) {
 * return;
 * }
 * System.out.println(node.getValue().toString());
 * if (node.getRespond() != null)
 * System.out.println(node.getRespond());
 * */
