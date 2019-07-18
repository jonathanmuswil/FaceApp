import java.util.Iterator;
import java.util.List;

class qm$e
  extends mba
{
  private final float a;
  private final qm.d b;
  
  qm$e(qm paramqm, float paramFloat, qm.d paramd)
  {
    this.a = paramFloat;
    this.b = paramd;
  }
  
  private void b()
  {
    Xaa localXaa = Naa.e();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("Starting report processing in ");
    ((StringBuilder)localObject2).append(this.a);
    ((StringBuilder)localObject2).append(" second(s)...");
    localXaa.d("CrashlyticsCore", ((StringBuilder)localObject2).toString());
    float f = this.a;
    long l;
    if (f > 0.0F)
    {
      l = (f * 1000.0F);
      try
      {
        Thread.sleep(l);
      }
      catch (InterruptedException localInterruptedException1)
      {
        Thread.currentThread().interrupt();
        return;
      }
    }
    Object localObject1 = this.c.b();
    if (qm.a(this.c).a()) {
      return;
    }
    Object localObject3;
    if ((!((List)localObject1).isEmpty()) && (!this.b.a()))
    {
      localObject2 = Naa.e();
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("User declined to send. Removing ");
      ((StringBuilder)localObject3).append(((List)localObject1).size());
      ((StringBuilder)localObject3).append(" Report(s).");
      ((Xaa)localObject2).d("CrashlyticsCore", ((StringBuilder)localObject3).toString());
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((pm)((Iterator)localObject1).next()).remove();
      }
      return;
    }
    int i = 0;
    for (;;)
    {
      if (!((List)localObject1).isEmpty())
      {
        if (qm.a(this.c).a()) {
          return;
        }
        localObject3 = Naa.e();
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Attempting to send ");
        ((StringBuilder)localObject2).append(((List)localObject1).size());
        ((StringBuilder)localObject2).append(" report(s)");
        ((Xaa)localObject3).d("CrashlyticsCore", ((StringBuilder)localObject2).toString());
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (pm)((Iterator)localObject1).next();
          this.c.a((pm)localObject2);
        }
        localObject2 = this.c.b();
        localObject1 = localObject2;
        if (!((List)localObject2).isEmpty())
        {
          l = qm.a()[Math.min(i, qm.a().length - 1)];
          localObject1 = Naa.e();
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("Report submisson: scheduling delayed retry in ");
          ((StringBuilder)localObject3).append(l);
          ((StringBuilder)localObject3).append(" seconds");
          ((Xaa)localObject1).d("CrashlyticsCore", ((StringBuilder)localObject3).toString());
          try
          {
            Thread.sleep(l * 1000L);
            i++;
            localObject1 = localObject2;
          }
          catch (InterruptedException localInterruptedException2)
          {
            Thread.currentThread().interrupt();
          }
        }
      }
    }
  }
  
  public void a()
  {
    try
    {
      b();
    }
    catch (Exception localException)
    {
      Naa.e().b("CrashlyticsCore", "An unexpected error occurred while attempting to upload crash reports.", localException);
    }
    qm.a(this.c, null);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/qm$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */