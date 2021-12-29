package com.neosoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.model.Topics;
@Repository
public interface TopicsRepo extends JpaRepository<Topics, Long> {

}
