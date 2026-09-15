public class NumbersOperation {

    public static void main(String[] args){

        new NumbersOperation();
    }

    public NumbersOperation(){

        System.out.println("Q2");

        int array[] = new int[] {-1,3,-5};

        NumberTest negativeNum = number -> number < 0;
        //System.out.println("Negative number: " + countMatching(array,negativeNum));

        NumberTest divisible = number -> number / 3 == 0;
       // System.out.println("Number divisible by 3: " + countMatching(array,divisible));

        NumberTest equaltoseven = number -> number == 7;
       // System.out.println("Number equal to 7: " + countMatching(array, equaltoseven));

        NumberTest greaterThanAverage = number -> number > -3;
        //System.out.println("Number greater than the average of the array which is -3: " + countMatching(array,greaterThanAverage));

        NumberTest numGreaterThanTwo = number -> number > 2;
        System.out.println("Number greater than 2: " + countMatchingV2(array,numGreaterThanTwo));
    }

    //public static int countMatching(int[] array, NumberTest countNum){

    //    int counter = 0;

     //   for(int element : array){

       //      if(countNum.count(element)){
       //          counter++;
        //     }
      //  }

     //   return counter;
  //  }

    public static <Integer> int countMatchingV2(int[] array, NumberTest countNum){

        int counter = 0;

        for(int element : array){

            if(countNum.count(element))
                counter++;
        }
        return counter;

    }
}
