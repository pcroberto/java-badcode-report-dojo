package cc.test.utils;

import cc.code.utils.FormatterPessoa;
import cc.code.model.Pessoa;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class FormatterPessoaTest {
    private FormatterPessoa formatter = new FormatterPessoa();

    @Test
    public void shouldReturnFomattedNames() {
        Pessoa p = new Pessoa();
        p.setName("Roberto");
        p.setCpf("02579742026");

        ArrayList<String> pessoaTelefonesCelulares = new ArrayList<String>();
        pessoaTelefonesCelulares.add("5199668550");
        p.setTelefonesCelulares(pessoaTelefonesCelulares);

        ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
        pessoaTelefonesFixos.add("5134031195");
        p.setTelefonesFixos(pessoaTelefonesFixos);

        String expected = "Nome: Roberto\nFone: 5199668550\nFone: 5134031195\nCPF: 02579742026";
        assertEquals(expected, this.formatter.format(p));
    }
}