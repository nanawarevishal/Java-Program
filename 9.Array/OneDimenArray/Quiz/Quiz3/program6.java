package OneDimenArray.Quiz.Quiz3;

class Core2Web {

    public static void main(String[] args) {

            String var1 = null;
            var1 = args[0]+args[1]+args[2];
            System.out.println(var1);
    }
}


// input:>java Core2Web 10 20 30


/*
 Output:
    102030

 Explanation:
            Arguments stored in String[] args are in string format
        we access them and use '+'. + in string is used to concat
        So all the values in array args are simply concatenated.
 */
