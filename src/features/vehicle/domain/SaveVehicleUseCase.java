package features.vehicle.domain;

public class SaveVehicleUseCase {

    private VehicleRepository vehicleRepository;

    public SaveVehicleUseCase(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public void execute(Vehicle vehicle) {
        vehicleRepository.saveVehicle(vehicle);
    }

}
