package edu.ucalgary.oop;


public class ReportCard {
    //Object Variables
    private final Booking REPORT;


    //Constructor
    public ReportCard(Booking reportInfo){
        this.REPORT = reportInfo;
    }

    //Helper Functions
    public String printReport(){
        String report = REPORT.getCaregiver().getName() + " enjoyed taking care of " + REPORT.getBookedPet().getName() + ". See you next time!";
        return report;
    }

    //Setters
    

    //Getters

    
}
