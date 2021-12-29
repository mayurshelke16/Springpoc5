package com.neosoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.model.Subtopic;
@Repository
public interface SubtopicsRepo extends JpaRepository<Subtopic, Long> {

}
