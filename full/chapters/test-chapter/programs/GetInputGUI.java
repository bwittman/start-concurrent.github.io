import javax.swing.*;

public class GetInputGUI {
    public static void main(String[] args) {
        String title = "Bouncing Ball: Subproblem 1";
        
        // Declare variables to hold input data
        double height, coefficient;
        int bounces; 
        
        // Declare user prompt strings
        String enterHeight = "Enter the height: ";
        String enterCoefficient =
            "Enter restitution coefficient: ";
        String enterBounces = "Enter the number of bounces: ";      
        
        // Prompt the user, get data, and convert it
        String response = JOptionPane.showInputDialog(null,/*@\label{inputDialogLineOne}@*/
            enterHeight, title, JOptionPane.QUESTION_MESSAGE);
        height = Double.parseDouble(response); /*@\label{convertToDoubleLineOne}@*/
        response = JOptionPane.showInputDialog(null,/*@\label{inputDialogLineTwo}@*/
            enterCoefficient, title, JOptionPane.QUESTION_MESSAGE);
        coefficient = Double.parseDouble(response);/*@\label{convertToDoubleLineTwo}@*/ 
        response = JOptionPane.showInputDialog(null,/*@\label{inputDialogLineThree}@*/
            enterBounces, title, JOptionPane.QUESTION_MESSAGE);
        bounces = Integer.parseInt(response);/*@\label{convertToDoubleLineThree}@*/       
    } 
}
