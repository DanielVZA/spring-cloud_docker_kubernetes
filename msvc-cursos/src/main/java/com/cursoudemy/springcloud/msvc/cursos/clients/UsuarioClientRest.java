package com.cursoudemy.springcloud.msvc.cursos.clients;

import com.cursoudemy.springcloud.msvc.cursos.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "msvc-usuarios")
public interface UsuarioClientRest {
    @GetMapping("/{id}")
    Usuario findById(@PathVariable Long id);

    @PostMapping
    Usuario save(@RequestBody Usuario usuario);

    @GetMapping("/usuarios-por-curso")
    List<Usuario> alumnosPorCurso(@RequestParam Iterable<Long> ids);
}
