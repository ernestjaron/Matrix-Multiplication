import java.rmi.RemoteException;

public class MyCalcImpl implements MyCalc {

    @Override
    public int add(int a, int b) throws RemoteException {
        return (a + b);
    }
}