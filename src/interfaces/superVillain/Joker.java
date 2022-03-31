package interfaces.superVillain;

public class Joker implements SuperVillain {
    @Override
    public String toString() {
        return "Joker";
    }

    @Override
    public void kill() {
        System.out.println(this + " can kill");
    }

    @Override
    public void fire() {
        System.out.println(this + " can fire");
    }

    @Override
    public void beKnown() {
        System.out.println(this + " is known");
    }

    @Override
    public void destroy() {
        System.out.println(this + " can destroy");
    }

    @Override
    public void capture() {
        System.out.println(this + " can capture");
    }

    @Override
    public void steal() {
        System.out.println(this + " can steal");
    }

    @Override
    public void hackTheAlarm() {
        System.out.println(this + " can hack the alarm");
    }
}
