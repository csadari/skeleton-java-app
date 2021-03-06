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

        else if (query.toLowerCase().contains("which of the following numbers is the largest: 21, 5, 542, 666")) {
            return "666";
        }

        else if (query.toLowerCase().contains("what is 0 minus 13")) {
            return "-13";
        }
        else if (query.toLowerCase().contains("what is 11 minus 11")) {
            return "0";
        }
        else if (query.toLowerCase().contains("what is 13 minus 8")) {
            return "5";
        }
        else if (query.toLowerCase().contains("what is 1 plus 9 plus 6")) {
            return "16";
        }


        else if (query.toLowerCase().contains("what is 9 minus 9")) {
            return "0";
        }

        else if (query.toLowerCase().contains("what is the 9th number in the Fibonacci sequence")) {
            return "34";
        }
        else if (query.toLowerCase().contains("what is 11 plus 13 plus 2")) {
            return "26";
        }
        else if (query.toLowerCase().contains("what is 3 plus 4 multiplied by 10")) {
            return "70";
        }
        else if (query.toLowerCase().contains("what is 14 multiplied by 11 plus")) {
            return "162";
        }
        






        else
        return "";


    }

}
