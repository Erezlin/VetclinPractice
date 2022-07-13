package example;


import java.util.ArrayList;
import java.util.Scanner;

public class Command {

    protected static final ArrayList<String> PATIENTS = new ArrayList<>();
    protected static final ArrayList<String> DOCTORS = new ArrayList<>();
    protected static Scanner s = new Scanner(System.in);

    public Command() {
        System.out.println("Print \"help\" to get a list of available commands");
        setCommand();

    }

    public void setCommand() {
        System.out.print("Write command: ");
        String command = s.nextLine();
        switch (command) {
            case ("help"):
                helpList();
                setCommand();
                break;
            case ("getDoctors"):
                Doctors.getDoctors();
                setCommand();
                break;
            case ("addDoctors"):
                Doctors.addDoctors();
                setCommand();
                break;
            case ("removeDoctors"):
                Doctors.removeDoctors();
                setCommand();
                break;
            case ("addPatients"):
                Patients.addPatients();
                setCommand();
                break;
            case ("getPatients"):
                Patients.getPatients();
                setCommand();
                break;
            case ("removePatients"):
                Patients.removePatients();
                setCommand();
                break;
            case ("changePatients"):
                Patients.changePatients();
                setCommand();
                break;
            case ("setAppoint"):
                Appointment.setAppoint();
                setCommand();
                break;
            case ("getAppoint"):
                Appointment.getAppoint();
                setCommand();
                break;
            case ("changeAppoint"):
                Appointment.changeAppoint();
                setCommand();
                break;
            case ("removeAppoint"):
                Appointment.removeAppoint();
                setCommand();
                break;
            default:
                System.out.println("Wrong command");
                setCommand();
        }


    }


    public void helpList() {
        System.out.println("Get a list of doctors: getDoctors");
        System.out.println("Add new doctor: addDoctors");
        System.out.println("Remove a doctor: removeDoctors");
        System.out.println("Add new patient: addPatients");
        System.out.println("Get a list of patients: getPatients");
        System.out.println("Remove a patient: removePatients");
        System.out.println("Change patient's name: changePatients");
        System.out.println("Add appointment: setAppointment");
        System.out.println("Get a list of appointments: getAppointment");
        System.out.println("Change an appointment: changeAppointment");
        System.out.println("Remove an appointment: removeAppointment");
    }



}