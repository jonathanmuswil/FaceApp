import java.io.IOException;
import java.util.List;

public final class d_a
  implements qZa
{
  private final gZa a;
  
  public d_a(gZa paramgZa)
  {
    this.a = paramgZa;
  }
  
  private String a(List<eZa> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramList.size();
    for (int j = 0; j < i; j++)
    {
      if (j > 0) {
        localStringBuilder.append("; ");
      }
      eZa localeZa = (eZa)paramList.get(j);
      localStringBuilder.append(localeZa.a());
      localStringBuilder.append('=');
      localStringBuilder.append(localeZa.b());
    }
    return localStringBuilder.toString();
  }
  
  public BZa a(qZa.a parama)
    throws IOException
  {
    Object localObject1 = parama.N();
    Object localObject2 = ((xZa)localObject1).f();
    Object localObject3 = ((xZa)localObject1).a();
    if (localObject3 != null)
    {
      rZa localrZa = ((AZa)localObject3).b();
      if (localrZa != null) {
        ((xZa.a)localObject2).b("Content-Type", localrZa.toString());
      }
      long l = ((AZa)localObject3).a();
      if (l != -1L)
      {
        ((xZa.a)localObject2).b("Content-Length", Long.toString(l));
        ((xZa.a)localObject2).a("Transfer-Encoding");
      }
      else
      {
        ((xZa.a)localObject2).b("Transfer-Encoding", "chunked");
        ((xZa.a)localObject2).a("Content-Length");
      }
    }
    localObject3 = ((xZa)localObject1).a("Host");
    int i = 0;
    if (localObject3 == null) {
      ((xZa.a)localObject2).b("Host", LZa.a(((xZa)localObject1).g(), false));
    }
    if (((xZa)localObject1).a("Connection") == null) {
      ((xZa.a)localObject2).b("Connection", "Keep-Alive");
    }
    int j = i;
    if (((xZa)localObject1).a("Accept-Encoding") == null)
    {
      j = i;
      if (((xZa)localObject1).a("Range") == null)
      {
        j = 1;
        ((xZa.a)localObject2).b("Accept-Encoding", "gzip");
      }
    }
    localObject3 = this.a.a(((xZa)localObject1).g());
    if (!((List)localObject3).isEmpty()) {
      ((xZa.a)localObject2).b("Cookie", a((List)localObject3));
    }
    if (((xZa)localObject1).a("User-Agent") == null) {
      ((xZa.a)localObject2).b("User-Agent", MZa.a());
    }
    parama = parama.a(((xZa.a)localObject2).a());
    i_a.a(this.a, ((xZa)localObject1).g(), parama.e());
    localObject2 = parama.h();
    ((BZa.a)localObject2).a((xZa)localObject1);
    if ((j != 0) && ("gzip".equalsIgnoreCase(parama.b("Content-Encoding"))) && (i_a.b(parama)))
    {
      localObject1 = new qab(parama.a().e());
      localObject3 = parama.e().a();
      ((oZa.a)localObject3).b("Content-Encoding");
      ((oZa.a)localObject3).b("Content-Length");
      ((BZa.a)localObject2).a(((oZa.a)localObject3).a());
      ((BZa.a)localObject2).a(new l_a(parama.b("Content-Type"), -1L, vab.a((Eab)localObject1)));
    }
    return ((BZa.a)localObject2).a();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/d_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */