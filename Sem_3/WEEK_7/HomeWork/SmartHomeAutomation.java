class SmartDevice {
    String id;
    SmartDevice(String id) { this.id = id; }
}

class SmartTV extends SmartDevice {
    SmartTV(String id) { super(id); }
    void controlTV() { System.out.println("TV " + id + ": Channels, Volume, Apps controlled."); }
}

class SmartThermostat extends SmartDevice {
    SmartThermostat(String id) { super(id); }
    void controlThermostat() { System.out.println("Thermostat " + id + ": Temperature, Humidity, Energy modes controlled."); }
}

class SmartSecurity extends SmartDevice {
    SmartSecurity(String id) { super(id); }
    void controlSecurity() { System.out.println("Security " + id + ": Cameras, Alarms, Access controlled."); }
}

class SmartKitchen extends SmartDevice {
    SmartKitchen(String id) { super(id); }
    void controlKitchen() { System.out.println("Kitchen " + id + ": Cooking times, Temperatures, Recipes controlled."); }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        SmartDevice[] devices = {
            new SmartTV("TV1"),
            new SmartThermostat("T1"),
            new SmartSecurity("S1"),
            new SmartKitchen("K1")
        };

        for (SmartDevice d : devices) {
            if (d instanceof SmartTV) ((SmartTV)d).controlTV();
            else if (d instanceof SmartThermostat) ((SmartThermostat)d).controlThermostat();
            else if (d instanceof SmartSecurity) ((SmartSecurity)d).controlSecurity();
            else if (d instanceof SmartKitchen) ((SmartKitchen)d).controlKitchen();
        }
    }
}
