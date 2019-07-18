import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

final class wba
  extends mba
{
  wba(String paramString, ExecutorService paramExecutorService, long paramLong, TimeUnit paramTimeUnit) {}
  
  public void a()
  {
    try
    {
      Xaa localXaa = Naa.e();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Executing shutdown hook for ");
      localStringBuilder.append(this.a);
      localXaa.d("Fabric", localStringBuilder.toString());
      this.b.shutdown();
      if (!this.b.awaitTermination(this.c, this.d))
      {
        localXaa = Naa.e();
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append(this.a);
        localStringBuilder.append(" did not shut down in the allocated time. Requesting immediate shutdown.");
        localXaa.d("Fabric", localStringBuilder.toString());
        this.b.shutdownNow();
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      Naa.e().d("Fabric", String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[] { this.a }));
      this.b.shutdownNow();
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/wba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */