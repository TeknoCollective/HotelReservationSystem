package reservationsystem.model;

import java.util.Currency;

public class RoomType {

    private String name;
    private Currency price;
    private Currency stayPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency getPrice() {
        return price;
    }

    public void setPrice(Currency price) {
        this.price = price;
    }

    public Currency getStayPrice() {
        return stayPrice;
    }

    public void setStayPrice(Currency stayPrice) {
        this.stayPrice = stayPrice;
    }
}
