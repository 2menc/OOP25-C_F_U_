package it.unibo.impl.templates;

import java.util.Collections;
import java.util.List;

import it.unibo.api.enigmas.Enigma;

/**
 * an implementation of {@link Enigma}
 */
public class EnigmaTemplate implements Enigma{

    private final String id;
    private boolean completed;
    private boolean keyInside;

    private final String question;
    private final String correctOption;
    private final List<String> options;

    /**
     * constructor
     * @param id enigm's id
     * @param keyInside if this enigm has to return a key when completed
     * @param question the question
     * @param options the answers
     * @param correctOption the correct answer
     */
    public EnigmaTemplate(final String id, final boolean keyInside, 
        final String question, final List<String> options, final String correctOption
    ) {
        this.id = id;
        this.completed = false;
        this.keyInside = keyInside;

        if(! options.contains(correctOption)) {
            throw new IllegalArgumentException("no such option in the list");
        }
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isCompleted() {
        return this.completed;
    }

    @Override
    public boolean hasTheKey() {
        return this.keyInside;
    }

    @Override
    public String getQuestion() {
        return this.question;
    }

    @Override
    public List<String> getOptions() {
        Collections.shuffle(this.options);
        return options;
    }

    @Override
    public boolean solve(String answer) {
        if(answer.equals(this.correctOption)) {
            return true;
        }
        return false;
    }

}
