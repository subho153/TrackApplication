package com.scb.track.controller;

import com.scb.track.request.TrackRequest;
import com.scb.track.service.TrackService;
import com.scb.track.éntities.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("music/platform/v1/tracks")
public class TrackController {

    @Autowired
    private TrackService trackService;

    @PostMapping()
    public ResponseEntity<Track> createTrack(@RequestBody TrackRequest trackRequest){
        Track track = trackService.createTrack(trackRequest);
        return new ResponseEntity<Track>(track, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Track>> getAlltracks(){
        List<Track> tracks = trackService.getAllTracks();
        return new ResponseEntity<List<Track>>(tracks,HttpStatus.OK);
    }

    @DeleteMapping("/{trackId}")
    public ResponseEntity<Void> deleteTrack(@PathVariable Long trackId){
        trackService.deleteTrack(trackId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/search")
    public ResponseEntity<Track> getTrackByTitle(@RequestParam String title){
        Track track = trackService.getTrackByTitle(title);
        return new ResponseEntity<Track>(track,HttpStatus.OK);
    }
}
