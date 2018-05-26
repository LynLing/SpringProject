package demo.service;

import demo.model.DirectionInput;
import demo.model.Point;
import demo.model.SimulatorInitLocations;

import java.util.List;


public interface PathService {

    SimulatorInitLocations loadSimulatorFixture();

    List<DirectionInput> loadDirectionInput();

    List<Point> getCoordinatesFromGoogle(DirectionInput directionInput);

    String getCoordinatesFromGoogleAsPolyline(DirectionInput directionInput);

}