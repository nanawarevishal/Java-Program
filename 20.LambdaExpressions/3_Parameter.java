

interface Core2Web{

    String lang(int numCourses);

    // void marry();
}


class Client2{

    public static void main(String[] args) {
        // Core2Web c2w = new Core2Web(){    // new Year2022$1()

        //     public void lang(){
        //         System.out.println("Bootcamp/Java/OS");
        //     }
        // };
        
        Core2Web c2w = (xyz) -> {
            
            return "Bootcamp/Java/OS"+": "+xyz;
        };
        
        c2w.lang(8);
    }
}