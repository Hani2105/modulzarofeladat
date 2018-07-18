/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulzaro;

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

    public String[][] feldolgoz(String filename, String c) throws FileNotFoundException, IOException {
        
        sor = "";
        sorok.clear();

        BufferedReader br = new BufferedReader(new FileReader(filename));

        while ((sor = br.readLine()) != null) {

            sorok.add(sor.split(c));

        }

// átkonvertáljuk a listánkat String tömbbé
        String[][] tomb = new String[sorok.size()][0];
        sorok.toArray(tomb);
        return tomb;

    }

}
