package Assignment1MultipleInheritence;

public class Main{
    public static void main(String[] args){
        
        Robot robot = new Robot("Jervis");
        System.out.println(robot.getAnswerFromTextQuery("Hello"));
        System.out.println(robot.getAnsFromImageQuery("image.jpg"));
    }
}
