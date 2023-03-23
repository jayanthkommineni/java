//Threads using lambda expression

//runnable

class thread
{
public static void main(string[] args)
{
Runnable r={}->
{
for(int i=o;i<=5;i++)
{
system.out.println(Thread.currentThread().getnName()+" "+i);
}};
Thread t1=new Thread(r);
Thread t2=new Thread(r);
Thread t3=new Thread(r);
t1.start();  t2.start();  t3.start();
}}