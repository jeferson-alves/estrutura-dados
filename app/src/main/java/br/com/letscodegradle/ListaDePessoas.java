package br.com.letscodegradle;

public class ListaDePessoas implements EstruturaDados {

    private Pessoa[] pessoas = new Pessoa[10];
    private int index = 0;

    @Override
    public void adicionar(Pessoa pessoa) {
        this.pessoas[index] = pessoa;
        this.index++;
    }

    @Override
    public Pessoa buscar(String nome) {
        for (int i=0; i < this.index; i++) {
            if (nome.equals(this.pessoas[i].getNome())) {
                return pessoas[i];
            }
        }
        try {
            throw new Exception("Pessoa não encontrada");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
//        return throw new Exception("Pessoa não encontrada");
    }

    @Override
    public void remover(Pessoa pessoa) {
        for (int i=0; i < this.index; i++) {
            if ( pessoa ==  this.pessoas[i]) {
                this.pessoas[i] = null;
            }
        }
    }

    @Override
    public void remover(int index) {
        this.pessoas[index] = null;
    }

    @Override
    public void listarTodos() {
        for (int i=0; i < this.index; i++) {
            System.out.println(this.pessoas[i]);
        }
    }

    @Override
    public Pessoa getPessoa(int index) {
        if (this.pessoas == null || index < 0 || index >= this.pessoas.length) {
            try {
                throw new Exception("Fora de index");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
        return this.pessoas[index];
    }
}
