package com.playdata.springbootproject.domain.Hiker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HikerRepository extends JpaRepository<Hiker, String>{

    @Query("SELECT p FROM Hiker p ORDER BY p.id DESC")
    List<Hiker> findAllDesc();
}
