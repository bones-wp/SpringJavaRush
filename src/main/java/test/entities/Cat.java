package test.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name = "Муся";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
