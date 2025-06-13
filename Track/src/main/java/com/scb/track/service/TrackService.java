package com.scb.track.service;

import com.scb.track.request.TrackRequest;
import com.scb.track.éntities.Track;

import java.util.List;

public interface TrackService {

    Track createTrack(TrackRequest trackRequest);
    List<Track> getAllTracks();
    void deleteTrack(Long trackId);
    Track getTrackByTitle(String title);
}
