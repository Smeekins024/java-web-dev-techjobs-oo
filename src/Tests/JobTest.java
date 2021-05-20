package Tests;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertTrue(job2.getId()- job1.getId() == 1);
    }
    @Test
    public void testJobConstructorSetsAllFields(){
       Job testJob = new Job("Product tester",new Employer("ACME"),new Location("Desert"),new PositionType("Quality Control"), new CoreCompetency("Persistence"));
       assertEquals("ACME",testJob.getEmployer().getValue());
       assertEquals("Product tester",testJob.getName());
       assertEquals("Desert",testJob.getLocation().getValue());
       assertEquals("Quality Control",testJob.getPositionType().getValue());
       assertEquals("Persistence",testJob.getCoreCompetency().getValue());
    }
    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Football Player",new Employer("Kansas City Chiefs"),new Location("Missouri"),new PositionType("Quarterback"), new CoreCompetency("Determination"));
        Job testJob2 = new Job("Football Player",new Employer("Kansas City Chiefs"),new Location("Missouri"),new PositionType("Quarterback"), new CoreCompetency("Determination"));
        Boolean equalityCheck = testJob2.equals(testJob1);
        assertFalse(equalityCheck);
    }
    @Test
    public void testToString() {
        Job testJob = new Job("Football Player",new Employer("Denver Broncos"),new Location("Denver"),new PositionType("Quarterback"), new CoreCompetency("Determination"));
        System.out.println(testJob.getId());
        String expectedOutput = "\r\nID: 1\r\nName: Football Player\r\nEmployer: Denver Broncos\r\nLocation: Denver\r\nPosition Type: Quarterback\r\nCore Competency: Determination\r\n";
        assertEquals(expectedOutput,testJob.toString());
    }
}
