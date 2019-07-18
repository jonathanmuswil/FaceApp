import java.util.concurrent.Callable;

class cl
  implements Callable<Boolean>
{
  cl(Cl paramCl, Xca paramXca) {}
  
  public Boolean call()
    throws Exception
  {
    if (this.b.g())
    {
      Naa.e().d("CrashlyticsCore", "Skipping session finalization because a crash has already occurred.");
      return Boolean.FALSE;
    }
    Naa.e().d("CrashlyticsCore", "Finalizing previously open sessions.");
    Cl.a(this.b, this.a, true);
    Naa.e().d("CrashlyticsCore", "Closed all previously open sessions");
    return Boolean.TRUE;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */