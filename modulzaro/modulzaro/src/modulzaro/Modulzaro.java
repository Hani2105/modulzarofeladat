/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulzaro;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hanac
 */
public class Modulzaro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        csvtomultiarray feldolgoz = new csvtomultiarray();
        String[][] autolista = feldolgoz.feldolgoz("autok.csv");

        ablak a = new ablak();
        a.setVisible(true);

    }

}
