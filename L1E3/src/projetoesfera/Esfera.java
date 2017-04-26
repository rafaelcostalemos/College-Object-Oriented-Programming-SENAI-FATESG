package projetoesfera;

public class Esfera {
    //Atributos
    private float raio = 0;
    
    
    //Metodos - GET=Obter 
    public float getRaio(){
        return raio;
    }   
    
    //Metodos - SET=Atribuição
    public void setRaio(float raioP){
        raio = raioP;
    }
    //Metodos de Calculo
    public double calcularArea(){
        return ((4*3.1415)*(raio*raio));
    }
    public float calcularVolume(){
        return (float)(4/3*3.1415*Math.pow(raio, 3));
    }
}