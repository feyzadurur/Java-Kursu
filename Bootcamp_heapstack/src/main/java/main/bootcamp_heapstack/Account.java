package main.bootcamp_heapstack;
public class Account {
    int accountID;
    String accountName;

    public Account(int accountID, String accountName) {
        this.accountID = accountID;
        this.accountName = accountName;
    }
    
    public static void main(String[] args) {
        int accountID=12;
        String accountName="FEYZA DURUR";
        
        Account account=null;
        account=printAccount(accountID,accountName);
    }
    static Account printAccount(int accountID,String accountName){
        return new Account(accountID,accountName);
    }
    
    
}
