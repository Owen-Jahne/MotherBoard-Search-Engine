package motherboardengine;

import java.io.*;
import java.util.Scanner;

public class MotherboardEngine {

    public static void main(String[] args)throws IOException
    {
        populateData();
    }
    
    public static void populateData()throws IOException
    {
        try
        {
            File inFile = new File("input.txt");
            Scanner in = new Scanner(inFile);
            Motherboard[] arr = new Motherboard[10];
            
            while(in.hasNextLine())
            {
                do
                {
                    //create new Motherboard and populate fields
                    Motherboard temp = new Motherboard();
                    temp.setManu(in.nextLine());
                    temp.setModel(in.nextLine());
                    temp.setChip(in.nextLine());
                    temp.setSock(in.nextLine());
                    temp.setForm(in.nextLine());
                    temp.setMemSlot(in.nextInt());
                    temp.setRAM(in.nextInt());
                    temp.setPCIE16(in.nextInt());
                    temp.setPCIE8(in.nextInt());
                    temp.setPCIE4(in.nextInt());
                    temp.setPCIE1(in.nextInt());
                    temp.setSATA(in.nextInt());
                    temp.setM2(in.nextInt());
                    in.nextLine();
                    temp.setLANChip(in.nextLine());
                    temp.setLANSpeed(Integer.parseInt(in.nextLine()));
                    temp.setVideo(in.nextBoolean());
                    temp.set3Pin(in.nextInt());
                    temp.set4Pin(in.nextInt());
                    temp.setRGB(in.nextInt());
                    temp.setARGB(in.nextInt());
                    temp.setUSB2Headers(in.nextInt());
                    temp.setUSB3Headers(in.nextInt());
                    temp.setUSBCHeaders(in.nextInt());
                    temp.setWIFI(in.nextInt());
                    in.nextLine();
                    temp.setAudioChip(in.nextLine());
                    temp.setPrice(in.nextInt());
                    temp.setUSB2Ports(in.nextInt());
                    temp.setUSB3Ports(in.nextInt());
                    temp.setUSBCPorts(in.nextInt());
                    temp.setLANIO(in.nextInt());
                    temp.setPS2(in.nextInt());
                    in.nextLine();
                    temp.setGraphics(in.nextLine());
                    temp.setBackAudio(in.nextLine());
                    temp.setOtherIO(in.nextLine());
                    temp.setmainURL(in.nextLine());
                    temp.setCompatURL(in.nextLine());
                    if (!in.hasNextLine())
                        break;
                }while(in.nextLine() != " ");
                //place into Database array
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error occurred");
        }
    }
}
