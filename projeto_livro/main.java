package com.mycompany.projetolivro;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Nai", 28, "F");
        p[1] = new Pessoa("Iara", 22, "F");
        l[0] = new Livro("Ondas Binaurais", "Sei lá", 100, p[1]);
        
        l[0].detalhes();
        System.out.println(l[0].detalhes());
    }
    
}