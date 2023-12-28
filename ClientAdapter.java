/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdb;

public class ClientAdapter implements ServerAPI{
    ClientAPI client;
public ClientAdapter (ClientAPI client) { this.client = client;}

   @Override
    public void readXML() {
        System.out.println("Read XML");
    }

    @Override
    public void generateXML() {
        System.out.println("Generate XML");
    }
}
