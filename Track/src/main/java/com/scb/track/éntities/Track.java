package com.scb.track.éntities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "track")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Track {

    @Id
    @Column(name = "id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double albumName;
    private String releaseDate;
    private Long playCount;
}
