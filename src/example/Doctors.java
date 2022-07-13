package example;

public class Doctors extends Command{


    public static void addDoctors() {
        System.out.print("Write doctor's name: ");
        String name = s.nextLine();
        DOCTORS.add(name);
    }

    public static String getDoctors() {
        System.out.println("Doctors:");
        for(int i = 0; i < DOCTORS.size(); i++) {
            System.out.println((i+1) + ". " + DOCTORS.get(i));
        }
        return "";
    }

    public static void removeDoctors() {
        getDoctors();
        System.out.print("Write number of a Doctor you want to remove: ");
        int number = s.nextInt()-1;
        DOCTORS.remove(number);
    }
}
