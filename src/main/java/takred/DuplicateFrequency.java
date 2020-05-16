package main.java.takred;

public class DuplicateFrequency {
    private final Person object;
    private final int frequency;

    public DuplicateFrequency(Person object, int frequency) {
        this.object = object;
        this.frequency = frequency;
    }

    public Person getObject() {
        return object;
    }

    public int getFrequency() {
        return frequency;
    }

    public DuplicateFrequency setFrequency(int frequency) {
        return new DuplicateFrequency(object, frequency);
    }
}
