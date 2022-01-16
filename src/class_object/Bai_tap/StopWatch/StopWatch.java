package class_object.Bai_tap.StopWatch;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public void start() {
        startTime = new Date();
    }
    public void stop() {
        endTime = new Date();
    }
    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}
