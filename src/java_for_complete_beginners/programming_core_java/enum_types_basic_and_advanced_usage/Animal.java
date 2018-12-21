package java_for_complete_beginners.programming_core_java.enum_types_basic_and_advanced_usage;

public enum Animal {

    CAT("Garfield"), DOG("Dogbert"), MOUSE("Mickey");

    String name;

    Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "This Animal is called " + name;
    }

}
