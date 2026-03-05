package features.vehicle.data;

import features.vehicle.domain.Vehicle;
import features.vehicle.domain.VehicleRepository;

import java.util.ArrayList;

public class VehicleDataRepository implements VehicleRepository {

    private VehicleMemLocalDataSource vehicleMemLocalDataSource;

    public VehicleDataRepository(VehicleMemLocalDataSource vehicleMemLocalDataSource) {
        this.vehicleMemLocalDataSource = vehicleMemLocalDataSource;
    }

    @Override
    public ArrayList<Vehicle> getVehicles() {
        return vehicleMemLocalDataSource.findAll();
    }

}
