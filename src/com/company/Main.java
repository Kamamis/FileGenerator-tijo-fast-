package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


class Main {

    public static void main(String[] args) throws IOException {
        Generator csv = new CsvGenerator();
        Generator pdf = new PdfGenerator();
        Generator xml = new XmlGenerator();

            printFile (csv, Arrays.asList("first line", "second line", "third line"));
            printFile (pdf, Arrays.asList("first line", "second line", "third line"));
            printFile (xml, Arrays.asList("first line", "second line", "third line"));

    }

    private static void printFile(Generator Generator, List<String> list) throws IOException {
        Generator.printFile((list));
    }
}