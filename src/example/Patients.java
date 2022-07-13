package example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Patients extends Command{

    private static final ArrayList<String> PATIENTS_REGISTRATION_DATE = new ArrayList<>();

    public static void addPatients() {
        System.out.print("Write patient's full name: ");
        String name = s.nextLine();
        PATIENTS.add(name);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        String Date_but_string = localDate.format(dtf);
        PATIENTS_REGISTRATION_DATE.add(Date_but_string);
    }

    public static void removePatients() {
        getPatients();
        System.out.print("Write Patient's ID to remove: ");
        int number = s.nextInt()-1;
        PATIENTS.remove(number);
        PATIENTS_REGISTRATION_DATE.remove(number);
    }


    public static String getPatients() {
        for(int i = 0; i < PATIENTS.size(); i++) {
            System.out.print("ID: " + (i+1));
            System.out.print(" || Name: " + PATIENTS.get(i));
            System.out.print(" || Registration Date: " + PATIENTS_REGISTRATION_DATE.get(i) + "\n");
        }
        return "Patients list";
    }
    public static void changePatients() {
        getPatients();
        System.out.print("Write patient's ID you want to change: ");
        int number = s.nextInt()-1;
        System.out.print("Write patient's new name: ");
        String name = s.nextLine();
        name = s.nextLine();
        PATIENTS.set(number, name);
    }


}
