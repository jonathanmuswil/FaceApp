import java.util.concurrent.atomic.AtomicInteger;

final class dBa<T, R>
  implements DRa<T, R>
{
  dBa(eBa.a parama, String paramString) {}
  
  public final qBa a(oBa paramoBa)
  {
    oXa.b(paramoBa, "cfg");
    try
    {
      Object localObject1 = new BPa;
      ((BPa)localObject1).<init>(this.b);
      Object localObject2 = this.a.a((BPa)localObject1, paramoBa);
      ((BPa)localObject1).a();
      int i;
      if (paramoBa.e() != this.a.b().get()) {
        i = 1;
      } else {
        i = 0;
      }
      localObject1 = new qBa$c;
      ((qBa.c)localObject1).<init>(paramoBa.a(), localObject2);
      if ((i ^ 0x1) != 0) {
        paramoBa = (oBa)localObject1;
      } else {
        paramoBa = null;
      }
      if (paramoBa == null) {
        paramoBa = qBa.a.a;
      }
    }
    catch (Throwable paramoBa)
    {
      paramoBa = new qBa.b(paramoBa);
    }
    catch (InterruptedException paramoBa)
    {
      paramoBa = qBa.a.a;
    }
    return paramoBa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/dBa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */