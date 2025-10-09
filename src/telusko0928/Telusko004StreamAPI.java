package telusko0928;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Telusko004StreamAPI {
    public static void main(String[] args)
    {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            randomNumbers.add(random.nextInt(1000)+1);
        }
        System.out.println("Random Numbers : "+randomNumbers);

        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : randomNumbers){
            if (number%2==0){
                evenNumbers.add(number);
            }
        }
        System.out.println("even Numbers : "+evenNumbers);

        List<Integer> doubledEvenNumbers = new ArrayList<>();
        for (Integer evenNumber : evenNumbers){
                doubledEvenNumbers.add(evenNumber*2);
        }
        System.out.println("doubled even Numbers : "+doubledEvenNumbers);

        int sum=0;
        for (Integer doubleEvenNumber : doubledEvenNumbers){
            sum+=doubleEvenNumber;
        }
        System.out.println("Sum of doubled even numbers : "+sum);

        // Approach 1
        Predicate<Integer> evenNum = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num%2==0;
            }
        };

        Function<Integer,Integer> doubledEvenNum = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer num) {
                return num*2;
            }
        };

        BinaryOperator<Integer> sumNumbers = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer c, Integer e) {
                return c+e;
            }
        };

        Stream<Integer> s1 = randomNumbers.stream();
        Stream <Integer> s2 = s1.filter(evenNum);
        Stream <Integer> s3 = s2.map(doubledEvenNum);
        int sum2 = s3.reduce(0,sumNumbers);
//        System.out.println(s3.toList());  // terminal operation
        System.out.println(sum2);

        // Approach 2
//        Predicate <Integer> evenNum = num -> num%2==0;
//        Function<Integer,Integer> doubledEvenNum = num -> num*2;
//        BinaryOperator<Integer> sumNumbers = ( c, e) -> c+e;
//
//
//        Stream <Integer> s1 = randomNumbers.stream();
//        Stream <Integer> s2 = s1.filter(evenNum);
//        Stream<Integer> s3 = s2.map(doubledEvenNum);
//        int sum2 = s3.reduce(0,sumNumbers);
//        System.out.println("Sum of doubled even numbers using streams: "+sum2);


//         Approach 3
//        int sum2 = randomNumbers.stream()
//                .filter(i->i%2==0)
//                .map(i->i*2)
//                .reduce(0,(c,e)->c+e);
//        System.out.println("Sum of doubled even numbers using streams: "+sum2);

        // Predicate interface - lazy behavior of streams - intermediate operation

        //filter is intermediate operation
        //map is intermediate operation
        //reduce is terminal operation
        // if you don't have terminal operation then intermediate operations will not be executed

//        Predicate<Integer> isEven = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer i) {
//                System.out.println("in predicate with value : "+i);
//                return i%2==0;
//            }
//        };
//
//        Stream<Integer> s2 = randomNumbers.stream()
//                .filter(isEven);

//        int sum2 = randomNumbers.stream()
//                .filter(isEven)
//                .map(i->i*2)
//                .reduce(0,(c,e)->c+e);
//        System.out.println("Sum of doubled even numbers using streams: "+sum2);

        // For each
//        Consumer<Integer> consume = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer number) {
//                System.out.println(number);
//            }
//        };
//        s3.forEach(consume);

//        s3.forEach(num -> System.out.println(num));
//        s3.forEach(System.out::println);


        //indentity in reduce function
//        int sum2 = randomNumbers.stream()
//                .filter(i->i%2==0)
//                .map(i->i*2)
//                .reduce(0,(c,e)->c+e);
//        System.out.println("Sum of doubled even numbers using streams: "+sum2);
//        //identity is 0 because addition with 0 will not change the sum
        // if identity is 0 then sum will be increased by 0 time the number of even numbers
//        //if identity is 1 then sum will be increased by 1 time the number of even numbers
//        //use of identity is to handle empty streams

        //comparison between sequential and parallel streams
//        long start = System.currentTimeMillis();
//        int sum3 = randomNumbers.stream()
//                .filter(i->i%2==0)
//                .map(i->i*2)
//                .reduce(0,(c,e)->c+e);
//        long end = System.currentTimeMillis();
//        System.out.println("Sum of doubled even numbers using sequential streams: "+sum3);
//        System.out.println("Time taken by sequential stream: "+(end-start)+" ms");
//        long start2 = System.currentTimeMillis();
//        int sum4 = randomNumbers.parallelStream()
//                .filter(i->i%2==0)
//                .map(i->i*2)
//                .reduce(0,(c,e)->c+e);
//        long end2 = System.currentTimeMillis();
//        System.out.println("Sum of doubled even numbers using parallel streams: "+sum4);
//        System.out.println("Time taken by parallel stream: "+(end2-start2)+" ms");
    }
}
