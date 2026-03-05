package features.vehicle.presentation;

import features.vehicle.data.VehicleDataRepository;
import features.vehicle.data.VehicleMemLocalDataSource;
import features.vehicle.domain.GetVehiclesUseCase;
import features.vehicle.domain.Vehicle;

import java.util.ArrayList;

public class VehicleView {

    public static void printVehicles() {

        GetVehiclesUseCase getVehiclesUseCase = new GetVehiclesUseCase(
                new VehicleDataRepository(
                        VehicleMemLocalDataSource.newInstance()));

        ArrayList<Vehicle> vehicles = getVehiclesUseCase.execute();

        System.out.println(vehicles);

    }

}
