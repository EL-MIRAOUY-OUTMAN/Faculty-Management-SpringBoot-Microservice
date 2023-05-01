package com.miraouy.repository;

import com.miraouy.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NoteRepository extends JpaRepository<Note,Long> {

    Optional<Note> findByApogeeAndIdModule(Long apoogee, Long idModule);
}

