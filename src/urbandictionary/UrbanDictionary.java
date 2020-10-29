/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package urbandictionary;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author ahmadalhayek
 */
public class UrbanDictionary
{
    private String urbanDictionaryLink;
    private Document document;
    private Elements wordMeaning;
    private Elements wordExample;

    public UrbanDictionary()
    {
        urbanDictionaryLink = "https://www.urbandictionary.com/define.php?term=";
    }

    public ArrayList<String> findDefinition( String word )
    {
        ArrayList<String> everyDef = new ArrayList<String>();
        String url;
        url = urbanDictionaryLink + word;

        try
        {
            document = Jsoup.connect(url).get();
            document.outputSettings().prettyPrint(false);
            wordMeaning = document.select("div.meaning");
            wordExample = document.select("div.example");
           
        
            
            
            while ( !wordMeaning.isEmpty() )
            {

                String s = wordMeaning.remove(0).text();
                everyDef.add(s);
                s = wordExample.remove(0).text();
                everyDef.add(s);

            }
          

        }
        catch ( Exception e )
        {
            e.printStackTrace();
        }
        return everyDef;
    }

}
