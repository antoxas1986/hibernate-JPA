package com.catalyst.SMA.Services;

import com.catalyst.SMA.models.Search;
import com.catalyst.SMA.models.User;

public interface UserService {
	
	User getUserByUserId(Integer userId);

	User createSearch(Search search);

}
