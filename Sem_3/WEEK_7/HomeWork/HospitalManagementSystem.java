class MedicalStaff {
    String name;
    MedicalStaff(String name) { this.name = name; }
    void shiftSchedule() { System.out.println(name + " shift scheduled."); }
}

class Doctor extends MedicalStaff {
    Doctor(String name) { super(name); }
    void diagnose() { System.out.println(name + " diagnoses patients and prescribes medicine."); }
}

class Nurse extends MedicalStaff {
    Nurse(String name) { super(name); }
    void administerMedicine() { System.out.println(name + " administers medicine and monitors patients."); }
}

class Technician extends MedicalStaff {
    Technician(String name) { super(name); }
    void operateEquipment() { System.out.println(name + " operates equipment and maintains instruments."); }
}

class Administrator extends MedicalStaff {
    Administrator(String name) { super(name); }
    void manageRecords() { System.out.println(name + " schedules appointments and manages records."); }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        MedicalStaff m1 = new Doctor("Dr. Alice");
        MedicalStaff m2 = new Nurse("Nurse Bob");
        MedicalStaff m3 = new Technician("Tech Carol");
        MedicalStaff m4 = new Administrator("Admin Dave");

        m1.shiftSchedule();
        m2.shiftSchedule();
        m3.shiftSchedule();
        m4.shiftSchedule();
    }
}
