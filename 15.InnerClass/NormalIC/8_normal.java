package NormalIC;

class Outer8{

    class Inner8{

        class Innerin8{
            
        }
    }
}

class client8{
    public static void main(String[] args) {
        Outer8.Inner8.Innerin8 obj  = new Outer8().new Inner8().new Innerin8();
    }
}