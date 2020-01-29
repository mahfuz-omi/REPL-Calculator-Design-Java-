/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

import bkashcodingtestdemo.*;
import java.util.List;

/**
 *
 * @author OMI
 */
public class ShowCommand implements Command{
    
    DataManipulator manipulator;
    private Printer printer;

    public ShowCommand() {
    }
    
    

    public ShowCommand(DataManipulator manipulator,Printer printer) {
        this.manipulator = manipulator;
        this.printer = printer;
    }
    
    public ShowCommand setDataManipulator(DataManipulator manipulator)
    {
        this.manipulator = manipulator;
        return this;
    }
    
    public ShowCommand setPrinter(Printer printer)
    {
        this.printer = printer;
        return this;
    }
    
    @Override
    public void execute() 
    {
        this.printer.printData(manipulator);
    }
    
}
