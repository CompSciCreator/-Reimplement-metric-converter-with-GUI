
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MetricConversionApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Metric Converter");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        Label choiceLabel = new Label("Choose a conversion option:");
        grid.add(choiceLabel, 0, 0, 2, 1);

        ComboBox<String> conversionOptions = new ComboBox<>();
        conversionOptions.getItems().addAll(
                "Kilograms to Pounds",
                "Grams to Ounces",
                "Kilometers to Miles",
                "Millimeters to Inches"
        );
        grid.add(conversionOptions, 0, 1, 2, 1);

        Label inputLabel = new Label("Enter the value:");
        grid.add(inputLabel, 0, 2);

        TextField inputValue = new TextField();
        grid.add(inputValue, 1, 2);

        Label resultLabel = new Label("Result:");
        grid.add(resultLabel, 0, 3);

        Label resultValue = new Label();
        grid.add(resultValue, 1, 3);

        Button convertButton = new Button("Convert");
        convertButton.setOnAction(e -> {
            String selectedOption = conversionOptions.getValue();
            double input = Double.parseDouble(inputValue.getText());
            double result = handleConversion(selectedOption, input);
            resultValue.setText(String.valueOf(result));
        });
        grid.add(convertButton, 0, 4, 2, 1);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private double handleConversion(String selectedOption, double input) {
        switch (selectedOption) {
            case "Kilograms to Pounds":
                return convertKilogramsToPounds(input);
            case "Grams to Ounces":
                return convertGramsToOunces(input);
            case "Kilometers to Miles":
                return convertKilometersToMiles(input);
            case "Millimeters to Inches":
                return convertMillimetersToInches(input);
            default:
                throw new IllegalArgumentException("Invalid conversion");
        }
    }


    
    

   
    
    public static double convertKilogramsToPounds(double kilograms) {

        // Conversion factor: 1 kilogram = 2.20462 pounds

        return kilograms * 2.20462;

    }

    public static double convertGramsToOunces(double grams) {

        // Conversion factor: 1 gram = 0.03527396 ounces

        return grams * 0.03527396;

    }

    public static double convertKilometersToMiles(double kilometers) {

        // Conversion factor: 1 kilometer = 0.621371 miles

        return kilometers * 0.621371;

    }

    public static double convertMillimetersToInches(double millimeters) {

        // Conversion factor: 1 millimeter = 0.0393701 inches

        return millimeters * 0.0393701;

    }










}

 









    




            
        
        




