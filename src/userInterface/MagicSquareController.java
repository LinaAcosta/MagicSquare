package userInterface;
import model.*;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import customExceptions.NotPositionException;
import customExceptions.NotTypeException;
import customExceptions.parNumberException;
import javafx.event.ActionEvent;

public class MagicSquareController {
	@FXML
    private Label label;

    @FXML
    private BorderPane borderPane;

    @FXML
    private TextField n;

    @FXML
    private Button button;

    @FXML
    private TextField position;

    @FXML
    private TextField direction;

    @FXML
    public void fillMagicSquare(ActionEvent event){
           int number = Integer.parseInt(n.getText());
           int p = Integer.parseInt(position.getText());
           int d = Integer.parseInt(direction.getText());
           GridPane gridPane = new GridPane();
           borderPane.setCenter(gridPane);
           try {
        	   MagicSquare ms = new MagicSquare(number, p, d);
               ms.fillMagicSquare(number, p, d); 
               gridPane.add(new Label("" + ms.printSquare() + ""),p,d);
               label.setText("" + ms.calculateMagicConstant(number));
               System.out.println("The center is: " + ms.findCenter());
               System.out.println("The sum in the rows is :" + ms.sumRow());
               System.out.println("The sum in the columns is :" + ms.sumColumn());
               System.out.println("The sum in the first diagonal is :" + ms.sumDiagonal1());
               System.out.println("The sum in the second diagonal is :" + ms.sumDiagonal2());
           }catch(parNumberException e) {
        	   System.out.println("It was not possible create the magic square");
        	   System.out.println(e.getMessage());
        	   
           }catch(NotTypeException e) {
        	   System.out.println("It was not possible create the magic square");
        	   System.out.println(e.getMessage());
           }catch(NotPositionException e) {
 	           System.out.println("It was not possible create the magic square");
 	           System.out.println(e.getMessage());
           }
           
        	   
          
    }

}

