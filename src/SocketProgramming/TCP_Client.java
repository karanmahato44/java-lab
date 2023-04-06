package SocketProgramming;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

class TCP_Client {
    public static void main(String[] args) throws IOException {
        Socket cs = new Socket("localhost", 6060);
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

        outs.println("Hello to the server from client.");

        String msgFromServer = ins.nextLine();
        System.out.println("Server says: " + msgFromServer);

        ins.close();
        outs.close();
        cs.close();
    }
}
