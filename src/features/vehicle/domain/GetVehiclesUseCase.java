package features.vehicle.domain;

import java.util.ArrayList;

public class GetVehiclesUseCase {

    private VehicleRepository vehicleRepository;

    public GetVehiclesUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public ArrayList<Vehicle> execute() {
        return vehicleRepository.getVehicles();
    }

}
