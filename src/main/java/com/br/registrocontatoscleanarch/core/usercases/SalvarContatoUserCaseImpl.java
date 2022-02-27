package com.br.registrocontatoscleanarch.core.usercases;

import com.br.registrocontatoscleanarch.core.adapters.ContatoDbGateway;
import com.br.registrocontatoscleanarch.core.models.Contato;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SalvarContatoUserCaseImpl implements SalvarContatoUserCase {

    private final ContatoDbGateway contatoDbGateway;

    public SalvarContatoUserCaseImpl(ContatoDbGateway contatoDbGateway) {
        this.contatoDbGateway = contatoDbGateway;
    }

    @Override
    public void salvar(Contato contato) {
        verificaSeEmailValido(contato.getEmail());
        verificaSeTelefoneValido(contato.getTelefone());
        contatoDbGateway.salvar(contato);
    }

    private void verificaSeEmailValido(String email) {
        if (email != null && !email.isEmpty() && !email.contains("@")) {
            log.error("E-mail {} não é valido", email);
        }
    }

    private void verificaSeTelefoneValido(String telefone) {
        if (telefone != null && telefone.length() < 10) {
            log.error("Telefone {} não é valido. Deve conter DDD + 8 números", telefone);
        }
    }

}
