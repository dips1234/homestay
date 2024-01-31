package com.app.homestay.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="owner")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private Long contactNo;
    @OneToMany(mappedBy = "ownerDetails",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonManagedReference(value="hs-ref")
    private List<Homestay> homestays;

}
