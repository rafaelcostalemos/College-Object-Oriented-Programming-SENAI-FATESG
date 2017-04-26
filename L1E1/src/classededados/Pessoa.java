package classededados;

public class Pessoa {
    //Atributos
    private String nome = "";
    private float peso = 0;
    private float altura = 0;
    private String sexo = "";
    
    
   //Metodos
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public float getPeso(){
        return peso;
    }
    public void setPeso(float peso)throws Exception{
        if(peso < 0)throw new Exception("Peso não pode ser NEGATIVO!");
        this.peso = peso;
    }
    
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura)throws Exception{
        if(altura < 0)throw new Exception("Altura não pode ser NEGATIVO! ");
        this.altura = altura;       
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    //Métodos
    public float calcularIMC(){
        return peso/(altura*altura);
    }
}
