package ChainOfResponsibilityPattern;

public class ValidatorAgent extends AbstractHandler{
    @Override
    public void handleRequest(CallRecord rec) {
        if (validateRecord(rec.getCustomer())) {
            rec.setValid(true);
            if (nextHandler != null) {
                nextHandler.handleRequest(rec);
            }
        }
    }

    private boolean validateRecord(Customer c) {
        return validateAddress(c.getAddress()) &&
                validateEmail(c.getEmail()) &&
                validatePhone(c.getPhone());
    }

    private boolean validateAddress(Address address) {
        return address != null;
    }

    private boolean validateEmail(String email) {
        return email.contains("@");
    }

    private boolean validatePhone(String phone) {
        return phone.length() == 10;
    }
}
