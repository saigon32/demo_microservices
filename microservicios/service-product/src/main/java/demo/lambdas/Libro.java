package demo.lambdas;

public class Libro {
    String titulo;
    String categoria;
    int paginas;

    public Libro(String titulo, String categoria, int paginas) {
        this.titulo = titulo;
        this.categoria = categoria;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

}
