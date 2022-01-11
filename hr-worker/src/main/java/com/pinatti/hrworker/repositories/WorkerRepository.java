package com.pinatti.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinatti.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
