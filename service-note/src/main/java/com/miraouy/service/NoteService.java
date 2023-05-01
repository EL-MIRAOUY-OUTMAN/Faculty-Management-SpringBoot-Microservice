package com.miraouy.service;

import com.miraouy.Exception.Filiere.FiliereNotFound;
import com.miraouy.Exception.ModuleF.ModuleNotFound;
import com.miraouy.Exception.Note.NoteNotFound;
import com.miraouy.dto.Request.NoteRequestDto;
import com.miraouy.dto.Response.NoteResponseDto;
import com.miraouy.model.Note;

import java.util.List;

public interface NoteService {
    public NoteResponseDto addNote(NoteRequestDto note) ;
    public Note findNote(Long apogee,Long IDMODULE);
    NoteResponseDto findNoteByStudentAndModule(Long apogee, Long idModule) throws NoteNotFound;

    public List<NoteResponseDto> findNotesEtudiant(Long idStudent);
    public List<NoteResponseDto> findNoteFiliereAndModule(Long idFiliere,Long idModule) throws FiliereNotFound, ModuleNotFound;
    public NoteResponseDto deleteNote(Long apogee,Long idModule) throws NoteNotFound;
    public NoteResponseDto updaeNote(Long apogee,Long idModule) throws NoteNotFound;

}
