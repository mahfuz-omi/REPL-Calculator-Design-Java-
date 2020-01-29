/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author OMI
 */
public class FileDataManipulator implements DataManipulator{
    
    private File file;
    PrintWriter printWriter;
    BufferedReader reader;

    public FileDataManipulator(File file) throws FileNotFoundException {
        this.file = file;
        this.printWriter = new PrintWriter(file);
        this.reader = new BufferedReader(new FileReader(file));
        
        this.printWriter.println("0");
        this.printWriter.flush();
    }

    @Override
    public void add(String data) 
    {
        try 
        {
            int oldData = Integer.parseInt(this.reader.readLine());
            int increment = Integer.parseInt(data);
            int newData = oldData + increment;
            printWriter.println(String.valueOf(newData));
            printWriter.flush();
        } catch (IOException ex) {
            Logger.getLogger(FileDataManipulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @Override
    public void sub(String data) {
        try 
        {
            int oldData = Integer.parseInt(this.reader.readLine());
            int decrement = Integer.parseInt(data);
            int newData = oldData - decrement;
            printWriter.println(String.valueOf(newData));
            printWriter.flush();
        } catch (IOException ex) {
            Logger.getLogger(FileDataManipulator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void clear() {
       
        printWriter.println(String.valueOf(0));
        printWriter.flush();
    }

    @Override
    public String get() {
        try 
        {
            String oldData = this.reader.readLine();
            return oldData;
            
        } catch (IOException ex) {
            Logger.getLogger(FileDataManipulator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public void set(String data) {
        
       printWriter.println(data);
        
    }
    
    

    
    
}
