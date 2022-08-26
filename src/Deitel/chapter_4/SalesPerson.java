package Deitel.chapter_4;

public class SalesPerson {

    private  Items soldItems;
    private Items[] items = new Items[1];
    public Items  getSoldItems(){
        return soldItems;
    }
public void setSoldItems(Items soldItems){
        this.soldItems = soldItems;
    }

}