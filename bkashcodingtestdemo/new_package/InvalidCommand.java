/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

import bkashcodingtestdemo.*;

/**
 *
 * @author OMI
 */
public class InvalidCommand implements Command{
    private Printer printer;
    

    public InvalidCommand(Printer printer) {
        this.printer = printer;
    }
    
    @Override
    public void execute() {
        printer.print("Invalid Command");
    }
    
}
