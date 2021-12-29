package com.neosoft.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.model.Expereince;

@Repository
public interface ExperinceRepo extends JpaRepository<Expereince, Long> {

}
