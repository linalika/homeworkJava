package lesson7;

public class Storage {
    private int amount;
    private int freeze;
    public Storage(int amount){
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getFreeze() {
        return freeze;
    }

    public void setFreeze(int freeze) {
        this.freeze = freeze;
    }

    public int getAvailableAmount(){
        return amount-freeze;
    }

}
