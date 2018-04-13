package restOrders.dto;

public class RequirementsDTO {

    private boolean trainings;
    private boolean sauna;
    private boolean gym;
    private int numberOfTrainingsSession;

    public boolean isTrainings() {
        return trainings;
    }

    public void setTrainings(boolean trainings) {
        this.trainings = trainings;
    }

    public boolean isSauna() {
        return sauna;
    }

    public void setSauna(boolean sauna) {
        this.sauna = sauna;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public int getNumberOfTrainingsSession() {
        return numberOfTrainingsSession;
    }

    public void setNumberOfTrainingsSession(int numberOfTrainingsSession) {
        this.numberOfTrainingsSession = numberOfTrainingsSession;
    }

}
