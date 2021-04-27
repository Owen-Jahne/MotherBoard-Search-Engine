package motherboardengine;

public class Motherboard
{
    private String manufacturer;
    private String model;
    private String chipset;
    private String socket;
    private String formFactor;
    private int memorySlots;
    private int maxRAMCapacity;
    private int pcie16Slots;
    private int pcie8Slots;
    private int pcie4Slots;
    private int pcie1Slots;
    private int sataPorts;
    private int m2Slots;
    private String lanChip;
    private int lanSpeed;
    private boolean onboardVideo;
    private int fan3Pin;
    private int fan4Pin;
    private int rgbHeaders;
    private int argbHeaders;
    private int usb2Headers;
    private int usb3Headers;
    private int usbCHeaders;
    private int wirelessNet; //0: no support; other: the generation
    private String audioChip;
    private int msrp;
    private int usb2Ports;
    private int usb3Ports;
    private int usbCPorts;
    private int lanPorts;
    private int ps2Ports;
    private String graphicsPorts;
    private String audioPorts;
    private String otherIO;
    private String manuURL;
    private String compatURL;
    
    //getters
    public String getManu()
    {
        return manufacturer;
    }
    public String getModel()
    {
        return model;
    }
    public String getChip()
    {
        return chipset;
    }
    public String getSock()
    {
        return socket;
    }
    public String getForm()
    {
        return formFactor;
    }
    public int getMemSlot()
    {
        return memorySlots;
    }
    public int getRAM()
    {
        return maxRAMCapacity;
    }
    public int getPCIE16()
    {
        return pcie16Slots;
    }
    public int getPCIE8()
    {
        return pcie8Slots;
    }
    public int getPCIE4()
    {
        return pcie4Slots;
    }
    public int getPCIE1()
    {
        return pcie1Slots;
    }
    public int getSATA()
    {
        return sataPorts;
    }
    public int getM2()
    {
        return m2Slots;
    }
    public String getLANChip()
    {
        return lanChip;
    }
    public int getLANSpeed()
    {
        return lanSpeed;
    }
    public boolean getVideo()
    {
        return onboardVideo;
    }
    public int get3Pin()
    {
        return fan3Pin;
    }
    public int get4Pin()
    {
        return fan4Pin;
    }
    public int getRGB()
    {
        return rgbHeaders;
    }
    public int getARGB()
    {
        return argbHeaders;
    }
    public int getUSB2Headers()
    {
        return usb2Headers;
    }
    public int getUSB3Headers()
    {
        return usb3Headers;
    }
    public int getUSBCHeaders()
    {
        return usbCHeaders;
    }
    public int getWIFI()
    {
        return wirelessNet;
    }
    public String getAudioChip()
    {
        return audioChip;
    }
    public int getPrice()
    {
        return msrp;
    }
    public int getUSB2Ports()
    {
        return usb2Ports;
    }
    public int getUSB3Ports()
    {
        return usb3Ports;
    }
    public int getUSBCPorts()
    {
        return usbCPorts;
    }
    public int getLANIO()
    {
        return lanPorts;
    }
    public int getPS2()
    {
        return ps2Ports;
    }
    public String getGraphics()
    {
        return graphicsPorts;
    }
    public String getBackAudio()
    {
        return audioPorts;
    }
    public String getOtherIO()
    {
        return otherIO;
    }
    public String getMainURL()
    {
        return manuURL;
    }
    public String getCompatURL()
    {
        return compatURL;
    }
    
    //setters
    public void setManu(String s)
    {
        manufacturer = s;
    }
    public void setModel(String s)
    {
        model = s;
    }
    public void setChip(String s)
    {
        chipset = s;
    }
    public void setSock(String s)
    {
        socket = s;
    }
    public void setForm(String s)
    {
        formFactor=s;
    }
    public void setMemSlot(int i)
    {
        memorySlots = i;
    }
    public void setRAM(int i)
    {
        maxRAMCapacity = i;
    }
    public void setPCIE16(int i)
    {
        pcie16Slots = i;
    }
    public void setPCIE8(int i)
    {
        pcie8Slots = i;
    }
    public void setPCIE4(int i)
    {
        pcie4Slots = i;
    }
    public void setPCIE1(int i)
    {
        pcie1Slots = i;
    }
    public void setSATA(int i)
    {
        sataPorts = i;
    }
    public void setM2(int i)
    {
        m2Slots = i;
    }
    public void setLANChip(String s)
    {
        lanChip = s;
    }
    public void setLANSpeed(int i)
    {
        lanSpeed = i;
    }
    public void setVideo(boolean s)
    {
        onboardVideo = s;
    }
    public void set3Pin(int i)
    {
        fan3Pin = i;
    }
    public void set4Pin(int i)
    {
        fan4Pin = i;
    }
    public void setRGB(int i)
    {
        rgbHeaders = i;
    }
    public void setARGB(int i)
    {
        argbHeaders = i;
    }
    public void setUSB2Headers(int i)
    {
        usb2Headers = i;
    }
    public void setUSB3Headers(int i)
    {
        usb3Headers = i;
    }
    public void setUSBCHeaders(int i)
    {
        usbCHeaders = i;
    }
    public void setWIFI(int i)
    {
        wirelessNet = i;
    }
    public void setAudioChip(String s)
    {
        audioChip = s;
    }
    public void setPrice(int f)
    {
        msrp = f;
    }
    public void setUSB2Ports(int i)
    {
        usb2Ports = i;
    }
    public void setUSB3Ports(int i)
    {
        usb3Ports = i;
    }
    public void setUSBCPorts(int i)
    {
        usbCPorts = i;
    }
    public void setLANIO(int i)
    {
        lanPorts = i;
    }
    public void setPS2(int i)
    {
        ps2Ports = i;
    }
    public void setGraphics(String s)
    {
        graphicsPorts = s;
    }
    public void setBackAudio(String s)
    {
        audioPorts = s;
    }
    public void setOtherIO(String s)
    {
        otherIO = s;
    }
    public void setmainURL(String s)
    {
        manuURL = s;
    }
    public void setCompatURL(String s)
    {
        compatURL = s;
    }
}
