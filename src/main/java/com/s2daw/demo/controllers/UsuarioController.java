package com.s2daw.demo.controllers;

import com.s2daw.demo.models.Usuario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Andrés");
        usuario.setApellidos("Xandri");
        usuario.setEmail("alumno.577931@ies-azarquiel.es");
        usuario.setTelefono("673692304");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Andrés");
        usuario.setApellidos("Xandri");
        usuario.setEmail("alumno.577931@ies-azarquiel.es");
        usuario.setTelefono("673692304");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Pepe");
        usuario2.setApellidos("Cépedes");
        usuario2.setEmail("alumno.182736@ies-azarquiel.es");
        usuario2.setTelefono("689674835");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Marina");
        usuario3.setApellidos("Landia");
        usuario3.setEmail("alumno.537465@ies-azarquiel.es");
        usuario3.setTelefono("753847210");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value = "usuario45")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Andrés");
        usuario.setApellidos("Xandri");
        usuario.setEmail("alumno.577931@ies-azarquiel.es");
        usuario.setTelefono("673692304");
        return usuario;
    }

    @RequestMapping(value = "usuario343")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Andrés");
        usuario.setApellidos("Xandri");
        usuario.setEmail("alumno.577931@ies-azarquiel.es");
        usuario.setTelefono("673692304");
        return usuario;
    }

    @RequestMapping(value = "usuario123")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Andrés");
        usuario.setApellidos("Xandri");
        usuario.setEmail("alumno.577931@ies-azarquiel.es");
        usuario.setTelefono("673692304");
        return usuario;
    }
}
