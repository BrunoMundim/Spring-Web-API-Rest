package dio.mundim.web.api.repository;

import dio.mundim.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId() == null)
            System.out.println("SAVE - Recebendo usuário na camada do repositório!");
        else
            System.out.println("UPDATE - Recebendo usuário na camada do repositório!");
        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("bruno", "password"));
        usuarios.add(new Usuario("jane", "masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("bruno", "password");
    }
    public Usuario findByLogin(String login){
        System.out.println(String.format("FIND/login - Recebendo o id: %s para localizar um usuário", login));
        return new Usuario("bruno", "password");
    }
}
