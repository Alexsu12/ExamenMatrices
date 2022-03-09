package ejercicio1;

public enum CategoriaEmpleado {
        INICIAL("Categoria Básica", 50),
        MEDIA("Categoria Media", 70),
        AVANZADA("Categoria Profesional", 100);
        private String categoria;
        private int complementoEuros;

        CategoriaEmpleado(String categoria, int complementoEuros) {
              this.categoria = categoria;
              this.complementoEuros = complementoEuros;
        }

        public String getCategoria() {
                return categoria;
        }

        public void setCategoria(String categoria) {
                this.categoria = categoria;
        }

        public int getComplementoEuros() {
                return complementoEuros;
        }

        public void setComplementoEuros(int complementoEuros) {
                this.complementoEuros = complementoEuros;
        }
}
