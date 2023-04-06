package RMI_Fact;

import java.rmi.*;

interface Fact extends Remote {
    int fact(int n) throws RemoteException;

}
