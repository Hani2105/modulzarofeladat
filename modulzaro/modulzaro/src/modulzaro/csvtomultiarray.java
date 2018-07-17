/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulzaro;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanac
 */
public class csvtomultiarray {

    private List<String[]> sorok = new ArrayList<String[]>();
    private String sor;

    @SuppressWarnings("empty-statement")
    public String[][] csvtomultiarray(String filename) throws FileNotFoundException, IOException {

        BufferedReader br = new BufferedReader(new FileReader(filename));


        while ((sor = br.readLine()) != null) {
          
                sorok.add(sor.split(";"));
            

        }

// átkonvertáljuk a listánkat String tömbbé
        String[][] tomb = new String[sorok.size()][0];
        sorok.toArray(tomb);
        return tomb;

    }
    // városok tömb visszaadása

    public String[][] varosok() throws IOException {

        csvtomultiarray dolgoz = new csvtomultiarray();
        String[][] varosok = dolgoz.csvtomultiarray("varosok.csv");
        return varosok;

    }
//autok tömb visszaadása

    public String[][] autok() throws IOException {

        csvtomultiarray dolgoz = new csvtomultiarray();
        String[][] autok = dolgoz.csvtomultiarray("autok.csv");
        return autok;

    }

}
