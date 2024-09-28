
package laptopbuy.sell;
public class LaptopBuySell {

  
    public static void main(String[] args) {
        Laptop baselaptop = new Laptop(true);
        baselaptop.laptopNewWindowchargesAdded();
        baselaptop.laptopServicechargesAdded();
      	baselaptop.ram4GbExtraAdded();
        baselaptop.getLaptopBill();
    }
    
}
