package com.company;
import java.io.*; //required for input stream
import java.net.*;//required for URL and URL connection
public class urlconnectiondemo {
    public static void main(String[] args) {
        try{
            URL url=new URL("http://www.darshan.ac.in");
            URLConnection urlcon=url.openConnection();
            InputStream stream=urlcon.getInputStream();
            int i;
            while ((i=stream.read())!=-1)
            {
                System.out.println((char)i);
            }
        }catch(Exception e){System.out.println(e);}

    }
}
