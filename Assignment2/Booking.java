public class Booking {
    //Object Variables
    private final String STARTDATE;
    private final String ENDDATE;
    private final Pet BOOKEDPET;
    private final Employee CAREGIVER;

    //Constructor
    public Booking(Pet pet, Employee assigned, String startDate, String endDate){
        this.STARTDATE = startDate;
        this.ENDDATE = endDate;
        this.BOOKEDPET = pet;
        this.CAREGIVER = assigned;
    }   

    //Helper Functions


    //Setters
    

    //Getters
    public String getStartDate(){
        return this.STARTDATE;
    }
    public String getEndDate(){
        return this.ENDDATE;
    }
    public Pet getBookedPet(){
        return this.BOOKEDPET;
    }
    public Employee getCaregiver(){
        return this.CAREGIVER;
    }
    
}
