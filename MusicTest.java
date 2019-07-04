package com.lti.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.lti.Dao.AccountDao;
import com.lti.Dao.GenericDao;
import com.lti.Dao.MusicDao;
import com.lti.entity.Account;
import com.lti.entity.Album;
import com.lti.entity.Customer;
import com.lti.entity.Order;
import com.lti.entity.Song;
import com.lti.service.MusicService;

public class MusicTest {


		
		@Test
		public void albumInsert() {
			MusicService musServ=new MusicService();
			Album a=new Album();
			a.setCopyright("MtvUnplugged");
			a.setName("xyz");
			a.setYear(2016);
			musServ.Insert(a);
			
			
		}
		
		@Test
		public void songInsert() {
			MusicService musServ=new MusicService();
			MusicDao dao=new MusicDao();
			Album alb= (Album)dao.fetchById(Album.class,185);
			Song a=new Song();
			a.setDuration(200);
			a.setSinger("Ed sheeran");
			a.setTitle("Perfect");
			a.setAlbum(alb);
			musServ.Insert(a);
			
			
		}
		
		public void testFetchSongs() {
			
			/*MusicDao dao=new MusicDao();
			List<Song> songs= dao.fetchSongByDur(240);*/
			MusicService service = new MusicService();
			List<Song>songs = service.fetchSongsByDuration(240);
			for(Song a : songs) {
				System.out.println(a.getId());
				System.out.println(a.getDuration());
				System.out.println(a.getTitle());
				System.out.println(a.getSinger());
			
		}
		}
	}


