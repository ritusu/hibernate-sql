package com.lti.service;

import java.util.List;

import com.lti.Dao.MusicDao;
import com.lti.entity.Album;
import com.lti.entity.Song;

public class MusicService {

	
	public void Insert(Object obj) {
		MusicDao dao=new MusicDao();
		dao.save(obj);
		
	}
	
	public List<Song> fetchSongsByDuration(int dur){
		MusicDao dao=new MusicDao();
		List<Song> songs= dao.fetchSongByDur(dur);
		return songs;
	}
	
	
}
