package pt.ul.fc;

/**
 * Cliente de {@link MaquinaLavar}. NÃO ALTERE ESTE FICHEIRO (nem sequer espaços ou comentários):
 * a nota depende das linhas exatas deste ficheiro.
 * Cada sequenciaN() usa um objeto novo e termina com uma chamada que viola o protocolo.
 */
public class Main {

    public static void main(String[] args) {
        sequencia1();
        sequencia2();
        sequencia3();
        sequencia4();
    }


    /** Sequência inválida: a última chamada viola o protocolo. */
    static void sequencia1() {
        MaquinaLavar maquinaLavar = new MaquinaLavar();
        maquinaLavar.carregar();
        maquinaLavar.terminar();
    }

    /** Sequência inválida: a última chamada viola o protocolo. */
    static void sequencia2() {
        MaquinaLavar maquinaLavar = new MaquinaLavar();
        maquinaLavar.carregar();
        maquinaLavar.descarregar();
        maquinaLavar.iniciar();
    }

    /** Sequência inválida: a última chamada viola o protocolo. */
    static void sequencia3() {
        MaquinaLavar maquinaLavar = new MaquinaLavar();
        maquinaLavar.interromper();
    }

    /** Sequência inválida: a última chamada viola o protocolo. */
    static void sequencia4() {
        MaquinaLavar maquinaLavar = new MaquinaLavar();
        maquinaLavar.descarregar();
    }
}
