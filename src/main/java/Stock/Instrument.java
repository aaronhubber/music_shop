package Stock;

import interactionsFinancial.IPlay;
import interactionsFinancial.ISell;

public abstract class Instrument extends Stock implements IPlay, ISell {

    private String material;
    public String type;

    public Instrument(double buyingPrice, double sellingPrice, String material, String type) {
        super(buyingPrice, sellingPrice);
        this.material = material;
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }
}
