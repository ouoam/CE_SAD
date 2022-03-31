package edu.parinya.softarchdesign.structural;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    Set<HealthcareServiceable> members = new LinkedHashSet<>();

    public void addMember(HealthcareServiceable member) {
        members.add(member);
    }

    public void removeMember(HealthcareServiceable member) {
        members.remove(member);
    }

    public void service() {
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }

    public double getPrice() {
        double price = 0;
        for (HealthcareServiceable member : members) {
            price += member.getPrice();
        }
        return price;
    }
}
