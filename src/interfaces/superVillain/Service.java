package interfaces.superVillain;

public class Service {
    public static void useKillerMethods(Killer killer) {
        killer.kill();
        killer.fire();
    }

    public static void useTerroristMethods(Terrorist terrorist) {
        terrorist.capture();
        terrorist.destroy();
    }

    public static void useThiefMethods(Thief thief) {
        thief.hackTheAlarm();
        thief.steal();
    }

    public static void useSuperVillainMethods(SuperVillain supervillain) {
        useKillerMethods(supervillain);
        useTerroristMethods(supervillain);
        useThiefMethods(supervillain);
        supervillain.beKnown();
    }
}
