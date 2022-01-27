package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Book bookNumberOne = new Book("First book",
                new Author("Name", "Surname"), 2017);
        System.out.println("bookNumberOne.titleOfBook = " + bookNumberOne.getTitleOfBook());
        System.out.println("bookNumberOne.nameOfAuthor = "
                + bookNumberOne.getAuthor().getNameOfAuthor() + " "
                + bookNumberOne.getAuthor().getSurnameOfAuthor());
        System.out.println("bookNumberOne.yearOfPublication = " + bookNumberOne.getYearOfPublication());
        bookNumberOne.setYearOfPublication(2020);
        System.out.println("bookNumberOne.getYearOfPublication() = " + bookNumberOne.getYearOfPublication());
       // Book bookNumberTwo = new Book("Book Number Two", "Someone Number Two", 2017);

    }
}
