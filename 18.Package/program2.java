import addFun.addition;

class client{
    public static void main(String[] args) {
        
        addition obj = new addition(10, 20);

        System.out.println(obj.add());
    }
}
