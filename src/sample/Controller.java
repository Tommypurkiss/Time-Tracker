package sample;

import javafx.scene.control.Label;

import java.io.*;
import java.util.Date;



public class Controller {

    public String startDateTime;
    public String endDateTime;
    public Label startDateAndTimeLabel;
    public Label endDateAndTimeLabel;

    File file = new File("file.csv");

    public void getStartDateAndTime() {
        Date date = new Date();
        System.out.println(date);
        startDateAndTimeLabel.setText(date.toString());

        startDateTime = date.toString();
        System.out.println("start date time: " + startDateTime);
    }
//    startTimer

    public void getStopDateAndTime() {
        Date date = new Date();
        System.out.println(date);
        endDateAndTimeLabel.setText(date.toString());

        endDateTime = date.toString();
        System.out.println("end date time: " + endDateTime);
    }
//  endTimer


    // Saves the date and time
    public void saveDateAndTime() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        bufferedWriter.append("start time");
        bufferedWriter.append(",");
        bufferedWriter.append("end time");
        bufferedWriter.append("\n");

        bufferedWriter.append(startDateTime);
        bufferedWriter.append(",");
        bufferedWriter.append(endDateTime);
        bufferedWriter.append("\n\n");

        bufferedWriter.flush();
        bufferedWriter.close();

        System.out.println("timings added to sheet completed!");
    }

    // Exit the application
    public void exitApplication() {

        System.out.println("exit button clicked");
        System.exit(0);
    }

}
