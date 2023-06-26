package com.process.one.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.process.one.model.FTTIssueBase;
import com.process.one.repositories.FTTIssueBaseRepository;
import com.process.one.services.AssetIface;
@Service
public class AssetImpl implements AssetIface{
	@Autowired
	FTTIssueBaseRepository repo;
	
	@Override
	public Optional<FTTIssueBase> findById(String id) {

		return repo.findById(id);
	}

}
