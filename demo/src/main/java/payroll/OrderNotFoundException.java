package payroll;

public class OrderNotFoundException extends Exception {
    public OrderNotFoundException(Long id) {
        super("OrderNotFoundException " + id);
    }
}
