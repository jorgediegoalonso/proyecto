package com.example;

import java.util.Set;
import lombok.Builder;
import lombok.Singular;
import lombok.ToString;


@Builder(buildMethodName = "execute")
@ToString
public class ejemploBuilderLombok {

    @Builder.Default
    private long creado=System.currentTimeMillis();
    private String nombre;
    private int edad;
    @Singular
    private Set<String> ocupacions;

}