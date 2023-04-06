package SocketProgramming;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCP_Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6060);
        Socket cs = ss.accept();
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

        outs.println("Hello to the client from server.");

        String msgFromClient = ins.nextLine();
        System.out.println("Client says: " + msgFromClient);

        outs.close();
        ins.close();

        cs.close();
        ss.close();
    }
}