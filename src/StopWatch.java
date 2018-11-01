import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public long start(){
        Date date = new Date();
        return startTime = date.getTime();
    }

    public long stop(){
        Date date = new Date();
        return endTime = date.getTime();
    }

    public long getElapsedTime(){
        return -startTime + endTime;
    }
}
