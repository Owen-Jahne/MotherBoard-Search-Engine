package motherboardengine;

import java.io.*;
import java.util.Scanner;

public class MotherboardEngine {

    public static void main(String[] args)throws IOException
    {
        //populateData();
    }
    
    public static void populateData()throws IOException
    {
        File inFile = new File("input.txt");
        Scanner in = new Scanner(inFile);
        
        while(in.nextLine()!= "END OF FILE")
        {
            //create new Motherboard and populate fields
            
            //place into Database array
        }
    }
}
