package com.scb.track.service;

import com.scb.track.repo.TrackRepo;
import com.scb.track.request.TrackRequest;
import com.scb.track.éntities.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServicrImpl implements TrackService{

    @Autowired
    private TrackRepo trackRepository;

    @Override
    public Track createTrack(TrackRequest trackRequest) {
        Track track = new Track();
        track.setAlbumName(trackRequest.getAlbumName());
        track.setTitle(trackRequest.getTitle());
        track.setPlayCount(trackRequest.getPlayCount());
        track.setReleaseDate(track.getReleaseDate());

        Track track1 = trackRepository.save(track);
        return track1;
    }

    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }

    @Override
    public void deleteTrack(Long trackId) {
        Optional<Track> track = trackRepository.findById(trackId);
        trackRepository.deleteById(track.get().getId());
    }

    @Override
    public Track getTrackByTitle(String title) {
        Optional<Track> track = trackRepository.trackByName(title);
        return track.get();
    }
}
