package Java2.Ques9;

class Woods {
    String name;
    int price;
    boolean fire, stress;

    public Woods(String name, int price, boolean fire, boolean stress) {
        this.name = name;
        this.price = price;
        this.fire = fire;
        this.stress = stress;
    }

    public void getDetails() {
        System.out.println("Product Name: Wooden " + name);
        System.out.println("Product Price: " + price);
    }

    public void doFireTest() {
        if(fire){
            System.out.println("Fire test already done");
        } else {
            System.out.println("Fire test now done");
        }
    }

    public void doStressTest() {
        if(stress){
            System.out.println("Stress test already done");
        } else {
            System.out.println("Stress test now done");
        }
    }
}
