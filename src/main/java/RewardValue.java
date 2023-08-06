public class RewardValue {
    private int miles;
    private double rewardCash;

    public RewardValue(int miles)  {
        this.miles = miles;
        this.rewardCash = miles * 0.0035;
    }

    public RewardValue(double cash) {
        this.rewardCash = cash;
        this.miles = (int) (cash / 0.0035);
    }

    public double getMilesValue() {
        return miles;
    }

    public double getCashValue() {
        return rewardCash;
    }

    public void setMilesValue(int miles) {
        this.miles = miles;
    }

    public void setRewardCash(double rewardCash) {
        this.rewardCash = rewardCash;
    }
}
