/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

import bkashcodingtestdemo.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author OMI
 */
public class Project {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Calculator calculator = new Calculator();
    
    public void run() throws IOException
    {
        while(true)
        {
            String input = bufferedReader.readLine();
            calculator.setCommand(CommandFactory.getCommand(input));
            calculator.calculate();  
        }
        
    }
    
}
