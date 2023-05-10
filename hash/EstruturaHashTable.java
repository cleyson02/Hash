public class EstruturaHashTable implements EstruturaDeDados{

    private Integer tabela[];

    public EstruturaHashTable() {
        tabela = new Integer[1000];
    }

    @Override
    public boolean insert(int chave) {
        int posicao = chave % 1000; // calcula a posição na tabela usando o resto da divisão
        if (tabela[posicao] == null) { // verifica se a posição está vazia
            tabela[posicao] = chave; // insere a chave na posição calculada
            return true;
        }
        return false;
        
    }

    @Override
    public boolean delete(int chave) {
        int posicao = chave % 1000; // calcula a posição na tabela usando o resto da divisão
        if (tabela[posicao] != null && tabela[posicao] == chave) { // verifica se a posição não está vazia e contém a chave
            tabela[posicao] = null; // remove a chave da posição calculada
            return true;
        }
        return false;
        
    }

    @Override
    public boolean search(int chave) {
        int posicao = chave % 1000; // calcula a posição na tabela usando o resto da divisão
        if (tabela[posicao] != null && tabela[posicao] == chave) { // verifica se a posição não está vazia e contém a chave
            return true;
        }
        return false;
    }
    
}
