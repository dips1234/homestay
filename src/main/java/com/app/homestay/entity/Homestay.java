package com.app.homestay.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "homestay")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Homestay {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer homestayId;
    private String homeStayName;
    private Long phoneNumber;
    @ManyToOne
    @JoinColumn(name="owner_id")
    @JsonBackReference(value="hs-ref")
    private Owner ownerDetails;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id",referencedColumnName = "locationId")
    private Location location;


}
