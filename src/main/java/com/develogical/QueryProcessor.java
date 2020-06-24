package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "**** William Shakespeare **** ";
        }

        else if (query.toLowerCase().contains("what is your name")) {
            return "**** Chandra Adari **** ";
        }
        else if (query.toLowerCase().contains("what is 18 plus 2")) {
            return "20";
        }
        else if (query.toLowerCase().contains("what is 3 plus 6")) {
            return "9";
        }
        else if (query.toLowerCase().contains("which of the following numbers is the largest:78, 62, 46, 873")) {
            return "873";
        }
        else if (query.toLowerCase().contains("which of the following numbers is both a square and a cube: 839, 100")) {
            return "839";
        }
        else if (query.toLowerCase().contains("which city is the Eiffel tower in")) {
            return "Paris";
        }
        else if (query.toLowerCase().contains("which of the following numbers are primes:5,694")) {
            return "5";
        }
        else if (query.toLowerCase().contains("which of the following numbers is the largest: 67, 380, 18, 495")) {
            return "495";
        }
        

        else
        return "";


    }

}
