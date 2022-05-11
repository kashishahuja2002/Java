import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoginInterface {
    boolean check(String id, String pass) throws RemoteException;
}
