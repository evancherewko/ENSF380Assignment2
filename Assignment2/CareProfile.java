public class CareProfile {
    //Object Variables
    private String[] medList;
    private String medInstructions;
    private String feedingInstructions;

    //Constructor
    public CareProfile(String[] medList, String meds, String feeding){
        this.medList = medList;
        this.medInstructions = meds;
        this.feedingInstructions = feeding;
    }

    //Helper Functions
    public String summarizeCareInstructions(){
        String summary = "";
        summary += "Care for " + "PLACEHOLDER" + ":\n"; // GET PLACEHOLDER????????????????????????
        for(int i = 0; i < medList.length; i++){
            summary += medList[i];
            summary += ", ";
        }
        summary = summary.substring(0, summary.length() - 2);
        summary += "\n" + medInstructions + "\n" + feedingInstructions;
        return summary;
    }



    //Setters
    

    //Getters

    
}
