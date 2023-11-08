package lotto.model;

import lotto.constant.ValidatorMessage;

public class Order {
    private static int LOTTO_PRICE = 1000;

    private final int cost;
    private int buyCount;

    public Order(String inputCost) {
        this.cost = convertStringToInteger(inputCost);

        validate(this.cost);
    }

    public int getBuyCount() {

    }

    private int convertStringToInteger(String cost) {
        validateIsNull(cost);
        validateIsNumeric(cost);

        return Integer.parseInt(cost);
    }

    public LottoTicket buy() {

    }

    public void validate(int cost) {
        validateIsPositive(cost);
        validateMultipleOfThousand(cost);
    }
    public String getBuyCountToString() {

    }

    public String getResult(WinStatistics winStatistics) {

    }

    private double calculateProfitRate(WinStatistics winStatistics) {

    }


    private void validateIsNumeric(String cost) {
        if (!cost.matches("^\\d+$")) {
            throw new IllegalArgumentException(ValidatorMessage.INVALID_INPUT_NUMERIC);
        }
    }

    private void validateIsPositive(int cost) {
        if (cost <= 0) {
            throw new IllegalArgumentException(ValidatorMessage.INVALID_COST_POSITIVE);
        }
    }

    private void validateMultipleOfThousand(int cost) {
        if (cost % 1000 != 0) {
            throw new IllegalArgumentException(ValidatorMessage.INVALID_LOTTO_COST);
        }
    }

    private void validateIsNull(String cost){
        if(cost == null || cost.isEmpty()) {
            throw new IllegalArgumentException(ValidatorMessage.INVALID_IS_NULL);
        }
    }
}
