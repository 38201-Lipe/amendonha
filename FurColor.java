package enums;

/**
 * Enum representando cores de pelagem de gatos.
 * Cada cor tem um código único e um nome de exibição.
 */
public enum FurColor {
    BLACK(1, "Black"),
    WHITE(2, "White"),
    ORANGE_TABBY(3, "Orange Tabby"),
    GRAY(4, "Gray"),
    BROWN(5, "Brown"),
    CALICO(6, "Calico"),
    SPOTTED(7, "Spotted");

    private final int code;
    private final String displayName;

    // Construtor privado para inicializar os campos
    FurColor(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    // Getters
    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Retorna a constante FurColor correspondente ao código fornecido.
     * Lança IllegalArgumentException se o código não existir.
     */
    public static FurColor fromCode(int code) {
        for (FurColor color : FurColor.values()) {
            if (color.getCode() == code) {
                return color;
            }
        }
        throw new IllegalArgumentException("Invalid FurColor code: " + code);
    }
}