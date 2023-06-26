package com.process.one.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.process.one.model.FTTIssueBase;

@Repository
public interface FTTIssueBaseRepository extends JpaRepository<FTTIssueBase,String> {

}
