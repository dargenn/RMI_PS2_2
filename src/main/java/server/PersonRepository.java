package server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Optional;

public interface PersonRepository extends Remote {
    List<Person> findAll() throws RemoteException;

    Optional<Person> findByName(String name) throws RemoteException;
}
