package com.s2daw.demo.controllers;

import com.s2daw.demo.dao.UsuarioDao;
import com.s2daw.demo.models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuario/{id}", method = RequestMethod.GET)
    public Usuario getUsuarios(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Andrés");
        usuario.setApellidos("Xandri");
        usuario.setEmail("alumno.577931@ies-azarquiel.es");
        usuario.setTelefono("673692304");
        return usuario;
    }

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuario45")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Andrés");
        usuario.setApellidos("Xandri");
        usuario.setEmail("alumno.577931@ies-azarquiel.es");
        usuario.setTelefono("673692304");
        return usuario;
    }

    @RequestMapping(value="api/eliminar/{id}",method= RequestMethod.DELETE)
    public void eliminarUsuario(@PathVariable Long id){
        usuarioDao.eliminarUsuario(id);
    }

    @RequestMapping(value = "api/usuario123")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Andrés");
        usuario.setApellidos("Xandri");
        usuario.setEmail("alumno.577931@ies-azarquiel.es");
        usuario.setTelefono("673692304");
        return usuario;
    }
}
