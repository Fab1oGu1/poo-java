package com.mycompany.projetolivro;
public interface Publicacao {
    public void abrir();
    public void fechar();
    public void folhear(int p); // folhear até a pág p.
    public void avancarPag();
    public void voltarPag();
}