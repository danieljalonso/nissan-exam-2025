import features.vehicle.domain.Vehicle;
import features.vehicle.presentation.VehicleView;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------guardar-----------");
        VehicleView.saveVehicles(new Vehicle("1", "Dacia Duster", "White", "125", "5"));

        System.out.println("----------obtener-----------");
        VehicleView.printVehicles();

        System.out.println("----------eliminar-----------");
        VehicleView.deleteVehicles("1");

    }
}