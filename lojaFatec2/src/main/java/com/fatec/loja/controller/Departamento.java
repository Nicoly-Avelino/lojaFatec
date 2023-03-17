package com.fatec.loja.controller;

 interface Departamento {
    public String nomeDepto();

}

class Papelaria implements Departamento {
    @Override
    public String nomeDepto() {
        return "papelaria";
    }
}

class Livro implements Departamento {
    @Override
    public String nomeDepto() {
        return "livro";
    }
}
