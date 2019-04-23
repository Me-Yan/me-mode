package com.me.inner.mode.flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Me on 2019/4/23.
 */
public class BigChar {

    private char charname;

    private String fontData;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("E://Test/" + charname + ".txt"));

            String line = null;
            StringBuffer sb = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                sb.append(line)
                        .append("\n");
            }

            reader.close();
            this.fontData = sb.toString();

        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.print(fontData);
    }
}
