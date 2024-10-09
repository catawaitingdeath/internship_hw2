package ru.liga;

@SuppressWarnings("ALL")
public class Secret {
    private final String branch1;
    private final String branch2;

    public Secret(String branch1, String branch2) {
        this.branch1 = branch1;
        this.branch2 = branch2;
    }

    public String generate() {
        return branch1Secret() + branch2Secret();
    }

    private String branch1Secret() {
        return branch1;
    }

    private String branch2Secret() {
        return branch2;
    }
}
