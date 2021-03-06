package com.microsoft.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = TurtleWithTypeIdContainingDot.class)
@JsonTypeName("#Favourite.Pet.TurtleWithTypeIdContainingDot")
public class TurtleWithTypeIdContainingDot extends NonEmptyAnimalWithTypeIdContainingDot {
    @JsonProperty(value = "size")
    private Integer size;

    public Integer size() {
        return this.size;
    }

    public TurtleWithTypeIdContainingDot withSize(Integer size) {
        this.size = size;
        return this;
    }
}
