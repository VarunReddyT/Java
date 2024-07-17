import java.lang.*;

class chat{
    private boolean flag = false;
    private int count = 0;

    public synchronized void questions(String q){
        if(flag){
            try{
                wait();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(Thread.currentThread().getName() + " - " + q);
        flag = true;
        notify();
    }

    public synchronized void answers(String a){
        if(!flag){
            try{
                if(count%3 == 0){
                    wait();
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(Thread.currentThread().getName() +" - " + a);
        flag = false;
        notify();
    }
}

class T1 implements Runnable{

    chat m1;
    T1(chat m){
        this.m1 = m;
    }
    String [] queStrings = {"Hi ", "How are you?","Where are you studying?" };

    @Override
    public void run() {
        // TODO Auto-generated method stub
       for (int i = 0; i < queStrings.length; i++) {
        m1.questions(queStrings[i]);
       }   
    }
}

class T2 implements Runnable{
    chat m1;
    T2(chat m){
        this.m1 = m;
    }
    String [] ansStrings = {"Hello", "Hello World","Fine","Good","KMIT","Hyderabad" };

    @Override
    public void run() {
        // TODO Auto-generated method stub
       for (int i = 0; i < ansStrings.length; i++) {
        m1.answers(ansStrings[i]);
       }   
    }
}

public class Chat_1{
     public static void main(String[] args) {
        chat m = new chat();
        T1 ques = new T1(m);
        T2 ans = new T2(m);
        Thread t1 = new Thread(ques,"Question");
        Thread t2 = new Thread(ans,"Anwser");
        t1.start();
        t2.start();
     }

}