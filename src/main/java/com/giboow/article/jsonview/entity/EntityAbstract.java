package com.giboow.article.jsonview.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.giboow.article.jsonview.jackson.JsonViews;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@SuperBuilder
@NoArgsConstructor
public abstract class EntityAbstract {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @JsonView(JsonViews.Update.class)
    private Integer id;

    @CreatedDate
    @Column(nullable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss'Z'", timezone="UTC")
    @JsonView(JsonViews.Admin.class)
    LocalDateTime createdAt = LocalDateTime.now();

    @LastModifiedDate
    @Column(nullable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd'T'HH:mm:ss'Z'", timezone="UTC")
    @JsonView(JsonViews.Admin.class)
    LocalDateTime updatedAt = LocalDateTime.now();

}
