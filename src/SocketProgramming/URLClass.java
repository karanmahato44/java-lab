package SocketProgramming;

import java.net.URL;

class URLClass {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://imgur.com/hKwoXZX");
            System.out.println("protocol: " + url.getProtocol());
            System.out.println("host: " + url.getHost());
            System.out.println("file: " + url.getFile());
            System.out.println("port: " + url.getPort());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}