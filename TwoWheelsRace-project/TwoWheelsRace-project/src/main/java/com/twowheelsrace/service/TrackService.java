package com.twowheelsrace.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twowheelsrace.entity.Track;
import com.twowheelsrace.repository.TrackRepository;
import java.util.List;

@Service
public class TrackService {

	@Autowired
	TrackRepository trackRep;
	
//	public List <String> getTracks (){
//		return trackRep.findTracks();
//	}
}
