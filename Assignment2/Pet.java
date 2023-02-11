public class Pet {
    //Object Variables
    private final String NAME;
    private final String SPECIES;
    private final String BREED;
    private final String COLOUR;

    private boolean vaccineStatus = false;
    private Client owner;
    private EmergVet vet;
    private CareProfile care;


    //Constructor
    public Pet(String name, String species, String breed, String colour, Client owner){
        this.NAME = name;
        this.SPECIES = species;
        this.BREED = breed;
        this.COLOUR = colour;
        this.owner = owner;
    }

    //Helper Functions
    public void updateVaccineStatus(boolean change){
        this.vaccineStatus = change;
    }



    //Setters
    public void setVet(EmergVet vet){
        this.vet = vet;
    }
    public void setCare(String[] meds, String medInstr, String feedingInstr){
        this.care = new CareProfile(meds, medInstr, feedingInstr);
    }
    public void setOwner(Client updateOwner){
        this.owner = updateOwner;
    }



    //Getters

    public EmergVet getVet(){
        return this.vet;
    }
    public boolean getVaccineStatus(){
        return this.vaccineStatus;
    }
    public String getCareSummary(){
        return care.summarizeCareInstructions();
    }
    public Client getOwner(){
        return this.owner;
    }
    public String getName(){
        return this.NAME;
    }   
    public String getSpecies(){
        return this.SPECIES;
    }
    public String getBreed(){
        return this.BREED;
    }
    public String getColour(){
        return this.COLOUR;
    }


}
