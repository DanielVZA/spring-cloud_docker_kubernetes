package com.cursoudemy.springcloud.msvc.usuarios.services;

import com.cursoudemy.springcloud.msvc.usuarios.models.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> findAll();

    Optional<Usuario> findById(Long id);

    Usuario save(Usuario usuario);

    void deleteById(Long id);

    Optional<Usuario> findByEmail(String email);

    boolean existByEmail(String email);

    Optional<Usuario> buscarPorEmail(String email);

    List<Usuario> findAllByIds(Iterable<Long> ids);
}
