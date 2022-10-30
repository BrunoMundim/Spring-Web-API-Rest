package dio.mundim.web.api.controller;

import dio.mundim.web.api.model.Usuario;
import dio.mundim.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping()
    public List<Usuario> getUsers(){
        return repository.findAll();
    }
    @GetMapping("/{login}")
    public Usuario getUser(@PathVariable("login") String login){
        return repository.findByLogin(login);
    }
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
