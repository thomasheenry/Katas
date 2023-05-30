public class Game {
    public String winner(String[] deckSteve, String[] deckJosh) {
        int scoreSteve = 0;
        int scoreJosh = 0;

        for (int i = 0; i < deckSteve.length; i++) {
            int valueSteve = getValue(deckSteve[i].charAt(0));
            int valueJosh = getValue(deckJosh[i].charAt(0));

            if (valueSteve > valueJosh) {
                scoreSteve++;
            } else if (valueSteve < valueJosh) {
                scoreJosh++;
            }
        }

        if (scoreSteve > scoreJosh) {
            return "Steve wins " + scoreSteve + " to " + scoreJosh;
        } else if (scoreSteve < scoreJosh) {
            return "Josh wins " + scoreJosh + " to " + scoreSteve;
        } else {
            return "Tie";
        }
    }

    private int getValue(char card) {
        String cardValues = "23456789TJQKA";
        return cardValues.indexOf(card) + 2;
    }
}
