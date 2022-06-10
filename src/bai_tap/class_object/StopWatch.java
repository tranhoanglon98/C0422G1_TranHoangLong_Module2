package bai_tap.class_object;

import java.util.Date;

public class StopWatch {
    Date startTime;
    Date stopTime;

    public StopWatch() {
        this.startTime = new Date();
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.stopTime = new Date();
    }

    public long getElapsedTime() {
        return this.stopTime.getTime() - this.startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.floor(Math.random() * 101);
        }
        stopWatch.start();
        System.out.println("start time : " + stopWatch.startTime);
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;
                }
            }
        }
        stopWatch.stop();
        System.out.println("stop time : " +  stopWatch.stopTime);
        System.out.println("elapsed time: "+stopWatch.getElapsedTime() +" millisecond");
    }
}
