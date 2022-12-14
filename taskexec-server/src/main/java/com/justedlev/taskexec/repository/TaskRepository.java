package com.justedlev.taskexec.repository;

import com.justedlev.taskexec.repository.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<Task, UUID> {
    List<Task> findByTaskNameIn(Collection<String> taskName);
}
