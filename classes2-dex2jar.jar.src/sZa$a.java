import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class sZa$a
{
  private final mab a;
  private rZa b = sZa.a;
  private final List<sZa.b> c = new ArrayList();
  
  public sZa$a()
  {
    this(UUID.randomUUID().toString());
  }
  
  public sZa$a(String paramString)
  {
    this.a = mab.b(paramString);
  }
  
  public a a(oZa paramoZa, AZa paramAZa)
  {
    a(sZa.b.a(paramoZa, paramAZa));
    return this;
  }
  
  public a a(rZa paramrZa)
  {
    if (paramrZa != null)
    {
      if (paramrZa.b().equals("multipart"))
      {
        this.b = paramrZa;
        return this;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("multipart != ");
      localStringBuilder.append(paramrZa);
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    throw new NullPointerException("type == null");
  }
  
  public a a(sZa.b paramb)
  {
    if (paramb != null)
    {
      this.c.add(paramb);
      return this;
    }
    throw new NullPointerException("part == null");
  }
  
  public sZa a()
  {
    if (!this.c.isEmpty()) {
      return new sZa(this.a, this.b, this.c);
    }
    throw new IllegalStateException("Multipart body must have at least one part.");
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/sZa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */