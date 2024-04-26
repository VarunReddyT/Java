interface Hotspot{
    // Method to enable hotspot
    void enableHotspot();

    void getPassword();
    // Method to disable hotspot
    void disableHotspot();

    // Method to connect to a device
    boolean connectToHotspot(String deviceName);

    // Method to disconnect from a connected device
    void disconnectDevice();

    // Method to send data to the connected device
    void sendData(byte[] data);

    // Method to receive data from the connected device
    byte[] receiveData();
}

class HotspotC extends Computer implements Hotspot{
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
    public void disconnectDevice() {
        if (hotspotEnabled) {
            System.out.println("Disconnecting from device...");
        } else {
            System.out.println("Hotspot is not enabled. Cannot disconnect.");
        }
    }

    @Override
    public void sendData(byte[] data) {
        if (hotspotEnabled) {
            System.out.println("Sending data: " + new String(data));
        } else {
            System.out.println("Hotspot is not enabled. Cannot send data.");
        }
    }

    @Override
    public byte[] receiveData() {
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
}