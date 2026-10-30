package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet meuPet = new Pet();

        System.out.print("Nome do pet: ");
        meuPet.nome = sc.nextLine();

        System.out.print("Espécie: ");
        meuPet.especie = sc.nextLine();

        System.out.print("Peso (kg): ");
        meuPet.peso = sc.nextDouble();

        if (meuPet.peso < 10) {
            meuPet.porte = "Pequeno";
        } else if (meuPet.peso < 25) {
            meuPet.porte = "Médio";
        } else {
            meuPet.porte = "Grande";
        }

        System.out.println("Porte: " + meuPet.porte);
    }
}