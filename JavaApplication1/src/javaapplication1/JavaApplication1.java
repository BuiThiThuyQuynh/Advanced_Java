/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author hv
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}



// single responsibility principle - good example
interface DataChannel
{
    public void send(char c);
    public char recv();
}
interface Connetion
{
    public void dial(String pno);
    public void hangup();
}
class Modem implements DataChannel, Connetion {
    @Override
    public void dial(String pno) {
        
    }
    @Override
    public void hangup() {
        
    }
    @Override
    public void send(char c) {
        
    }
    @Override
    public char recv() {
        return 0;
    }
}
