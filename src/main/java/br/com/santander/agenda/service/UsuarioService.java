package br.com.santander.agenda.service;

import br.com.santander.agenda.model.Usuario;
import br.com.santander.agenda.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario buscarPorEmail(String username) {
        return usuarioRepository.findByEmail(username)
                .orElseThrow(() -> new EntityNotFoundException("Usuário #{username} não encontrado"));
    }

    public Usuario buscarPorId(Integer id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário #{username} não encontrado"));
    }
}
