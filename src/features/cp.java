package features;

import features.vehicle.data.VehicleMemLocalDataSource;
import features.vehicle.domain.Vehicle;

public class cp {


    void saveVehicle(Vehicle vehicle);



    public static void saveVehicles(Vehicle vehicle) {


        SaveVehicleUseCase saveVehicleUseCase = new SaveVehicleUseCase(
                new VehicleDataRepository(
                        VehicleMemLocalDataSource.newInstance()));

        saveVehicleUseCase.execute(vehicle);
    }




    @Override
    public void saveVehicle(Vehicle vehicle) {
        vehicleMemLocalDataSource.save(vehicle);
    }




}
