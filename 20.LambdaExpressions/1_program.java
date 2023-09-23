
interface Core2Web{

    void lang();

    // void marry();
}


class Year2022{

    public static void main(String[] args) {
        // Core2Web c2w = new Core2Web(){    // new Year2022$1()

        //     public void lang(){
        //         System.out.println("Bootcamp/Java/OS");
        //     }
        // };
        
        Core2Web c2w = ()->{

            System.out.println("Bootcamp/Java/OS");
        };


        c2w.lang();
    }
}