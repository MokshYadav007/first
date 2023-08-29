package multithreading;

class yup implements Runnable{

    public void run()
    {
        for(int i=0;i<5;i++)

        {
            try {

                 System.out.println("no exception");
                 Thread.sleep(2000);
                
            } 
            
            catch (InterruptedException e)
             {
                System.out.println("yup there is exception");
            }
           
        }

    }
}


public class intrepting {
    public static void main(String[] args) {
        
        yup y1 = new yup();
        Thread t1 = new Thread(y1);
        t1.start();
        t1.interrupt();

    }
    
}
