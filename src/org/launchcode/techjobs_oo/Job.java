package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }



    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String returnString;
        String jobName;
        String jobEmployer;
        String jobLocation;
        String jobPositionType;
        String jobCoreCompetency;

        if (this.name.isEmpty()) {
            jobName = "Data not available.";
        } else {
            jobName = this.name;
        }
        if (this.getEmployer().getValue().isEmpty()) {
            jobEmployer = "Data not available";
        }else {
            jobEmployer = this.getEmployer().getValue();
        }
        if (this.getLocation().getValue().isEmpty()) {
            jobLocation = "Data not available";
        }else {
            jobLocation = this.getLocation().getValue();
        }
        if (this.getPositionType().getValue().isEmpty()) {
            jobPositionType = "Data not available";
        }else {
            jobPositionType = this.getPositionType().getValue();
        }
        if (this.getCoreCompetency().getValue().isEmpty()) {
            jobCoreCompetency = "Data not available";
        }else {
            jobCoreCompetency = this.getCoreCompetency().getValue();
        }





        returnString = "\r\nID: " + Integer.toString(this.id) +
                "\r\nName: " + jobName +
                "\r\nEmployer: " + jobEmployer +
                "\r\nLocation: " + jobLocation +
                "\r\nPosition Type: " + jobPositionType +
                "\r\nCore Competency: " + jobCoreCompetency + "\r\n";

        return returnString;
    }




    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
