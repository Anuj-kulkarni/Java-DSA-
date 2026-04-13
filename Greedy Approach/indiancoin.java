public class indiancoin {
    public static void main(String[] args) {
        int coins[] = {2000, 500, 100, 50, 20, 10, 5, 2, 1};
        int price = 210;

        for(int i=0; i<coins.length; i++) {
            if(price >= coins[i]) {
                int count = price / coins[i];
                price = price - (count * coins[i]);
                System.out.println(coins[i] + " : " + count);
            }
        }
    }
}
