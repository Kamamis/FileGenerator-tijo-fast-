package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileGenerator implements Generator {
    String name;

     public void printFile(List<String> l)  {

         try {
             FileWriter CsvW = new FileWriter(name);

             CsvW.append("*************" + "\n");
             for (String s : l) {
                 CsvW.append(s + "\n");
             }
             CsvW.append(("\n") + "*************" + "\n");
             CsvW.flush();
             CsvW.close();
         }catch (IOException e) {
             e.printStackTrace();
         }
    }
    };


