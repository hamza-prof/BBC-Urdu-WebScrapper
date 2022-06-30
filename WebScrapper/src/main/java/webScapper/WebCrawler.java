/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webScapper;

import java.util.ArrayList;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Lenovo
 */
public class WebCrawler {
    ArrayList<String> webpages=new ArrayList<>();
    public ArrayList<String> getWebLinks(Document doc){
        for(Element links:doc.getElementsByClass("bbc-11krpir e1ibkbh74").select("a[href]")){
            System.out.println(links.absUrl("href"));
            webpages.add(links.absUrl("href"));
        }
        webpages.remove(0); webpages.remove(webpages.size()-1);
        return webpages;
    }
        
}
