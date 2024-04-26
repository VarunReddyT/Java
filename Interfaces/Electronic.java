public class Electronic {
    protected boolean isOn;

    public Electronic() {
        this.isOn = false;
    }

    public void powerOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("Electronic device is now on.");
        } else {
            System.out.println("Electronic device is already on.");
        }
    }

    public void powerOff() {
        if (isOn) {
            isOn = false;
            System.out.println("Electronic device is now off.");
        } else {
            System.out.println("Electronic device is already off.");
        }
    }
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone();
        Computer c1 = new Computer("HP", 32, 2);
        BluetoothInterface b = new Computer("Dull", 512, 1);

        Hotspot h1 = new Computer("Lenovo",1024,16);
        Hotspot h2 = new Computer("MSI",500,8);

        
        s1.enableBluetooth();
        c1.powerOn();
        s1.powerOff();
        b.enableBluetooth();

        System.out.println("\n");

        h1.enableHotspot();
        h1.connectToHotspot("Varun");

    }
}


interface BluetoothInterface {
    // Method to enable Bluetooth
    void enableBluetooth();

    // Method to disable Bluetooth
    void disableBluetooth();

    // Method to establish a connection with another device
    boolean connectToDevice(String deviceName);

    // Method to disconnect from a connected device
    void disconnectDevice();

    // Method to send data to the connected device
    void sendData(byte[] data);

    // Method to receive data from the connected device
    byte[] receiveData();
}


interface Hotspot extends BluetoothInterface{
    // Method to enable hotspot
    void enableHotspot();

    void getPassword();
    // Method to disable hotspot
    void disableHotspot();

    // Method to connect to a device
    boolean connectToHotspot(String deviceName);

    // Method to disconnect from a connected device
    void disconnectDeviceH();

    // Method to send data to the connected device
    void sendDataH(byte[] data);

    // Method to receive data from the connected device
    byte[] receiveDataH();
}
class Smartphone extends Electronic implements Hotspot{
    private boolean hotspotEnabled = false;

    @Override
    public void enableHotspot() {
        hotspotEnabled = true;
        System.out.println("Hotspot enabled.");
    }

    @Override
    public void disableHotspot() {
        hotspotEnabled = false;
        System.out.println("Hotspot disabled.");
    }

    @Override
    public boolean connectToHotspot(String deviceName) {
        if (hotspotEnabled) {
            System.out.println("Connecting to " + deviceName + "...");
            // Simulate a successful connection
            return true;
        } else {
            System.out.println("Please enable Hotspot first.");
            return false;
        }
    }

    @Override
    public void disconnectDeviceH() {
        if (hotspotEnabled) {
            System.out.println("Disconnecting from device...");
        } else {
            System.out.println("Hotspot is not enabled. Cannot disconnect.");
        }
    }

    @Override
    public void sendDataH(byte[] data) {
        if (hotspotEnabled) {
            System.out.println("Sending data: " + new String(data));
        } else {
            System.out.println("Hotspot is not enabled. Cannot send data.");
        }
    }

    @Override
    public byte[] receiveDataH() {
        if (hotspotEnabled) {
            System.out.println("Receiving data...");
            // Simulate receiving data
            return "Hello, this is a test message.".getBytes();
        } else {
            System.out.println("Hotspot is not enabled. Cannot receive data.");
            return new byte[0];
        }
    }
    @Override
    public void getPassword(){
        System.out.println("Password: 1234");
    }
    private boolean bluetoothEnabled = false;

    @Override
    public void enableBluetooth() {
        bluetoothEnabled = true;
        System.out.println("Bluetooth enabled.");
    }

    @Override
    public void disableBluetooth() {
        bluetoothEnabled = false;
        System.out.println("Bluetooth disabled.");
    }

    @Override
    public boolean connectToDevice(String deviceName) {
        if (bluetoothEnabled) {
            System.out.println("Connecting to " + deviceName + "...");
            // Simulate a successful connection
            return true;
        } else {
            System.out.println("Please enable Bluetooth first.");
            return false;
        }
    }

    @Override
    public void disconnectDevice() {
        if (bluetoothEnabled) {
            System.out.println("Disconnecting from device...");
        } else {
            System.out.println("Bluetooth is not enabled. Cannot disconnect.");
        }
    }

