public class thread {
    public static void main(String argvs[]) {
        Thread t = new Thread("My first thread");

        // the start() method moves the thread to the active state
        t.start();
        // getting the thread name by invoking the getName() method
        String str = t.getName();
        System.out.println(str);
    }
}
