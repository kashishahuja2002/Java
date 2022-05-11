import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CheckLogin extends UnicastRemoteObject implements LoginInterface
{
   public CheckLogin() throws RemoteException {}
   
    public boolean check(String id, String pass) throws RemoteException
    {
        if(id.equals("Abc") && pass.equals("abc"))
            return true;
        else
            return false;
    }
}
