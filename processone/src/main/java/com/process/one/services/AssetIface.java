package com.process.one.services;

import java.util.Optional;

import com.process.one.model.FTTIssueBase;

public interface AssetIface   {
	public Optional<FTTIssueBase> findById(String id);

}
