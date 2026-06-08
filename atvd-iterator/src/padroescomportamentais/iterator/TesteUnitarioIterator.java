package padroescomportamentais.iterator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteUnitarioIterator {

    @Test
    public void testContarLivrosDisponiveis() {
        Livro livro1 = new Livro("1984", true);
        Livro livro2 = new Livro("Dom Casmurro", false);
        Livro livro3 = new Livro("O Cortico", true);
        Biblioteca bib = new Biblioteca(livro1, livro2, livro3);
        assertEquals(2, Catalogacao.contarLivrosDisponiveis(bib));
    }

    @Test
    public void testContarTotalLivros() {
        Livro livro1 = new Livro("Memórias Póstumas de Brás Cubas", true);
        Livro livro2 = new Livro("Grande Sertão Veredas", false);
        Livro livro3 = new Livro("Capitães da Areia", true);
        Biblioteca bib = new Biblioteca(livro1, livro2, livro3);
        assertEquals(3, Catalogacao.contarTotalLivros(bib));
    }

    @Test
    public void testTodosLivrosDisponiveis() {
        Livro livro1 = new Livro("Quincas Borba", true);
        Livro livro2 = new Livro("Macunaima", true);
        Biblioteca bib = new Biblioteca(livro1, livro2);
        assertEquals(2, Catalogacao.contarLivrosDisponiveis(bib));
    }

    @Test
    public void testNenhumLivroDisponivel() {
        Livro livro1 = new Livro("Vidas Secas", false);
        Livro livro2 = new Livro("Sagarana", false);
        Biblioteca bib = new Biblioteca(livro1, livro2);
        assertEquals(0, Catalogacao.contarLivrosDisponiveis(bib));
    }

    @Test
    public void testIterarBiblioteca() {
        Livro livro1 = new Livro("Gabriela Cravo e Canela", true);
        Livro livro2 = new Livro("Jubiaba", false);
        Biblioteca bib = new Biblioteca(livro1, livro2);
        int contador = 0;
        for (Livro livro : bib) {
            contador++;
        }
        assertEquals(2, contador);
    }
}