package com.twowheelsrace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.twowheelsrace.entity.Track;

@Repository
public interface TrackRepository extends CrudRepository<Track, Integer>{
	
	@Query(nativeQuery=true, value = "SELECT t.emri FROM track t")
	public List<Track> findTracks ();
	
	@Query(nativeQuery=true, value = "SELECT * FROM track t WHERE t.emri = :name")
	public List<Track> findId (@Param ("name") String name);
	
	public List<Track> findTrackByName(String name);
	
}
