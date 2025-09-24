class SmartDevice {
    String id;
    SmartDevice(String id) { this.id = id; }
}

class SmartClassroom extends SmartDevice {
    SmartClassroom(String id) { super(id); }
    void controlClassroom() { System.out.println("Classroom " + id + ": Lights, AC, Projector controlled."); }
}

class SmartLab extends SmartDevice {
    SmartLab(String id) { super(id); }
    void controlLab() { System.out.println("Lab " + id + ": Equipment and safety systems managed."); }
}

class SmartLibrary extends SmartDevice {
    SmartLibrary(String id) { super(id); }
    void controlLibrary() { System.out.println("Library " + id + ": Occupancy and book availability tracked."); }
}

public class SmartCampusIoT {
    public static void main(String[] args) {
        SmartDevice[] devices = {
            new SmartClassroom("C101"),
            new SmartLab("L202"),
            new SmartLibrary("Lib1")
        };

        for (SmartDevice d : devices) {
            if (d instanceof SmartClassroom) {
                ((SmartClassroom) d).controlClassroom();
            } else if (d instanceof SmartLab) {
                ((SmartLab) d).controlLab();
            } else if (d instanceof SmartLibrary) {
                ((SmartLibrary) d).controlLibrary();
            }
        }
    }
}
