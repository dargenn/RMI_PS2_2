package server;

import common.ObjectNames;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.rmi.server.hostname", "192.168.0.103");
        PersonRepository repository = new PersonRepositoryImpl();
        PersonRepository stub = (PersonRepository) UnicastRemoteObject.exportObject(repository, Registry.REGISTRY_PORT);
        Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
        registry.rebind(ObjectNames.DATABASE_CONNECTOR.name(), stub);
        System.out.println("DB Connector bound");
    }
}