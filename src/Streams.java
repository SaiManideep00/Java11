import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Streams {
    public static void main(String[] args) {

        //1. Find below a list of integers. Iterate over it and print the square of each number.

        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Enter your code here
//        numbers1.stream().forEach(a-> System.out.println(a*a));
//        numbers1.stream().map(a->a*a).forEach(System.out::println);


       // 2. Find below a list of integers. Iterate over it and print every even number.

        List<Integer> numbers2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Enter your code here
//        numbers2.stream().forEach((value)->{
//            if(value%2==0)
//                System.out.println( value);
//        });


        //3. For the list of integers, find all the even numbers. Then, iterate over the even numbers and print each number.

        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Enter your code here
//        List<Integer> list=numbers3.stream().filter(a->a%2==0).toList();
//        for(int l:list)
//            System.out.println(l);

       // 4. For a list of integers, return a list of the squares of each number.

        List<Integer> numbers4 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
// Enter your code here
        List<Integer> squaredNumbers=numbers4.stream().map(a->a*a).toList();
        System.out.println(squaredNumbers);
        //4.1 find all even numbers and return squares
        List<Integer> squaredNumbersEven=numbers4.stream().filter(v->v%2==0).map(a->a*a).toList();
        System.out.println(squaredNumbersEven);

       // 5. For a list of strings, return a list of the length of each string.



        List<String> names5 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<Integer> lengthOfStrings=names5.stream().map(String::length).toList();
        System.out.println(lengthOfStrings);
// Enter your code here

       // 6. For a list of strings, filter out the strings which do not start with the letter `T` and then uppercase the remaining strings.

        List<String> names6 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
// Enter your code here
        List<String> upperCase=names6.stream().filter(v->v.charAt(0)!='T').map(String::toUpperCase).toList();
        System.out.println(upperCase);

       // 7. For a list of strings, filter out the strings which do not start with the letter `T`, then uppercase the remaining strings and then sort them.

        List<String> names7 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
// Enter your code here
        List<String> upperCaseSorted=names6.stream().filter(v->v.charAt(0)!='T').map(String::toUpperCase).sorted().toList();
        System.out.println(upperCaseSorted);
        //8. For a list of integers, find the sum of all the numbers.

        List<Integer> numbers8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum=numbers8.stream().reduce(0,(a,b)->a+b);

        System.out.println(sum);
// Enter your code here

        //9. For a list of integers, find the sum of the squares of all the numbers.

        List<Integer> numbers9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int squaresSum=numbers9.stream().reduce(0,(a,b)->a+b*b);
        System.out.println(squaresSum);
// Enter your code here

        //10. For a list of integers, find the sum of the squares of all the even numbers.


        List<Integer> numbers10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenSquaresSum=numbers10.stream().filter(a->a%2==0).reduce(0,(a,b)->a+b*b);
        System.out.println(evenSquaresSum);
        int evenSquaresSum2=numbers10.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .reduce(0, (number1, number2) -> number1 + number2);
        System.out.println(evenSquaresSum2);
// Enter your code here


        //11.  Given a list of numbers, find the maximum number in the list.

        List<Integer> numbers11 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int maximum=numbers11.stream().reduce(0,(a,b)->a>b?a:b);
        System.out.println(maximum);
// Enter your code here

        //12. Given a list of numbers with duplicates, find the distinct numbers in the list.

        List<Integer> numbers12 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
// Enter your code here
        List<Integer> distinctNumbers=numbers12.stream().distinct().toList();
        System.out.println(distinctNumbers);

        //13.  Given a list of numbers, find the average of all the numbers.
        List<Integer> numbers13 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int average=numbers13.stream().reduce(0,(a,b)->a+b)/numbers13.size();
        System.out.println(average);
// Enter your code here

        //14. Give a list of strings, find the average length of all the strings.

        List<String> names14 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        //Double averageLength= (names14.stream().map(v->v.length()).reduce(0,(a, b)->a+b)/names14.size());
        //System.out.println(averageLength);
        Double averageLength2 = names14.stream()
                .mapToInt(String::length)
                .average()
                .getAsDouble();
        System.out.println(averageLength2);
// Enter your code here

        //15.  Given a list of strings, find the first string that is longer than 10 characters.

        List<String> names15 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
// Enter your code here
        Optional<String> firstLongName = names15.stream()
                .filter(name -> name.length() > 10)
                .findFirst();
        System.out.println(firstLongName);

    }
}
