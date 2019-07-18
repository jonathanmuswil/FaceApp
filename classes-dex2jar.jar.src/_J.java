class _j
  implements Runnable
{
  _j(fk paramfk, Ica paramIca, String paramString) {}
  
  public void run()
  {
    try
    {
      this.c.h.a(this.a, this.b);
    }
    catch (Exception localException)
    {
      Naa.e().b("Answers", "Failed to set analytics settings data", localException);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/_j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */