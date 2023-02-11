public class Client {
    //Object Variables
    private String name;
    private String phoneNumber;
    private String address;
    private RewardsProfile rewardsInfo;

    //Constructor
    public Client(String name, String phoneNumber, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.rewardsInfo = new RewardsProfile();
    }

    //Helper Functions
    public boolean enrollRewards(String newNumber){ //---------------------------------------------THIS ONE
        try{
            rewardsInfo = new RewardsProfile(newNumber);
        }catch(Exception e){
            return false;
        }
        return true;
    }
    public void updatePoints(int addPoints){
        rewardsInfo.setPoints(addPoints);
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(String num){
        this.phoneNumber = num;
    }
    public void setAddress(String address){
        this.address = address;
    }

    //Getters
    public int getRewardsPoints(){
        return rewardsInfo.getPoints();
    }
    public String getRewardsNumber(){
        return rewardsInfo.getNumber();
    }
    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getAddress(){
        return this.address;
    }



    
}
