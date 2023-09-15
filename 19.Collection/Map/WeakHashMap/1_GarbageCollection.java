package Map.WeakHashMap;

class weakhashMap{

    String str;

    weakhashMap(String str){
        this.str = str;
    }

    public String toString(){

        return str;
    }

    public void finalize(){

        System.out.println("Notify");
    }

    public static void main(String[] args) {
        
        weakhashMap obj1 = new weakhashMap("Core2Web");
        weakhashMap obj2 = new weakhashMap("Biencaps");
        weakhashMap obj3 = new weakhashMap("Incubator");

        System.out.println(obj1);
        System.out.println(obj2);
        
        obj1 = null;
        obj2 = null;
        
        System.gc();

        System.out.println("In Main");
    }
}