import java.util.ArrayList;

public class City {
    String cityName;
    int itemsInStock;
    int cityID;

    public City(int cityID) {
        this.cityID = cityID;
    }

    public City() {

    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public City(String cityName, int itemsInStock,int cityID) {
        this.cityName = cityName;
        this.itemsInStock = itemsInStock;
        this.cityID = cityID;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(int itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public void travel()
    {
        if (this.cityID == 1)
        {
            System.out.println("Welcome to " + cityName);
        }
        else if (this.cityID == 2)
        {
            System.out.println("Welcome to " + cityName);
        }
        else if (this.cityID == 3)
        {
            System.out.println("Welcome to " + cityName);
        }
        else if (this.cityID == 4)
        {
            System.out.println("Welcome to " + cityName);
        }
        else
        {
            System.out.println("Where the fuck are we");
        }
    }

}
