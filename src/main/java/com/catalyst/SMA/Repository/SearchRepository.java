package com.catalyst.SMA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catalyst.SMA.models.Search;

public interface SearchRepository extends JpaRepository<Search, Long> {
	
	Search getSearchBySearchId(Integer searchId);
	
	
}
