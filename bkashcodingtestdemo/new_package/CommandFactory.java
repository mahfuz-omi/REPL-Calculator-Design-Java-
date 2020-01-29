/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

import bkashcodingtestdemo.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javafx.print.Printer;

/**
 *
 * @author OMI
 */
public class CommandFactory {
    
   
    
    public static Command getCommand(String input) throws FileNotFoundException
    {
        
        if(input == null)
            return new InvalidCommand(new ConsolePrinter());
        if(input.toUpperCase().startsWith("ADD"))
        {
            String inputs[] = input.split(" ");
            AddCommand addCommand = new AddCommand(inputs[1])
                    .addDataManipulator(new MemoryDataManipulator(ResourceSingleton.getInstanceUsingDoubleLocking().getMemory()))
                    .addDataManipulator(new FileDataManipulator(ResourceSingleton.getInstanceUsingDoubleLocking().getFile()))
                    .setPrinter(new ConsolePrinter());
            return addCommand;
        }
        if(input.toUpperCase().startsWith("SUB"))
        {
            String inputs[] = input.split(" ");
            SubCommand subCommand = new SubCommand(inputs[1])
                    .addDataManipulator(new MemoryDataManipulator(ResourceSingleton.getInstanceUsingDoubleLocking().getMemory()))
                    .addDataManipulator(new FileDataManipulator(ResourceSingleton.getInstanceUsingDoubleLocking().getFile()))
                    .setPrinter(new ConsolePrinter());
            return subCommand;
        }
        if(input.toUpperCase().startsWith("CLEAR"))
        {
            ClearCommand clearCommand = new ClearCommand()
                    .addDataManipulator(new MemoryDataManipulator(ResourceSingleton.getInstanceUsingDoubleLocking().getMemory()))
                    .addDataManipulator(new FileDataManipulator(ResourceSingleton.getInstanceUsingDoubleLocking().getFile()))
                    .setPrinter(new ConsolePrinter());
            return clearCommand;
        }
        if(input.toUpperCase().startsWith("SHOW"))
        {
            ShowCommand showCommand = new ShowCommand()
                    .setDataManipulator(new MemoryDataManipulator(ResourceSingleton.getInstanceUsingDoubleLocking().getMemory()))
                    .setPrinter(new ConsolePrinter());
            return showCommand;
        }
        if(input.toUpperCase().startsWith("EXIT"))
        {
            return new ExitCommand();
        }
        else
            return new InvalidCommand(new ConsolePrinter());       
    }
    
}
