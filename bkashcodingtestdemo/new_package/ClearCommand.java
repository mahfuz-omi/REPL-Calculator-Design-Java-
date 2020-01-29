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
public class ClearCommand implements Command{
    List<DataManipulator> manipulators = new ArrayList<>();
    private Printer printer;

    public ClearCommand() {
    }
    
    

    public ClearCommand(List<DataManipulator> manipulators,Printer printer) {
        this.manipulators = manipulators;
        this.printer = printer;
    }
    
    
    public ClearCommand addDataManipulator(DataManipulator dataManipulator)
    {
        this.manipulators.add(dataManipulator);
        return this;
    }
    
    public ClearCommand setPrinter(Printer printer)
    {
        this.printer = printer;
        return this;
    }
    
    @Override
    public void execute() 
    {
        for(DataManipulator manipulator:this.manipulators)
        {
            manipulator.clear();
        }
        
        this.printer.printData(manipulators.get(0));
    }
    
}
