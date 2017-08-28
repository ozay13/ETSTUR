/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ets.util;

import com.ets.model.Otel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author ozaytunctan13
 */
public class HtmlParser {

    private String url = "https://www.etstur.com/";
    private Document document;

    public HtmlParser(String extension) {
        this.url += extension;
        loadConnect(url);
        System.out.println(url);
    }

    private void loadConnect(String str) {
        try {
            document = Jsoup.connect(url).get();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public Otel[] getValue(){
        //Div altından eriş
        //title,location,adress,score,body
        
         String title=document.title();
         System.out.println("Title:"+title);
         Elements elem=document.select("div");
         for (Element element : elem) {
             System.out.println(element);
        }
         
        
          
          //System.out.println(div.select("div a").attr("href"));
          Otel[]ot=new Otel[2];
          ot[0]=new Otel("Maris otel","Antalya",98);
          ot[1]=new Otel("Maris otel","Antalya",98);
        return ot;
    }
//     public static void main(String[] args) {
//        HtmlParser parser=new HtmlParser("");
//        
//          
//    }  

}
