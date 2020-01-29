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
public class AddCommand implements Command
{
    
    private String input;
    List<DataManipulator> manipulators = new ArrayList<DataManipulator>();
    private Printer printer;

    public AddCommand() {
    }
    
    

    public AddCommand(String input,List<DataManipulator> manipulators,Printer printer) {
        this.manipulators = manipulators;
        this.input = input;
        this.printer = printer;
    }
    
    public AddCommand(String input) {
        this.input = input;
    }
    
    public AddCommand addDataManipulator(DataManipulator dataManipulator)
    {
        this.manipulators.add(dataManipulator);
        return this;
    }
    
    public AddCommand setPrinter(Printer printer)
    {
        this.printer = printer;
        return this;
    }
    
    @Override
    public void execute() 
    {
        for(DataManipulator manipulator:this.manipulators)
        {
            manipulator.add(this.input);
        }
        
        this.printer.printData(manipulators.get(0));
    }
    
}
