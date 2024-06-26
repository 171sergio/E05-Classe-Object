

public class Account {

    private Client owner;
    private double balance;
    private int ID;
    private float limit;
    private String agency;

    private Operation[] operations;

    private int operationCounter;

    public static int totAccounts=0;

    public Account(Client owner, double balance, int ID, float limit, String agency) {
        this.owner = owner;
        this.balance = balance;
        this.ID = ID;
        this.limit = limit;
        this.agency = agency;
        this.operations = new Operation[1000];
        this.operationCounter = 0;
        totAccounts++;
    }


    boolean deposit(float value) {
        if (value > 0.0) {
            this.balance += value;
            this.operations[operationCounter] = new DepositOperation(value);
            this.operationCounter++;
            return true;
        } else {
            return false;
        }
    }


    boolean withdraw(float value) {
        if (value > 0.0 && value <= this.balance) {
            this.balance -= value;
            this.operations[operationCounter] = new WithdrawOperation(value);
            this.operationCounter++;
            return true;
        } else {
            return false;
        }
    }


    boolean transfer(Account destineAccount, float value) {
        boolean withdrawMade = this.withdraw(value);
        if (withdrawMade) {
            boolean deposit = destineAccount.deposit(value);
            return deposit;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
		String accountStr = " Nome do dono da conta: " + this.owner.name+ "\n" +
     " Número da conta: " + this.ID+ "\n" +
     " Saldo atual: " + this.balance+ "\n" +
     " Limite: " + this.limit + "\n\n" ;
						 
		return accountStr;
	}
    @Override 
    public boolean equals(Object obj){
        Account actcomp = (Account) obj;
        return actcomp.ID == this.ID;
    }
    

    void printStatemant() {
        for (int i = 0; i < this.operationCounter; i++) {
            this.operations.toString();
        }
    }


    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOperationCounter(){
        return operationCounter;
    }
}