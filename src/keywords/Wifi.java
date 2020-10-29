package keywords;


import java.util.ArrayList;

import binarytree.BinaryTree;
import binarytree.Node;

/**
 *
 * @author ahmadalhayek
 */
public class Wifi
{

    private BinaryTree wifi;

    public Wifi()
    {
        createTree();
    }

    public void createTree()
    {
        String nodeName = "Wifi";
        wifi = new BinaryTree();
        ArrayList<String> array = new ArrayList<String>();
        int index = 0;

//Root
//slow
        String[] keyWords =
        {

            "lag", "slow", "jamming", "low", "bad", "wifi", "connection", "connect"
        };
        array = createKeys(keyWords);
        String[] respondArr =
        {
            "How long has it been?"
        };
        wifi.addTo(array, respondArr,nodeName,index);

//Node1
//time constraint more than one weeks
        String[] keyWords1 =
        {
            "today", "shortly", "yesterday", "days", "ago"
        };
        array = createKeys(keyWords1);

        String[] respondArr1 =
        {
            "Have you tried to rest your device?"
        };
        wifi.addTo(array, respondArr1,nodeName,index);

// time contraint more than one week
        String[] keyWords2 =
        {
            "week", "long", "year", "while"
        };
        array = createKeys(keyWords2);

        String[] respondArr2 =
        {
            "Try another device or rest your device"
        };
        wifi.addTo(array, respondArr2,nodeName,index);

//Node3
// cannot join
        String[] keyWords3 =
        {
            "no", "not", "unable"
        };
        array = createKeys(keyWords3);
        String[] respondArr3 =
        {
            "What the name of the wifi you are trying to connect to?", "Can you please provide us with the name of the wifi?"
        };
        wifi.addTo(array, respondArr3,nodeName,index);

//Node4
        String[] keyWords4 =
        {
            "open", "salem"
        };
        array = createKeys(keyWords4);
        String[] respondArr4 =
        {
            "You can log in as a guess user but he connection may disconect afer 30min, We recommend salem state closed " +
             "if you are a student or faculty"
        };
        wifi.addTo(array, respondArr4,nodeName,index);

//Node5
        String[] keyWords5 =
        {
            "closed"
        };
        array = createKeys(keyWords5);
        String[] respondArr5 =
        {
            "Oh you must conenct to salem state closed with your Student ID as Username and passsword is you login password",
            "Use your SSU credidentials to login", "connect with your username and password from navigator"
        };
        wifi.addTo(array, respondArr5,nodeName,index);

//Node6
//computers
        String[] keyWords6 =
        {
            "computer", "laptop", "pc", "desktop"
        };
        array = createKeys(keyWords6);

        String[] respondArr6 =
        {
            "What the opperating System",
            "What is wrong with it "
        };
        wifi.addTo(array, respondArr6,nodeName,index);

//Node9
//Gaming Device
        String[] keyWords9 =
        {
            "ps4", "xbox", "360", "nintendo", "dsi", "playstation"
        };
        array = createKeys(keyWords9);

        String[] respondArr9 =
        {
            "What is your issue with these device",
            "Can you elaborate what the problem is"
        };
        wifi.addTo(array, respondArr9,nodeName,index);

//Node7
        String[] keyWords7 =
        {
            "windows"
        };
        array = createKeys(keyWords7);

        String[] respondArr7 =
        {
            "Please follow the instructions in Link : "
        };
        wifi.addTo(array, respondArr7,nodeName,index);

//Node8
        String[] keyWords8 =
        {
            "mac"
        };
        array = createKeys(keyWords8);

        String[] respondArr8 =
        {
            "Please follow the instructions in Link : "
        };
        wifi.addTo(array, respondArr8,nodeName,index);

    }

    public Node getRoot()
    {
        return wifi.getRoot();
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
