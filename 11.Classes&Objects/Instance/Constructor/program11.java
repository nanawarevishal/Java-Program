package Instance.Constructor;

class mackdee{
    int noOfItem = 10;
    String product = "Fries";

    void menu(){
        String menu1 = "Veg";
        String menu2 = "Non-Veg";

        System.out.println(noOfItem);
        System.out.println(product);
    }
}

class display{
    public static void main(String[] args) {
        mackdee obj = new mackdee();
        obj.menu();
    }
}
