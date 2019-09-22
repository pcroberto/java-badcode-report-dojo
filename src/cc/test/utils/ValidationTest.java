package cc.test.utils;

import cc.code.model.Pessoa;
import cc.code.utils.Validation;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationTest {
    private Validation validation;

    public ValidationTest() {
        this.validation = new Validation();
    }

    @Test
    public void shouldValidateSuccessCase() {
        Pessoa p = this.buildCase();

        List<String> response = this.validation.validate(p);
        List<String> erro = new ArrayList<String>();

        assertEquals(erro, response);
    }

    @Test
    public void shouldValidateNullName() {
        Pessoa p = this.buildCase();
        p.setName(null);

        List<String> response = this.validation.validate(p);

        List<String> erro = new ArrayList<String>();
        erro.add("Erro - Nome não informado");

        assertEquals(erro, response);
    }

    @Test
    public void shouldValidateNullCpf() {
        Pessoa p = this.buildCase();
        p.setCpf(null);

        List<String> response = this.validation.validate(p);

        List<String> erro = new ArrayList<String>();
        erro.add("Erro - CPF não informado");

        assertEquals(erro, response);
    }

    @Test
    public void shouldValidateInvalidCpf() {
        Pessoa p = this.buildCase();
        p.setCpf("02579742025");

        List<String> response = this.validation.validate(p);

        List<String> erro = new ArrayList<String>();
        erro.add("Erro - CPF inválido");

        assertEquals(erro, response);
    }

    @Test
    public void shouldValidateEmptyTelefonesFixos() {
        Pessoa p = this.buildCase();
        p.setTelefonesFixos(new ArrayList<>());

        List<String> response = this.validation.validate(p);

        List<String> erro = new ArrayList<String>();
        erro.add("Erro - Telefone Fixo não informado");

        assertEquals(erro, response);
    }

    @Test
    public void shouldValidateEmptyTelefonesCelulares() {
        Pessoa p = this.buildCase();
        p.setTelefonesCelulares(new ArrayList<>());

        List<String> response = this.validation.validate(p);

        List<String> erro = new ArrayList<String>();
        erro.add("Erro - Telefone Celular não informado");

        assertEquals(erro, response);
    }

    @Test
    public void shouldValidateInvalidTelefonesFixos() {
        Pessoa p = this.buildCase();

        List<String> telefonesFixos = new ArrayList<>();
        telefonesFixos.add("123456789");
        p.setTelefonesFixos(telefonesFixos);

        List<String> response = this.validation.validate(p);

        List<String> erro = new ArrayList<String>();
        erro.add("Erro - Telefone Fixo inválido");

        assertEquals(erro, response);
    }

    @Test
    public void shouldValidateInvalidTelefonesCelulares() {
        Pessoa p = this.buildCase();

        List<String> telefonesCelulares = new ArrayList<>();
        telefonesCelulares.add("123456789");
        p.setTelefonesCelulares(telefonesCelulares);

        List<String> response = this.validation.validate(p);

        List<String> erro = new ArrayList<String>();
        erro.add("Erro - Telefone Celular inválido");

        assertEquals(erro, response);
    }

    private Pessoa buildCase() {
        Pessoa p = new Pessoa();
        p.setName("Roberto");
        p.setCpf("02579742026");
        ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
        pessoaTelefonesFixos.add("1234567895");
        p.setTelefonesCelulares(pessoaTelefonesFixos);
        p.setTelefonesFixos(pessoaTelefonesFixos);

        return p;
    }
}

