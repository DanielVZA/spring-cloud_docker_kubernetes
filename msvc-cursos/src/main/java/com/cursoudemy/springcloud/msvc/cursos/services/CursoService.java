package com.cursoudemy.springcloud.msvc.cursos.services;

import com.cursoudemy.springcloud.msvc.cursos.models.Usuario;
import com.cursoudemy.springcloud.msvc.cursos.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> findAll();

    Optional<Curso> findById(Long id);

    Optional<Curso> findByIdWithUsers(Long id);

    Curso save(Curso curso);

    void deleteById(Long id);

    void elminarCursoUsuarioPorId(Long id);

    Optional<Usuario> asignarUsuario(Usuario usuario, Long cursoId);

    Optional<Usuario> crearUsuario(Usuario usuario, Long cursoId);

    Optional<Usuario> quitarUsuario(Usuario usuario, Long cursoId);
}
