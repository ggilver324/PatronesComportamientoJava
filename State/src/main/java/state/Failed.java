package state;

public class Failed implements MissionState{

    @Override
    public void next(Mission mission) {
        mission.setState(new Progress());
    }

    @Override
    public String print() {
        return " is failed";
    }
}
