/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

import bkashcodingtestdemo.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author OMI
 */
public class SubCommand implements Command{
    
    private String input;
    List<DataManipulator> manipulators = new ArrayList<>();;
    private Printer printer;

    public SubCommand() {
    }
    
    

    public SubCommand(String input,List<DataManipulator> manipulators,Printer printer) {
        this.manipulators = manipulators;
        this.input = input;
        this.printer = printer;
    }
    
    public SubCommand(String input) {
        this.input = input;
    }
    
    public SubCommand addDataManipulator(DataManipulator dataManipulator)
    {
        this.manipulators.add(dataManipulator);
        return this;
    }
    
    public SubCommand setPrinter(Printer printer)
    {
        this.printer = printer;
        return this;
    }
    
    @Override
    public void execute() 
    {
        for(DataManipulator manipulator:this.manipulators)
        {
            manipulator.sub(this.input);
        }
        
        this.printer.printData(manipulators.get(0));
    }
    
}
