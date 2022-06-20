package payroll;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Long id) {
        super("Ei leidnud employee'd " + id);
    }
}
