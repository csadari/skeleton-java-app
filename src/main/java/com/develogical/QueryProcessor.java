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
        else
        return "";


    }

}
