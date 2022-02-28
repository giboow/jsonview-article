package com.giboow.article.jsonview.entity;

import com.fasterxml.jackson.annotation.JsonView;
import com.giboow.article.jsonview.jackson.JsonViews;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Vehicle extends EntityAbstract {


    @NotEmpty
    @Column(nullable = false)
    @JsonView(JsonViews.Create.class)
    String registrationPlate;

    @NotEmpty
    @Column(nullable = false)
    @JsonView(JsonViews.Create.class)
    String model;

    @NotEmpty
    @Column(nullable = false)
    @JsonView(JsonViews.Create.class)
    String brand;

    @NotEmpty
    @Column(nullable = false)
    @JsonView(JsonViews.Create.class)
    String serialNumber;
}
