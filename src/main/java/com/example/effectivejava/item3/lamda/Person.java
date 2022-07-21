package com.example.effectivejava.item3.lamda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Person {
    LocalDate birthday;

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

//Comparator<T>호환이 가능함. 인자가 2개지만 this로 자기 자신을 비교
//    public static int compareByAge(Person b) {
//        return this.birthday.compareTo(b.birthday);
//    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2011, 3, 2)));
        people.add(new Person(LocalDate.of(2013, 1, 28)));
        //익명 내부클래스
//        people.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person a, Person b) {
//                return a.birthday.compareTo(b.birthday);
//            }
//        });
        //람다 익스프레션
//        people.sort((p1,p2) -> p1.birthday.compareTo(p2.birthday));
        //메서드 참조(메서드로 간략하게 나타낼 수 있다)
        //static이 아니라면 인스턴스 메서드로 접근해야한다.
//        Person person = new Person(null);
//        people.sort(person::compareByAge);
        people.sort(Person::compareByAge);

        //생성자 참조
        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1982,7,15));
        dates.add(LocalDate.of(1982,7,15));
        dates.add(LocalDate.of(1982,7,15));

        //Date들로 인스턴스 생성.
        dates.stream().map(Person::new).collect(Collectors.toList());

        //그럼 생성자가 2개 일 경우 어떻게 선택해서 참조할까? 아래의 함수형 인터페이스를 활용해서 인풋과 아웃풋을 정해준다.
//        Supplier<Person> personSupplier = Person::new;
//        Function<LocalDate,Person> personFunction = Person::new;

        //함수형 인터페이스(Function<>, Predicate<>, Supplier<>, Consumer<>)등등 인터페이스 내부에 메서드 선언을 하나만 가져야하는 인터페이스.
        //@FunctionalInterface 표시
    }

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Person() {
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }
}
