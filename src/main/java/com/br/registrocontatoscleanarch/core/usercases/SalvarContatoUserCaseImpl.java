package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.core.exceptions.AtributoInvalidoException;
import com.br.registrocontatoscleanarch.core.ports.ContatoRepository;
import com.br.registrocontatoscleanarch.core.domain.Contato;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SalvarContatoUserCaseImpl implements SalvarContatoUserCase {

    private final ContatoRepository contatoRepository;

    public SalvarContatoUserCaseImpl(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Override
    public void salvar(Contato contato) {
        log.info("Salvando um novo contato {}", contato);
        verificaSeEmailValido(contato.getEmail());
        verificaSeTelefoneValido(contato.getTelefone());
        contatoRepository.salvar(contato);
    }

    private void verificaSeEmailValido(String email) {
        if (email != null && !email.isEmpty() && !email.contains("@")) {
            log.error("E-mail {} não é valido", email);
            throw new AtributoInvalidoException("E-mail não valido");
        }
    }

    private void verificaSeTelefoneValido(String telefone) {
        if (telefone != null && !telefone.isEmpty() && telefone.length() != 8) {
            log.error("Telefone {} não é valido. Deve conter 8 números", telefone);
            throw new AtributoInvalidoException("Telefone não é valido. Deve conter DDD + 8 números");
        }
    }

}