    @Override
    public void sendData(byte[] data) {
        if (bluetoothEnabled) {
            System.out.println("Sending data: " + new String(data));
        } else {
            System.out.println("Bluetooth is not enabled. Cannot send data.");
        }
    }

    @Override
    public byte[] receiveData() {
        if (bluetoothEnabled) {
            System.out.println("Receiving data...");
            // Simulate receiving data
            return "Received data".getBytes();
        } else {
            System.out.println("Bluetooth is not enabled. Cannot receive data.");
            return new byte[0];
        }
    }
}

class Computer extends Electronic implements Hotspot{
    private boolean hotspotEnabled = false;

    
    @Override
    public void enableHotspot() {
        hotspotEnabled = true;
        System.out.println("Hotspot enabled.");
    }

    @Override
    public void disableHotspot() {
        hotspotEnabled = false;
        System.out.println("Hotspot disabled.");
    }

    @Override
    public boolean connectToHotspot(String deviceName) {
        if (hotspotEnabled) {
            System.out.println("Connecting to " + deviceName + "...");
            // Simulate a successful connection
            return true;
        } else {
            System.out.println("Please enable Hotspot first.");
            return false;
        }
    }

    @Override
    public void disconnectDeviceH() {
        if (hotspotEnabled) {
            System.out.println("Disconnecting from device...");
        } else {
            System.out.println("Hotspot is not enabled. Cannot disconnect.");
        }
    }

    @Override
    public void sendDataH(byte[] data) {
        if (hotspotEnabled) {
            System.out.println("Sending data: " + new String(data));
        } else {
            System.out.println("Hotspot is not enabled. Cannot send data.");
        }
    }

    @Override
    public byte[] receiveDataH() {
        if (hotspotEnabled) {
            System.out.println("Receiving data...");
            // Simulate receiving data
            return "Hello, this is a test message.".getBytes();
        } else {
            System.out.println("Hotspot is not enabled. Cannot receive data.");
            return new byte[0];
        }
    }
    @Override
    public void getPassword(){
        System.out.println("Password: 1234");
    }
    // State specific to computers
    private String brand;
    private int storage; // in gigabytes
    private int ram; // in gigabytes
    private boolean bluetoothEnabled = false;

    // Constructor to initialize the Computer object
    public Computer(String brand, int storage, int ram) {
        super(); // Call the superclass constructor
        this.brand = brand;
        this.storage = storage;
        this.ram = ram;
    }

    // Implementing BluetoothInterface methods

    @Override
    public void enableBluetooth() {
        bluetoothEnabled = true;
        System.out.println("Bluetooth enabled. Cheers.");
    }

    @Override
    public void disableBluetooth() {
        bluetoothEnabled = false;
        System.out.println("Bluetooth disabled.");
    }

    @Override
    public boolean connectToDevice(String deviceName) {
        if (bluetoothEnabled) {
            System.out.println("Connecting to " + deviceName + "...");
            // Simulate a successful connection
            return true;
        } else {
            System.out.println("Please enable Bluetooth first.");
            return false;
        }
    }

    @Override
    public void disconnectDevice() {
        if (bluetoothEnabled) {
            System.out.println("Disconnecting from device...");
        } else {
            System.out.println("Bluetooth is not enabled. Cannot disconnect.");
        }
    }

    @Override
    public void sendData(byte[] data) {
        if (bluetoothEnabled) {
            System.out.println("Sending data: " + new String(data));
        } else {
            System.out.println("Bluetooth is not enabled. Cannot send data.");
        }
    }

    @Override
    public byte[] receiveData() {
        if (bluetoothEnabled) {
            System.out.println("Receiving data...");
            // Simulate receiving data
            return "Received data".getBytes();
        } else {
            System.out.println("Bluetooth is not enabled. Cannot receive data.");
            return new byte[0];
        }
    }

    // Specific behavior for Computer
    public void upgradeRam(int additionalRam) {
        this.ram += additionalRam;
        System.out.println("RAM upgraded. Total RAM: " + ram + " GB.");
    }

    // Overriding the display method to include computer specifics
    public void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("Storage: " + storage + " GB");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Power status: " + (isOn ? "On" : "Off"));
        System.out.println("Bluetooth status: " + (bluetoothEnabled ? "Enabled" : "Disabled"));
    }
}


