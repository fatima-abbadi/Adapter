/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdb;

/**
 *
 * @author ProBook
 */
public class AdapterDB {

    public static void main(String[] args) {
    ClientAPI client = new client();
    ServerAPI server = new server();
    
    
ClientAPI serverAdapterDB = new ServerAdaptor (server);
ServerAPI clientAdapterDB = new ClientAdapter (client);


        System.out.println("Fatima Hani Abbadi .......201910210");
        
System.out.println("... Client API..."); 
client.readJson();
client.generateJson();

System.out.println("...Server API... ");
server.readXML();
server.generateXML();

System.out.println("... Client Adapter ...");
clientAdapterDB.readXML();
clientAdapterDB.generateXML();

System.out.println(" ...Server Adapter ...");
serverAdapterDB.readJson();
serverAdapterDB.generateJson();
    }
    
}
