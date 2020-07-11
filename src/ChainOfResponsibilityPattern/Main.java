package ChainOfResponsibilityPattern;

public class Main {
    private ChainBuilder chain = new ChainBuilder();
    public static void main(String[] args) {
            Address address = new Address();
            address.setStreetAddress("1000 N 4th St");
            address.setCity("Fairfield");
            address.setState("Iowa");
            address.setZipcode("52557");

            Customer customer = new Customer();
            customer.setAddress(address);
            customer.setEmail("brexhaj@miu.edu");
            customer.setPhone("6414513913");
            customer.setFirstName("Bleard");
            customer.setLastName("Rexhaj");

            CallRecord rec = new CallRecord();
            rec.setCustomer(customer);
            rec.setRequestInformation("Testing data");
            new Main().sendRequest(rec);
        }

        private void sendRequest (CallRecord rec){
            chain.getHandler().handleRequest(rec);
        }

    }
