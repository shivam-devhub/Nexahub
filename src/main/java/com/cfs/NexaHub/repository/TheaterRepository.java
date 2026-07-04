package com.cfs.NexaHub.repository;



import com.cfs.NexaHub.entity.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TheaterRepository extends JpaRepository<Theater,Long> {

    List<Theater> findByCityId(Long cityId);
}