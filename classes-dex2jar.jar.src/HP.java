class hp
  implements Runnable
{
  hp(ip paramip, WQa.c paramc) {}
  
  public void run()
  {
    try
    {
      this.b.a.run();
    }
    catch (Exception localException)
    {
      this.b.b.a("Could not unregister receiver in UI Thread", localException);
    }
    this.a.i();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/hp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */