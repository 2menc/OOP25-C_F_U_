package it.unibo.api.enigmas;

import java.util.List;

/**
 * a basic enigm
 */
public interface Enigma {

    /**
     * gets the id of this enigm
     * @return the id
     */
    int getId();

    /**
     * tells if the enigm is completed
     * @return {@code true} if is completed, {@code false} otherwise
     */
    boolean isCompleted();

    /**
     * tells if this enigm has the key
     * @return  {@code true} if contains the key, {@code false} otherwise
     */
    boolean hasTheKey();

    /**
     * gets the enigm question 
     * @return the question text
     */
    String getQuestion();

    /**
     * gets the list of the options
     * @return the list of options
     */
    List<String> getOptions();

    /**
     * tries to solve the question
     * @param answer the answer 
     * @return the result
     */
    boolean solve(String answer);
}
