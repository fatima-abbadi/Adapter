/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdb;

public class client implements ClientAPI{

    @Override
    public void readJson() {
        System.out.println("Read Json.");    }

    @Override
    public void generateJson() {
         System.out.println("Generate Json.");   
    }
    
}
