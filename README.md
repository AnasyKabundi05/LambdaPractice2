2. Write a method to count the number of elements in an int array that have a specific property

Write a method to count the number of elements in an int array that have a specific property (for example, odd integers, even numbers, prime numbers etc.). This method should accept the int array and a lambda expression as arguments. It should return an int (how many elements in the array satisfied the condition specified in the lambda).

3. Write a method to count the number of elements in a String array that have a specific property

Write a method to count the number of elements in a String array that have a specific property (for example, how terms in the array begin/end with a particular pattern). This method should accept the String array and a lambda expression as arguments. It should return an int (how many elements in the array satisfied the condition specified in the lambda).

4. Additional Task

Is there scope to replace the two methods you created in tasks 2 and 3 with a single generic method? It would certainly cut down on the amount of code duplication in your solution. You will have to tweak the interface you developed for steps 1 and 2 (or perhaps create a new one) and subsequently create new lambda expressions to test this generic method.

You must write an appropriate functional interface for each of the above steps, and the code necessary to test these methods.
