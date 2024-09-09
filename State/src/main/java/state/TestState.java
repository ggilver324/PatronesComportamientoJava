package state;

public class TestState {

    public static void main(String[] args){
        Mission mission = new Mission("Mission I");
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
        mission.next();
        System.out.println(mission);
    }
}
