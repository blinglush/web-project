package com.blinglush.maintest;

import java.io.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-22
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class WritePropertiesMain {

    private static Properties prop = new Properties();
    private static OutputStream output = null;
    private static InputStream input = null;


    public static void main(String[] args) {

//        writePropertiesFile("prop.test1");
          readPropertiesFile("database.properties");

    }

    public static void writePropertiesFile(String fileName) {
        String outputFile = fileName;
        prop.setProperty("first_name", "Ritesh");
        prop.setProperty("last_name", "Stha");
        try {
            output = new FileOutputStream("/Users/shrestar/Documents/ideaProjects/maven-projects/web-project/src/main/resources/"+outputFile);
            prop.store(output, "test comment");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void readPropertiesFile(String fileName) {
        File fileToRead = new File("/Users/shrestar/Documents/ideaProjects/maven-projects/web-project/src/main/resources/"+fileName);
        if (fileToRead.isFile()) {
            try {
                input = new FileInputStream(fileToRead);
                prop.load(input);
                String first_name = prop.getProperty("driver_class");
                System.out.println("driver_class: " +first_name);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

//    public FileOutputStream(String name) throws FileNotFoundException {
//        this(name != null ? new File(name) : null, false);
//    }
}
