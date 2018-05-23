package demo.model;

import demo.task.LocationSimulator;
import lombok.Data;

@Data
public class GpsSimulatorRequest {

    private String runningId;
    private double speed;
    private boolean move = true;
    private boolean exportPositionToMessaging = true;
    private Integer reportInterval = 500;
    //private int secondsToError = 0;
    private RunnerStatus runnerStatus = RunnerStatus.NONE;
    private String polyline;
    private MedicalInfo medicalInfo;

}
