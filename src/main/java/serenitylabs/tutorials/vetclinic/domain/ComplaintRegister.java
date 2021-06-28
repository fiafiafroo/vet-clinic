package serenitylabs.tutorials.vetclinic.domain;

import java.util.ArrayList;
import java.util.List;

public class ComplaintRegister {

    List<String> complaints = new ArrayList<>();

    public ComplaintRegister() {
    }

    public List<String> getComplaints() {
        return complaints;
    }

    public void recordComplaint(String complaint) {

        complaints.add(complaint);
    }
}
