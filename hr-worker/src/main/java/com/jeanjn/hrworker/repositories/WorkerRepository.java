package com.jeanjn.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeanjn.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
