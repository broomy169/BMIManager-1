import java.util.ArrayList;

/**
 * Patients - records several patients
 * Created by Jason on 22/03/2015.
 */
public class Patients {
    ArrayList<Patient> records;

    public Patients() {
        records = new ArrayList<Patient>();
    }


    public int count() {
        return records.size();
    }

    public void add(Patient patient) {
        records.add(patient);
    }

    public Patient get(int i) {
        return records.get(i);
    }

    public boolean isEmpty() {
        return records.isEmpty();
    }

    public void removePatientsName(String name) {
        for (int i = 0; i <records.size(); ++i){
            if (records.get(i).getName().equals(name)){
                records.remove(i);
                --i;
            }
        }
    }
}


