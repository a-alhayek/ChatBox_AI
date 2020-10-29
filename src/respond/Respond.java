/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respond;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

import binarytree.Node;
import dfs.DFS;
import keywords.Download;
import keywords.Intro;
import keywords.NullFind;
import keywords.PasswordReset;
import keywords.Wifi;

/**
 *
 * @author ahmadalhayek
 */
public class Respond
{
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */

    private static Wifi wifi1;// instatnce of wifi class
    private static Intro intro;
    private static Download download;
    private static NullFind nullFind;
    private static PasswordReset password;
    ;// an instance of intro class
    private static Scanner scanner;// scanner to takes in the user input
    private static boolean start;// start boolean to insilate the introdiction when application starts
    private static DFS dfs; // instane of Deep first search algorithm
    private static Node wifiNode;//= wifi1.getRoot();
    private static Node introNode;//= intro.getRoot();
    private static Node passNode;
    private static Node downloadNode;
    private static Node nullNode;

    public Respond()
    {
        // insilaizing the virables 
        wifi1 = new Wifi();
        intro = new Intro();
        password = new PasswordReset();
        download = new Download();
        nullFind = new NullFind();
        start = false;
        scanner = new Scanner(System.in);
        wifiNode = wifi1.getRoot();
        introNode = intro.getRoot();
        passNode = password.getRoot();
        downloadNode = download.getRoot();
        nullNode = nullFind.getRoot();
        dfs = new DFS();
        

        //call();
    }

    public String call(String userInput)
    {
      

        
        dfs.search(userInput, wifiNode);
        dfs.search(userInput, introNode);
        dfs.search(userInput, passNode);
        dfs.search(userInput, downloadNode);
        dfs.search(userInput, nullNode);
        //System.out.println();
        return dfs.getResponse();
        // call each tree and get the Respnse probibilty 

    }

}
