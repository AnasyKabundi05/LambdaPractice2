public class StringCount {

    public static void main(String[] args){

        new StringCount();
    }

    public StringCount(){

        String[] words = new String[]{"apple", "banana", "dog", "angle"};

        //Part 3
        StringTest startWithA = count -> count.startsWith("a");
        System.out.println("Number of String elements that start with A: " + countStringsTest(words,startWithA));

        StringTest endtWithG = count -> count.endsWith("g");
        System.out.println("Number of String elements that end with G :" + countStringsTest(words, endtWithG));

    }

    public static int countStringsTest(String[] array, StringTest testCount){

        int counter = 0;

        for(String sentence : array){

            if(testCount.test(sentence))
                counter++;

        }
        return counter;
    }
}
