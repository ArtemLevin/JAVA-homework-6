public class Notebook {
    
    private String brand;
    private String operatingSys;
    private String ram;
    private String hdd;

    public Notebook (String brand, String operatingSys, String ram, String hdd){

        this.brand = brand;
        this.operatingSys = operatingSys;
        this.ram = ram;
        this.hdd = hdd;

    }

    public String getBrand(){
        return brand;
    }

    public String getOperSys(){
        return operatingSys;
    }

    public String getRam(){
        return ram;
    }

    public String getHdd(){
        return hdd;
    }
}