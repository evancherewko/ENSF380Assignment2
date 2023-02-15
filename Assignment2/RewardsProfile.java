package edu.ucalgary.oop;

public class RewardsProfile {
    //Object Variables
    private String rewardsNum = "Not enrolled";
    private int pointsTotal = 10;

    //Constructor
    public RewardsProfile(){

    }
    public RewardsProfile(String newNumber) throws InvalidRewardsNumException{
        for(int i = 0; i < newNumber.length(); i++){
            if (!Character.isDigit(newNumber.charAt(i))) {
                throw new InvalidRewardsNumException(); // REmove message?
            }
        }
    this.rewardsNum = newNumber;
    return;
    }
    //Helper Functions


    //Setters
    public void setPoints(int addPoints){
        this.pointsTotal += addPoints;
    }

    //Getters
    public int getPoints(){
        return this.pointsTotal;
    }
    public String getNumber(){
        return this.rewardsNum;
    }
    
}
