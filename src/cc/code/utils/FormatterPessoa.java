package cc.code.utils;

import cc.code.model.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class FormatterPessoa {
    public String format(Pessoa pessoa) {
        List<String> result = new ArrayList<>();
        result.add("Nome: " + pessoa.getName());

        for (String fone : pessoa.getTelefonesCelulares()) {
            result.add("Fone: " + fone);
        }

        for (String fone : pessoa.getTelefonesFixos()) {
            result.add("Fone: " + fone);
        }

        result.add("CPF: " + pessoa.getCpf());

        return String.join("\n", result);
    }
}
