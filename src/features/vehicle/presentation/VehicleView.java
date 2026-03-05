package features.vehicle.presentation;

import features.vehicle.data.VehicleDataRepository;
import features.vehicle.data.VehicleMemLocalDataSource;
import features.vehicle.domain.GetVehiclesUseCase;
import features.vehicle.domain.SaveVehicleUseCase;
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

    public static void saveVehicles(Vehicle vehicle) {

        printVehicles();

        SaveVehicleUseCase saveVehicleUseCase = new SaveVehicleUseCase(
                new VehicleDataRepository(
                        VehicleMemLocalDataSource.newInstance()));

        saveVehicleUseCase.execute(vehicle);

        printVehicles();

    }



}
