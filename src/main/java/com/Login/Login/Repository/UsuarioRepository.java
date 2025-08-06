package com.Login.Login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Login.Login.Usuario.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    public Usuario findByEmail(String email);
    public Usuario findByUsername(String username);

    public boolean existsByEmail(String email);
    public boolean existsByUsername (String username);

}
