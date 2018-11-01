public class MainRun {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        int[] array = new int[100000];
        for (int i = 0; i< array.length;i++){
            array[i] = (int) Math.floor(Math.random());
        }

        for (int i = 0; i<array.length;i++){
            for (int j = i + 1;j<array.length;j++){
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        stopWatch.stop();

        System.out.println("Start time: " + stopWatch.start());
        System.out.println("End time: " + stopWatch.stop());
        System.out.println("Time to operate: " + stopWatch.getElapsedTime());
    }
}
