package chap07.exercise;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    // (구현) 배열 SutdaCard를 적절히 초기화 하시오.
    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            SutdaCard card;
            if (i < 10) {
                if (i == 0 || i == 2 || i == 7) {
                    card = new SutdaCard(i + 1, true);
                } else {
                    card = new SutdaCard(i + 1, false);
                }

            } else {
                card = new SutdaCard(i - 9, false);
            }
            cards[i] = card;
        }
    }

    void shuffle() {
        // (구현)
        for (int i = 0; i < CARD_NUM; i++) {
            int j = (int) (Math.random() * 20);
            SutdaCard temp = cards[j];
            cards[j] = cards[i];
            cards[i] = temp;
        }
    }

    SutdaCard pick(int index) {
        return cards[index];
    }

    SutdaCard pick() {
        return cards[(int) (Math.random() * 20)];
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");
    }
}
// 예상결과) 1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,