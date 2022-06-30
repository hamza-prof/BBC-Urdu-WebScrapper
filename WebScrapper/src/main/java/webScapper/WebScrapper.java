/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package webScapper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Lenovo
 */
public class WebScrapper {

    private String text = "Story,Label\n";
    private String url = null;
    private Document doc = null;
    public String data;
    public String filedata;
    public String filename;
    public WebScrapper(){}
    public WebScrapper(String url) throws IOException {
        if(url.equals("https://www.bbc.com/urdu/topics/cjgn7n9zzq7t")){
            filename="Pakistan";
        }else if(url.equals("https://www.bbc.com/urdu/topics/cl8l9mveql2t")){
            filename="Near";
        }else if(url.equals("https://www.bbc.com/urdu/topics/cw57v2pmll9t")){
            filename="World";
        }else if(url.equals("https://www.bbc.com/urdu/topics/c340q0p2585t")){
            filename="Sports";
        }else if(url.equals("https://www.bbc.com/urdu/topics/ckdxnx900n5t")){
            filename="Entertainment";
        }else if(url.equals("https://www.bbc.com/urdu/topics/cjgn7n9zzq7t")){
            filename="Science";
        }
        this.url = url + "/page/";

    }
//    public void LinkWithURL(String url, String label) {
//        try {
//            Document doc = Jsoup.connect(url).get();
//            //parseMethod(html,"qa-heading-link",label);
//            for (String links : new WebCrawler().getWebLinks(doc)){
//                doc = Jsoup.connect(links).get();
//                scrape(doc,label);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public String scrape() throws IOException {
        
        BufferedWriter filewriter = new BufferedWriter(new FileWriter(filename+".txt"));
        String data="";
        for (int i = 1; i <= 10; i++) {
            //Make a connection
            doc = Jsoup.connect(url + i).get();
            //Getting title of Category
            System.out.print("Title of New:"+doc.title());
            
            //Save title to csv file
            filewriter.write("Title of New" + doc.title());
            //Fetching a story
            Elements categories = doc.getElementsByClass("qa-story-cta-link");
            for (Element e : categories) {
                //Getting the url of story detailed
                String newsUrl = e.absUrl("href");
                System.out.println(newsUrl);
                //Connect with story detailed url
                Document detailed = Jsoup.connect(newsUrl).get();
                //Getting title of story
                String heading = null;
                try {
                    heading = detailed.getElementById("content").text();
                } catch (NullPointerException ex) {
                    System.out.println("100 Stories Complete");
                   filewriter.newLine();
                    filewriter.write("You Have read 100 stories for further Detailes visit"+url);
                    filewriter.flush();
                    filewriter.close();
                    return null;
                }
                data+="Story: "+heading;
                System.out.println("Story: "+heading);
                
                filewriter.newLine();
                filewriter.write("Title of New" + doc.title());
                //Fetching paragraph
                Elements paragraph = detailed.getElementsByClass("bbc-yabuuk e1cc2ql70");
                for (Element para : paragraph) {
                    data+="\n "+para.text();
                    System.out.println(para.text());
                    filewriter.newLine();
                    filewriter.write(para.text());
                }
            }
        }
        //Make buffer empty
        filewriter.flush();
        //Close the file
        filewriter.close();
        this.data=data;
        return this.data;
    }
    public String readFile(String file) throws FileNotFoundException, IOException{
        BufferedReader filereader=new BufferedReader(new FileReader("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\WebScrapper\\"+file+".txt"));
        String str;
        while((str=filereader.readLine())!=null){
            filedata+=str+"\n";
        }
        return filedata;
    }
    public int noOfWords(){
        return noOfWords(data);
    }
    public int noOfWords(String str){
        return str.split("").length;
    }
    public int uniqueWords(){
        return uniqueWords(data);
    }
    public int uniqueWords(String str){
        return Arrays.stream(str.split("")).collect(Collectors.toSet()).size();
    }
    

    public static void main(String[] args) throws IOException {
        //new WebScrapper("https://www.bbc.com/urdu/topics/cjgn7n9zzq7t").scrape();
        System.out.println(new WebScrapper().readFile("News"));
    }

}
