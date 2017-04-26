package classededados;

public class Retângulo {
    //Atributos
    private float comprimento = 0;
    private float largura = 0;
    
    public float getComprimento(){
        return comprimento;
    }
    public void setComprimento(float comprimento)throws Exception{
        if(comprimento < 0)throw new Exception("Comprimento não pode ter valor negativo.");
        this.comprimento = comprimento;
    }
    
    public float getLargura(){
        return largura;
    }
    public void setLargura(float largura)throws Exception{
        if(largura < 0)throw new Exception("Largura não pode ter valor negativo.");
        this.largura = largura;
    }
    
    //Método Calcular
    public float calcularArea(){
        return largura * comprimento;
    }
    public float calcularPerimetro(){
        return (comprimento*2)+(largura*2);
      //return (2 * (comprimento + largura));
    }
}