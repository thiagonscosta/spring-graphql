package com.springgraphql.backend.repository;

import com.springgraphql.backend.model.ListTasks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListTasksRepository extends JpaRepository<ListTasks, Long> {
    
}
