package com.cursoudemy.springcloud.msvc.usuarios.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "msvc-cursos")
public interface CursoClientRest {

    @DeleteMapping("/eliminar-usuario/{id}")
    void eliminarCursoUsuario(@PathVariable Long id);
}
