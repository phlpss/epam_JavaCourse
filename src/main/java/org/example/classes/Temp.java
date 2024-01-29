package org.example.classes;

import java.util.Objects;

class Temp {
    int intVal;
    String stringVal;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temp temp = (Temp) o;
        return intVal == temp.intVal && Objects.equals(stringVal, temp.stringVal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intVal, stringVal);
    }
}