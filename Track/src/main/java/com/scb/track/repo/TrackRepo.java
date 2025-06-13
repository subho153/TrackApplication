package com.scb.track.repo;

import com.scb.track.éntities.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TrackRepo extends JpaRepository<Track, Long> {

    @Query(value = "select * from track t where t.title = :title", nativeQuery = true)
    Optional<Track> trackByName(String title);
}
