package Assignment1MultipleInheritence;
public class Robot implements ArtificialIntelligence, ComputerVision
{
    String name;
    @Override
    public String getAnswerFromTextQuery(String question){
        return question;
    }
    @Override
    public String getAnsFromImageQuery(String image){
        return image;
    }
    public Robot(String name){
        this.name = name;
    }
    
    public String run(){
        return name + " is running";
    }

}
    

