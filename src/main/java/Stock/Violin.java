package Stock;

public class Violin extends Instrument {

    private int numberOfStrings;
    private String materialForBows;

    public Violin(double buyingPrice, double sellingPrice, String material, String type, int numberOfStrings,
                  String materialForBows) {
        super(buyingPrice, sellingPrice, material, type);
        this.numberOfStrings = numberOfStrings;
        this.materialForBows = materialForBows;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getMaterialForBows() {
        return materialForBows;
    }

    @Override
    public String play() {
        return "Screeeeee";
    }

    @Override
    public Double calculateMarkUp(Double sellingPrice, Double buyingPrice) {
        return sellingPrice - buyingPrice;
    }

}
