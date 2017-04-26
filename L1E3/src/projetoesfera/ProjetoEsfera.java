package projetoesfera;

import javax.swing.JOptionPane;

public class ProjetoEsfera {

    public static void main(String[] args) {
        Esfera esfera = new Esfera();
        
        String entrada;
        entrada = JOptionPane.showInputDialog("Digite o valor do Raio: ");
        esfera.setRaio(Float.parseFloat(entrada));
        

        String saida = "Valores: \n";
        saida += "Valor da Area: " + esfera.calcularArea() + "\n";
        saida += "Valor do Volume: " +esfera.calcularVolume() + "\n";
        
        JOptionPane.showMessageDialog(null, saida);
        
    }
    
}