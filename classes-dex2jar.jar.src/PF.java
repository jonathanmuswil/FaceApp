import android.os.Process;

class pf
  implements Runnable
{
  pf(qf paramqf, Runnable paramRunnable) {}
  
  public void run()
  {
    Process.setThreadPriority(10);
    this.a.run();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */