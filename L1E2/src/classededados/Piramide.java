package classededados;

public class Piramide {
    //Atributos
    private float base = 0;
    private float altura = 0;
    
    //Métodos
    public float getBase(){
        return base;
    }
    public void setBase(float base)throws Exception{
        if(base < 0)throw new Exception("BASE não pode ser Negativo!");
        this.base = base;
    }
    
    public float getAltura(){
        return altura;
    }
    public void setAltura(float altura)throws Exception{
        if(altura < 0)throw new Exception("ALTURA não pode ser Negativo");
        this.altura = altura;
    }
    
    public float calcularVolume(){
        /*Coerção para o valor 1.0*/
        return (float)1.0/3*(base*altura);
    }
}
