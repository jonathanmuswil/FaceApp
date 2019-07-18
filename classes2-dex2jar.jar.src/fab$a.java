final class fab$a
  extends Thread
{
  fab$a()
  {
    super("Okio Watchdog");
    setDaemon(true);
  }
  
  public void run()
  {
    try
    {
      for (;;)
      {
        try
        {
          fab localfab = fab.g();
          if (localfab == null) {}
          if (localfab == fab.g)
          {
            fab.g = null;
            return;
          }
          localfab.j();
        }
        finally {}
      }
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/fab$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */