package RMI_Fact;

import java.rmi.*;
import java.rmi.registry.*;

class Server {
    public static void main(String[] args) {
        try {
            Fact factObj = new FactRemote();
            Naming.rebind("rmi://localhost:5000/rmiServer", factObj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// rmiregistry 5000
// javac Server.java FactRemote.java
// java Server
// java Client.java