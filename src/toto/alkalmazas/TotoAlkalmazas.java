
package toto.alkalmazas;

import toto.szolgaltatas.TotoSzolgaltatas;


public class TotoAlkalmazas
{

   
    public static void main(String[] args) 
    {
        TotoSzolgaltatas tsz = new TotoSzolgaltatas();
        tsz.fajlbeolvas("toto.csv");
    }
    
}
