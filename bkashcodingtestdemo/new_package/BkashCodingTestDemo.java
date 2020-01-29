/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

import bkashcodingtestdemo.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author OMI
 */
public class BkashCodingTestDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Project project = new Project();
        project.run();

//        File file = new File("file.txt");
//        System.out.println(file.getName());
//        
//        System.out.println(file.getAbsolutePath());
//        file.createNewFile();
//        
//
//        PrintWriter printWriter = new PrintWriter(file);
//        printWriter.println("0");
//        printWriter.flush();
//        
//        
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        System.out.println(bufferedReader.readLine());
    }
    
}
