package RMI_Fact;

import java.rmi.*;
import java.rmi.server.*;
class FactRemote extends UnicastRemoteObject implements Fact {
    FactRemote() throws RemoteException {
        super();
    }

    public int fact(int n) {
        if (n >= 1)
            return n * fact(n - 1);
        else
            return 1;
    }

}

