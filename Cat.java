package model;

import enums.FurColor;

/**
 * Classe representando um gato.
 * Herda da classe Animal e adiciona características específicas de gatos.
 */
public class Cat extends Animal {

    private int lives;                 // Número de vidas restantes
    private FurColor furColor;         // Cor da pelagem
    private boolean isIndoor;          // Se é gato de apartamento
    private String favoriteFood;       // Comida preferida
    private int purringFrequency;      // Frequência do ronronar em Hz
    private boolean isNeutered;        // Se é castrado

    /**
     * Construtor do gato
     */
    public Cat(String name, int age, FurColor furColor, boolean isIndoor,
               String favoriteFood, int purringFrequency, boolean isNeutered) {
        super(name, age);
        this.lives = 7;  // gatos começam com 7 vidas
        this.furColor = furColor;
        this.isIndoor = isIndoor;
        this.favoriteFood = favoriteFood;
        this.purringFrequency = purringFrequency;
        this.isNeutered = isNeutered;
    }

    // Sobrescreve método makeSound
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow! (" + purringFrequency + " Hz)");
    }

    // Sobrescreve método sleep
    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 14 hours in the warmest spot.");
    }

    // Overload de move: distância e velocidade
    public void move(int distance, int speed) {
        System.out.println(getName() + " jumps " + distance + " meters with speed " + speed + " m/s.");
    }

    // Overload de move: distância e alvo
    public void move(int distance, String target) {
        System.out.println(getName() + " silently approaches " + target + " over " + distance + " meters.");
    }

    // Método específico de ronronar
    public void purr() {
        System.out.println(getName() + " is purring at " + purringFrequency + " Hz.");
    }

    // Perde uma vida, ou informa que não há vidas restantes
    public void loseLife() {
        if (lives > 0) {
            lives--;
            System.out.println(getName() + " lost a life. Remaining lives: " + lives);
        } else {
            System.out.println(getName() + " has no lives left!");
        }
    }

    // Exibe informações detalhadas
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Lives: " + lives);
        System.out.println("Fur Color: " + furColor.getDisplayName());
        System.out.println("Indoor: " + isIndoor);
        System.out.println("Favorite Food: " + favoriteFood);
        System.out.println("Purring Frequency: " + purringFrequency + " Hz");
        System.out.println("Neutered: " + isNeutered);
    }

    // Getters
    public int getLives() {
        return lives;
    }

    public FurColor getFurColor() {
        return furColor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getPurringFrequency() {
        return purringFrequency;
    }

    public boolean isNeutered() {
        return isNeutered;
    }
}