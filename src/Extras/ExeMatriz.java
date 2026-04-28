package Extras;

import javax.swing.*;

public class ExeMatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[8][8];
        String resul = "";

        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                resul += "[" + matriz[i][j] + "] ";
            }
            resul += "\n";
        }
        JOptionPane.showMessageDialog(null, resul);
        int novoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para substituir o valor das posições pares:"));

        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 8; j ++){
                if(((i%2) == 0) || ((j%2) == 0)) {
                    matriz[i][j] += novoValor;
                }
                if(((i%2) != 0) || ((j%2) != 0)){
                    matriz[i][j] -= novoValor;
                }
            }
        }
        resul = "";
        for(int x = 0; x < 8; x++){
            for(int j = 0; j < 8; j++){
                resul += "[" + matriz[x][j] + "] ";
            }
            resul += "\n";
        }
        JOptionPane.showMessageDialog(null, resul);
        JOptionPane.showMessageDialog(null, "A soma dos valores da matriz é: " + mudarMatriz(matriz)[0] +
                "\nO maior valor da matriz é: " + mudarMatriz(matriz)[1] +
                "\nO menor valor da matriz é: " + mudarMatriz(matriz)[2]);
        String repeticao = "";
        String jatem = "";
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                int vezes = 0;
                if(jatem.indexOf(String.valueOf(matriz[i][j])) != -1){
                    break;
                }
                for(int k = 0; k < 8; k++){
                    for (int l = 0; l < 8; l++){
                        if(matriz[k][l] == matriz[i][j]){
                            vezes += 1;
                        }
                    }
                }
                if(vezes > 1){
                    jatem += matriz[i][j];
                    repeticao += "O número " + matriz[i][j] + " se repete " + vezes + " vezes.\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, repeticao);
    }
        public static int[] mudarMatriz(int[][] mat){
        int soma = 0, maior = 0, menor = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(mat[i][j] > maior){
                    maior = mat[i][j];
                }
                if(mat[i][j] < menor){
                    menor = mat[i][j];
                }
                soma += mat[i][j];
            }
        }return new int[]{soma, maior, menor};
    }
}