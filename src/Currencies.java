/**
 * Created by eggplant on 2014/11/26.
 */
public class Currencies{
    public int number;
    float exchangeRateToDollar;

    Currencies(int number) {
        this.number = number;
    }

    public Currencies add(Currencies currency){
        int newNumber = (int)(this.exchangeRateToDollar / currency.exchangeRateToDollar * currency.number) + this.number;
        return new Currencies(newNumber);
    }

    public int getValue(){
        return number;
    }
}
