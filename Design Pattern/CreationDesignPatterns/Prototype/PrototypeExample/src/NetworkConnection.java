public class NetworkConnection implements Cloneable {

    String ip;
    String impData;

    public void setImpData(String impData) {
        this.impData = impData;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void loadVeryImpData() throws InterruptedException {
        this.impData = "Very Imp data";
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return this.ip + " : " + impData;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
