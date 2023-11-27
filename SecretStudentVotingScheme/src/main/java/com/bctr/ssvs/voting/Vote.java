package com.bctr.ssvs.voting;

/**
 * Represents a vote in the voting system.
 */
public class Vote {
    private String value;

    /**
     * Constructs a Vote with the specified value.
     * @param value The value of the vote.
     */
    public Vote(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the vote.
     * @return The value of the vote.
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the vote.
     * @param value The value to set.
     */
    public void setValue(String value) {
        this.value = value;
    }
}
