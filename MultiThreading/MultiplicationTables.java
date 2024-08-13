public class MultiplicationTables implements Runnable {

    synchronized void printTable(int number, int limit){
        for(int i = 1; i <= limit; i++){
            System.out.println(number + " * " + i + " = " + number*i);
        }
    }
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) throws Exception{
        int number1 = 5;
        int number2 = 7;
        int limit = 10; 
        MultiplicationTables table = new MultiplicationTables();
        Table1 table1 = new Table1(table,number1, limit);
        Table2 table2 = new Table2(table,number2, limit);

        Thread thread1 = new Thread(table1);
        Thread thread2 = new Thread(table2);

        thread1.start();
        thread2.start();
    }
}

class Table1 extends Thread{
    MultiplicationTables table;
    private int number;
    private int limit;

    public Table1(MultiplicationTables table,int number, int limit){
        this.number = number;
        this.limit = limit;
        this.table = table;
    }

    public void run(){
        table.printTable(number, limit);
    }
}
class Table2 extends Thread{
    MultiplicationTables table;
    private int number;
    private int limit;

    public Table2(MultiplicationTables table,int number, int limit){
        this.number = number;
        this.limit = limit;
        this.table = table;
    }

    public void run(){
        table.printTable(number, limit);
    }
}