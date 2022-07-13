package example;

import java.util.ArrayList;


public class Appointment extends Command {
    private static final ArrayList<String> APP_PATIENT = new ArrayList<>();
    private static final ArrayList<String> APP_DOCTOR = new ArrayList<>();
    private static final ArrayList<String> APP_TIME = new ArrayList<>();
    protected static final ArrayList<String> APP_STATUS = new ArrayList<>();

    public static void setAppoint() {
        System.out.println(Patients.getPatients());
        System.out.print("Write patient's name: ");
        String p_name = s.nextLine();
        System.out.println(Doctors.getDoctors());
        System.out.print("Write doctor's name: ");
        String d_name = s.nextLine();
        System.out.print("Write date and time of appointment in format: \"dd/MM HH:mm\": ");
        String a_time = s.nextLine();
        APP_PATIENT.add(p_name);
        APP_DOCTOR.add(d_name);
        APP_TIME.add(a_time);
        APP_STATUS.add("New");
    }

    public static void getAppoint() {
        for (int i = 0; i < APP_PATIENT.size(); i++) {
            System.out.print(" Patient: " + APP_PATIENT.get(i));
            System.out.print(" Doctor: " + APP_DOCTOR.get(i));
            System.out.print(" Time: " + APP_TIME.get(i));
            System.out.print(" Status: " + APP_STATUS.get(i) + "\n");
        }
    }

    public static void changeAppoint() {
        getAppoint();
        System.out.print("Write Appointment number you want to change: ");
        int number = s.nextInt()-1;
        System.out.println("Appointment can have one of the following statuses: New, In process, Canceled, Waiting for payment, Closed.");
        System.out.print("Write new status of the appointment: ");
        String a_status = s.nextLine();
        a_status = s.nextLine();
        APP_STATUS.set(number,a_status);
    }


    public static void removeAppoint() {
        getAppoint();
        System.out.print("Write number of appointment you want to remove: ");
        int number = s.nextInt()-1;
        APP_PATIENT.remove(number);
        APP_DOCTOR.remove(number);
        APP_TIME.remove(number);
        APP_STATUS.remove(number);
    }


}
