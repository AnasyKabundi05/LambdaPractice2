public class DoubleArray {

    public static void main(String[] args){

        new DoubleArray();
    }

    public DoubleArray(){

        //Seperate practice question

        double[] array = new double[]{-3.0,-5.6,9.6,7.6, 5, 9, 12};

        TestDoubleArray testPositive = number -> number > 0.0;
        System.out.println("Number of positive values: " + testArray(array,testPositive));

        TestDoubleArray testWholeNum = number -> number % 1 == 0;
        System.out.println("Number of whole values: " + testArray(array, testWholeNum));

        TestDoubleArray testRange = number -> number <= 10 && number >= 1;
        System.out.println("Numbers in the range of 1 and 10: " + testArray(array,testRange));

        TestDoubleArray testRoundedInteger = number -> Math.round(number) % 2 == 0;
        System.out.println("Number of values when rounded are even: " + testArray(array,testRoundedInteger));

    }

    public static int testArray(double[] array, TestDoubleArray testDouble){

        int counter = 0;

        for(double element : array){

            if(testDouble.test(element))
                counter++;
        }
        return counter;
    }

}
