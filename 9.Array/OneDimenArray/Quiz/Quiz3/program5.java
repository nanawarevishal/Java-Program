package OneDimenArray.Quiz.Quiz3;

class Core2Web {

    public static void main(String arg[]) {

            System.out.println(arg[0]);
    }
}


// input:>java Core2Web & 


/*
 Output:
    ArrayIndexOutOfBound

 Explanation: 
        Special characters like & have a meaning in the shell(terminal)
    when & is given at the command line, the meaning of & in the shell is,
    to run the command or task in the background. And terminal does not wait for the task to finish.
    So '&' becomes meaningful for the shell and never reaches String[] args(array).
    And we try to access a value at the index, where nothing is stored.
    Thus we get ArrayIndexOutOfBoundsException.
 */
