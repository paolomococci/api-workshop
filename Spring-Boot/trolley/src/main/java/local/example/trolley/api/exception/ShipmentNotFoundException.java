package local.example.trolley.api.exception;

public class ShipmentNotFoundException
        extends RuntimeException {

    public ShipmentNotFoundException(Long id) {
        super("could not find shipment with id: " + id);
    }
}
