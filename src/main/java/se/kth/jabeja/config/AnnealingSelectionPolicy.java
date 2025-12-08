package se.kth.jabeja.config;

/**
 * Select the simulated annealing policy (linear, exponential, improved exponential, adaptive relative).
 */
public enum AnnealingSelectionPolicy {
    LINEAR("LINEAR"),
    EXPONENTIAL("EXPONENTIAL"),
    IMPROVED_EXP("IMPROVED_EXP"),
    ADAPTIVE_RELATIVE("ADAPTIVE_RELATIVE");

    String name;

    AnnealingSelectionPolicy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}