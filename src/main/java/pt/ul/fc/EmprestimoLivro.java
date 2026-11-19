package pt.ul.fc;

import liquidjava.specification.StateRefinement;
import liquidjava.specification.StateSet;

/** Emprestar um livro da biblioteca. */
@StateSet({"disponivel", "requisitado", "atrasado", "perdido"})
public class EmprestimoLivro {

    @StateRefinement(to="disponivel()")
    public EmprestimoLivro() {}

    /** Marca o empréstimo como atrasado. */
    @StateRefinement(from="requisitado(this)", to="atrasado(this)")
    public void marcarAtraso() {}

    /** Requisita o livro. */
    @StateRefinement(from="disponivel(this)", to="requisitado(this)")
    public void requisitar() {}

    /** Renova o empréstimo (o livro continua requisitado). */
    @StateRefinement(from="requisitado(this)", to="requisitado(this)")
    public void renovar() {}

    /** Devolve o livro à biblioteca. */
    @StateRefinement(from="requisitado(this)|| atrasado(this)", to="disponivel(this)")
    public void devolver() {}

    /** Dá o livro como perdido (definitivo). */
    @StateRefinement(from="atrasado(this)", to="perdido(this)")
    public void declararPerdido() {}
}
