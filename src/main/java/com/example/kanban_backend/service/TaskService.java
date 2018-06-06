package com.example.kanban_backend.service;

import com.example.kanban_backend.domain.Task;
import com.example.kanban_backend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0 - 04.06.2018
 * @author vverbitskiy
 */

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).get();
    }

    public Task createTask(Task entity) {
        return taskRepository.save(entity);
    }

//    public Task updateTask(Long id) {
//
//    }
}