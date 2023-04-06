package SocketProgramming;

import java.net.*;
import java.io.*;

class ReadURLContent {
    public static void main(String[] args) {
        String urlStr = "http://jvscholz.com/faq.html";
        try {
            URL url = new URL(urlStr);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + urlStr);
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Error reading from URL: " + urlStr);
            System.exit(1);
        }
    }
}

