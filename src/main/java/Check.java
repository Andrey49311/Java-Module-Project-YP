public class Check {
    private Double sum = 0D;
    private String goods = "";

    public void addSum(Double newSum) {
        this.sum += newSum;
    }
    public String getGoods() {
        return this.goods;
    }
    public Double getSum() {
        return this.sum;
    }
    public void addGoodName(String goodName, Double goodPrice) {
        String newNames = goods + "\n" + "Товар: "+ goodName + ", его цена: " + goodPrice + ";";
        this.goods = newNames;
    }
    public Double div(int countClients) {
        Double result = this.sum / countClients;
        return result;
    }
}
