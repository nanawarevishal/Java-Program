package Instance.Constructor;

class Covid{
    
    int covidCases = 10;

    void casesDetails(){
        System.out.println("Covid Details..!");
    }

    public static void main(String[] args) {
        Covid obj = new Covid();
        obj.casesDetails();
        System.out.println(obj.covidCases);
    }
}