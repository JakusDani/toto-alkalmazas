
package toto.szolgaltatas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import toto.tarolo.Fordulo;

public class TotoSzolgaltatas 
{
    private List<Fordulo> totoLista;
    
    public void fajlbeolvas(String fajl)
    {
        this.totoLista = new LinkedList<>();
        try
        {
            FileReader fr = new FileReader(fajl);
            BufferedReader br = new BufferedReader(fr);
            
            String sor = br.readLine();
            while(sor != null)
            {
                Fordulo f = new Fordulo(sor);
                this.totoLista.add(f);
                sor = br.readLine();
            }
            br.close();
            fr.close();
        }
        catch (FileNotFoundException e)
        {
                    System.out.println("Nincs Fájl!!!");
        }
        catch (IOException e)
        {
            System.err.printf("Hiba: %s",e.getMessage());
        }
        catch (Exception e)
        {
            System.err.printf("Hiba: %S",e.getMessage());
        }
        
    }
}
