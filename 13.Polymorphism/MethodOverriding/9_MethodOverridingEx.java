package MethodOverriding;

class Match{

    void matchType(){
        System.out.println("T20/One-Day-International/Test-Series");
    }
}


class IPLMatch extends Match{

    void matchType(){
        System.out.println("T20");
    }
}


class OneDayMatch extends Match{

    void matchType(){
        System.out.println("One-Day-International");
    }
}

class Client9{
    public static void main(String[] args) {
        Match type1 = new IPLMatch();
        Match type2 = new OneDayMatch();
        type1.matchType();
        type2.matchType();
    }
}