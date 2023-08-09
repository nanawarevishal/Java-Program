package Interface;

interface parent13{
    static void fun(){                                    // public static void fun()
        System.out.println("static fun parent");
    }

    default void gun(){                                    // public default void gun()
        System.out.println("default gun parent");
    }
}
