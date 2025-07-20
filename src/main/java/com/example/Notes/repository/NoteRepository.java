package com.example.Notes.repository;

import com.example.Notes.model.Note;
import com.example.Notes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note,Long> {
    List<Note> findByUser(User user);
}
