package MethodOverriding;

class IPLinfo{

    void matchInfo(String team1,String team2){
        System.out.println(team1 +" vs "+team2);
    }

    void matchInfo(String team1,String team2,String Venue){
        System.out.println(team1 +" vs "+team2);
        System.out.println("Venue: "+Venue);
    }
}


class client8{

    public static void main(String[] args) {
                                                                                                                                                                        
        IPLinfo ipl2023 = new IPLinfo();
        ipl2023.matchInfo("RCB", "CSK", "Chinnaswamy");
    }
}