package java_for_complete_beginners.programming_core_java.serialization_saving_objects_to_files;

import java.io.Serializable;

public class Person
        implements Serializable {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

}