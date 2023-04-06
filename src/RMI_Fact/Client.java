package RMI_Fact;

import java.rmi.*;
class Client {
    public static void main(String[] args) throws Exception {
        Fact a = (Fact)Naming.lookup("rmi://localhost:5000/rmiServer");
        int factorial = a.fact(4);
        System.out.println("result: " + factorial);
    }

}
