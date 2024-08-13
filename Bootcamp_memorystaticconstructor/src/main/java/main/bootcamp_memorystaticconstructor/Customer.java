package main.bootcamp_memorystaticconstructor;

public class Customer {

    private int customerId;

    private String customerName;

    private String transactionInfo;
    
    
    /*

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setTransactionInfo(String transactionInfo) {
        this.transactionInfo = transactionInfo;
    }
    */

    public Customer(int id, String name, String info) {
        this.customerId = id;
        this.customerName = name;
        this.transactionInfo = info;
    }
    
    

    public static void main(String[] args) {

        //Customer customer = new Customer();

        /*
        customer.customerId=1;
        customer.customerName="feyza";
        customer.transactionInfo="money transferring";
        */
        
        
        /*
        customer.setCustomerId(12);
        customer.setCustomerName("feyza");
        customer.setTransactionInfo("Money transferring");
        */
        
        Customer customer=new Customer(12, "feyza", "money transferring");
        
        System.out.println(customer.customerId);
        System.out.println(customer.customerName);
        System.out.println(customer.transactionInfo);
    }

}
