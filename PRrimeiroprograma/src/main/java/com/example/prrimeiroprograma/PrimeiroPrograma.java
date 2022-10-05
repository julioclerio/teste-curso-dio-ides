package com.example.prrimeiroprograma;

import com.example.prrimeiroprograma.model.gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        gato gato = new gato();
        System.out.println(gato);

        livro livro1 = new Livro (nome: "O problema dos 3 corpos". numPaginas 300);
        System.out.println(livro);





    }
    class Livro {
        private String name;
        private Integer numPaginas;

        @Override
        public String toString() {
            return "Livro{" +
                    "name='" + name + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        public Livro(String name, Integer numPaginas) {
            this.name = name;

            this.numPaginas = numPaginas;
        }
    }
}
