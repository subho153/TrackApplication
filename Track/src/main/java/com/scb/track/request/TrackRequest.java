package com.scb.track.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrackRequest {

    private String title;
    private Double albumName;
    private String releaseDate;
    private Long playCount;
}
