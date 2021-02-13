package com.lahiru.training.lendingservice.repository;

import com.lahiru.training.librarycloud.commons.model.lend.Lend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LendRepository extends JpaRepository<Lend, Integer> {

}
