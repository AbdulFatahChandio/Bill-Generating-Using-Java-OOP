
package laptopbuy.sell;
class Laptop {
    private int price;
    private Boolean used;
    private int extraRam2gb = 2000;
    private int extraRam4gb = 4000;
    private int extraRam8gb = 8000;
    private int lapService  = 1000;
    private int newWindow   = 850;
    private int finalPrice;
    private Boolean isExtra2GbRamAdded = false;
    private Boolean isExtra4GbRamAdded = false;
    private Boolean isExtra8GbRamAdded = false;
    private Boolean islapServiceChargesAdded = false;
    private Boolean isNewWindowChargesAdded = false;
    
    public Laptop(Boolean used){
        this.used = used;
        if(this.used){
            this.price=15000; 
        }else{
            this.price=20000;
        }
        finalPrice = this.price;
    }
//    public void laptopPrice(){
//        System.out.println(this.price);
//    }
    public void ram2GbExtraAdded(){
        isExtra2GbRamAdded = true;
        this.price += extraRam2gb;
    }
    public void ram4GbExtraAdded(){
        isExtra4GbRamAdded = true;
        this.price += extraRam4gb;
    }
    public void ram8GbExtraAdded(){
        isExtra8GbRamAdded = true;
        this.price += extraRam8gb;
    }
    public void laptopServicechargesAdded(){
        islapServiceChargesAdded = true;
        this.price +=lapService;
    }
    public void laptopNewWindowchargesAdded(){
        isNewWindowChargesAdded = true;
        this.price +=newWindow;
    }
    public void getLaptopBill(){
        System.out.println("\n** Welcome To Abdul Fatah Tecno Shop **\n");
        String bill = "";
        System.out.println("Laptop Price               :" +finalPrice);
        if(isExtra2GbRamAdded){
            bill += "Extra 2GB Ram Added         :"+extraRam2gb+ "\n";
        }
        if(isExtra4GbRamAdded){
            bill += "Extra 4GB Ram Added        :"+extraRam4gb+ "\n";
        }
        if(isExtra8GbRamAdded){
            bill += "Extra 8GB Ram Added       :"+extraRam8gb+ "\n";
        }
        if(islapServiceChargesAdded){
           bill += "Service Charge Added       :"+ lapService+ "\n";
        }
        if(isNewWindowChargesAdded){
         bill += "New Window Charge Added    :"+ newWindow+ "\n";   
        }
        bill +="\n    Final Price     :"+this.price+"\n";
        System.out.println(bill);
    }
}
