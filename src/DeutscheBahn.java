public class DeutscheBahn {
    protected String name;
    private boolean direction;
    private String gps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) {
        this.direction = direction;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public DeutscheBahn(String name, boolean direction, String gps) {
        this.name = name;
        this.direction = direction;
        this.gps = gps;
    }
}
