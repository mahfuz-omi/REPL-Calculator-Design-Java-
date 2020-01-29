/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bkashcodingtestdemo.new_package;

/**
 *
 * @author OMI
 */
public class ConsolePrinter implements Printer{

    @Override
    public void print(String data) {
        System.out.println(data);
    }

    @Override
    public void printData(DataManipulator dataManipulator) {
         System.out.println(dataManipulator.get());
    }
    
}
