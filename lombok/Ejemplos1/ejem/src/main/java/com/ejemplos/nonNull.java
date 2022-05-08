package com.ejemplos;

import lombok.NonNull;

public class nonNull {
    private static float age = 0;

    public static void main(String[] args) {
        System.out.println("Java:");
        System.out.println("Age: " + age);

        try {
            setAge(null);
        } catch (NullPointerException e) {
            System.out.println("Exception setting the ages Java");
        }

        setAge(25F);
        System.out.println("Age: " + age);

        setAge(0F);
        System.out.println("\n");
        System.out.println("Lombok:");
        System.out.println("Age: " + age);

        try {
            setAgeLombok(null);
        } catch (NullPointerException e) {
            System.out.println("Exception setting the ages Lombok");
        }
        setAgeLombok(25F);
        System.out.println("Age: " + age);
    }

    public static void setAge(Float value) {
        if (value == null) {
            throw new NullPointerException();
        }
        age=value;
    }

    public static void setAgeLombok(@NonNull Float value) {
        age=value;
    }


}
