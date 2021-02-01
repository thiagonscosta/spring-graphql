package com.springgraphql.backend.service;

import com.springgraphql.backend.model.ListTasks;
import com.springgraphql.backend.repository.ListTasksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ListTasksService {
  
  @Autowired
  private final ListTasksRepository repository;

  public ListTasks save(String title) {
    ListTasks listTasks = new ListTasks();
    listTasks.setTitle(title);

    return repository.save(listTasks);
  }
}
