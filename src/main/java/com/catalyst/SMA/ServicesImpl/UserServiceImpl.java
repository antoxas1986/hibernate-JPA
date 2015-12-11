package com.catalyst.SMA.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catalyst.SMA.Repository.SearchRepository;
import com.catalyst.SMA.Repository.SocialMediaRepository;
import com.catalyst.SMA.Repository.UserRepository;
import com.catalyst.SMA.Services.UserService;
import com.catalyst.SMA.models.Search;
import com.catalyst.SMA.models.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private SearchRepository searchRepo;
	@Autowired
	private SocialMediaRepository socialmMediaRepo;
	

	@Override
	public User getUserByUserId(Integer userId) {
		return userRepo.getUserByUserId(userId);
	}

	@Override
	public User createSearch(Search search) {
		searchRepo.save(search);
		
		search.getSocialMedia().setSearchId(search.getSearchId());
		
		socialmMediaRepo.save(search.getSocialMedia());	
		return null;
	}

}
