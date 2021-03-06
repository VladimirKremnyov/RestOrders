package restOrders.entity;

import java.io.Serializable;

public class Requirements implements Serializable {

    private boolean trainings;
    private boolean sauna;
    private boolean gym;
    private int numberOfTrainingsSession;

    public Requirements() {

    }

    public Requirements(boolean trainings, boolean sauna, boolean gym, int numberOfTrainingsSession) {
        this.trainings = trainings;
        this.sauna = sauna;
        this.gym = gym;
        this.numberOfTrainingsSession = numberOfTrainingsSession;
    }

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
