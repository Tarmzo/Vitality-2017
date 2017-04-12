package za.ac.cput.Assignment4.DIP.Disbey;

/**
 * Created by Avcuyile on 2017/03/31.
 */

public class Model implements Buy{
    private final double vwPolo = 35000;
    private final double toyota = 30000;
    private final double nissan = 17000;

    public double getVwPolo() {
        return vwPolo;
    }

    public double getToyota() {
        return toyota;
    }

    public double getNissan() {
        return nissan;
    }

    public double polos(int quantity){
        return quantity * getVwPolo();
    }

    public double toyotas(int quantity){
        return quantity * getToyota();
    }

    public double nissans (int quantity){
        return quantity * getNissan();
    }

    @Override
    public void enterPrice(){
        System.out.println("Buying Cars..");
        System.out.println("Cars bought..");
    }
}
