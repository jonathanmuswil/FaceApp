import java.io.IOException;
import java.net.ProtocolException;

public final class e_a
  implements qZa
{
  private final boolean a;
  
  public e_a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  public BZa a(qZa.a parama)
    throws IOException
  {
    parama = (k_a)parama;
    VZa localVZa = parama.e();
    xZa localxZa = parama.N();
    long l = System.currentTimeMillis();
    localVZa.a(localxZa);
    boolean bool = j_a.b(localxZa.e());
    Object localObject = null;
    parama = null;
    if ((bool) && (localxZa.a() != null))
    {
      if ("100-continue".equalsIgnoreCase(localxZa.a("Expect")))
      {
        localVZa.e();
        localVZa.i();
        parama = localVZa.a(true);
        i = 1;
      }
      else
      {
        i = 0;
      }
      if (parama == null)
      {
        if (localxZa.a().c())
        {
          localVZa.e();
          localObject = vab.a(localVZa.a(localxZa, true));
          localxZa.a().a((kab)localObject);
          j = i;
          localObject = parama;
        }
        else
        {
          localObject = vab.a(localVZa.a(localxZa, false));
          localxZa.a().a((kab)localObject);
          ((Dab)localObject).close();
          j = i;
          localObject = parama;
        }
      }
      else
      {
        localVZa.h();
        j = i;
        localObject = parama;
        if (!localVZa.b().d())
        {
          localVZa.g();
          j = i;
          localObject = parama;
        }
      }
    }
    else
    {
      localVZa.h();
      j = 0;
    }
    if ((localxZa.a() == null) || (!localxZa.a().c())) {
      localVZa.d();
    }
    if (j == 0) {
      localVZa.i();
    }
    parama = (qZa.a)localObject;
    if (localObject == null) {
      parama = localVZa.a(false);
    }
    parama.a(localxZa);
    parama.a(localVZa.b().c());
    parama.b(l);
    parama.a(System.currentTimeMillis());
    parama = parama.a();
    int j = parama.c();
    int i = j;
    if (j == 100)
    {
      parama = localVZa.a(false);
      parama.a(localxZa);
      parama.a(localVZa.b().c());
      parama.b(l);
      parama.a(System.currentTimeMillis());
      parama = parama.a();
      i = parama.c();
    }
    localVZa.b(parama);
    if ((this.a) && (i == 101))
    {
      parama = parama.h();
      parama.a(LZa.d);
      parama = parama.a();
    }
    else
    {
      localObject = parama.h();
      ((BZa.a)localObject).a(localVZa.a(parama));
      parama = ((BZa.a)localObject).a();
    }
    if (("close".equalsIgnoreCase(parama.k().a("Connection"))) || ("close".equalsIgnoreCase(parama.b("Connection")))) {
      localVZa.g();
    }
    if (((i != 204) && (i != 205)) || (parama.a().c() <= 0L)) {
      return parama;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("HTTP ");
    ((StringBuilder)localObject).append(i);
    ((StringBuilder)localObject).append(" had non-zero Content-Length: ");
    ((StringBuilder)localObject).append(parama.a().c());
    throw new ProtocolException(((StringBuilder)localObject).toString());
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/e_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */