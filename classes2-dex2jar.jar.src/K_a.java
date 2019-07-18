import java.io.IOException;
import java.util.List;

public final class k_a
  implements qZa.a
{
  private final List<qZa> a;
  private final c_a b;
  private final VZa c;
  private final int d;
  private final xZa e;
  private final YYa f;
  private final int g;
  private final int h;
  private final int i;
  private int j;
  
  public k_a(List<qZa> paramList, c_a paramc_a, VZa paramVZa, int paramInt1, xZa paramxZa, YYa paramYYa, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramList;
    this.b = paramc_a;
    this.c = paramVZa;
    this.d = paramInt1;
    this.e = paramxZa;
    this.f = paramYYa;
    this.g = paramInt2;
    this.h = paramInt3;
    this.i = paramInt4;
  }
  
  public xZa N()
  {
    return this.e;
  }
  
  public BZa a(xZa paramxZa)
    throws IOException
  {
    return a(paramxZa, this.b, this.c);
  }
  
  public BZa a(xZa paramxZa, c_a paramc_a, VZa paramVZa)
    throws IOException
  {
    if (this.d < this.a.size())
    {
      this.j += 1;
      Object localObject = this.c;
      if ((localObject != null) && (!((VZa)localObject).b().a(paramxZa.g())))
      {
        paramxZa = new StringBuilder();
        paramxZa.append("network interceptor ");
        paramxZa.append(this.a.get(this.d - 1));
        paramxZa.append(" must retain the same host and port");
        throw new IllegalStateException(paramxZa.toString());
      }
      if ((this.c != null) && (this.j > 1))
      {
        paramxZa = new StringBuilder();
        paramxZa.append("network interceptor ");
        paramxZa.append(this.a.get(this.d - 1));
        paramxZa.append(" must call proceed() exactly once");
        throw new IllegalStateException(paramxZa.toString());
      }
      localObject = new k_a(this.a, paramc_a, paramVZa, this.d + 1, paramxZa, this.f, this.g, this.h, this.i);
      paramxZa = (qZa)this.a.get(this.d);
      paramc_a = paramxZa.a((qZa.a)localObject);
      if ((paramVZa != null) && (this.d + 1 < this.a.size()) && (((k_a)localObject).j != 1))
      {
        paramc_a = new StringBuilder();
        paramc_a.append("network interceptor ");
        paramc_a.append(paramxZa);
        paramc_a.append(" must call proceed() exactly once");
        throw new IllegalStateException(paramc_a.toString());
      }
      if (paramc_a != null)
      {
        if (paramc_a.a() != null) {
          return paramc_a;
        }
        paramc_a = new StringBuilder();
        paramc_a.append("interceptor ");
        paramc_a.append(paramxZa);
        paramc_a.append(" returned a response with no body");
        throw new IllegalStateException(paramc_a.toString());
      }
      paramc_a = new StringBuilder();
      paramc_a.append("interceptor ");
      paramc_a.append(paramxZa);
      paramc_a.append(" returned null");
      throw new NullPointerException(paramc_a.toString());
    }
    throw new AssertionError();
  }
  
  public bZa a()
  {
    Object localObject = this.c;
    if (localObject != null) {
      localObject = ((VZa)localObject).b();
    } else {
      localObject = null;
    }
    return (bZa)localObject;
  }
  
  public int b()
  {
    return this.h;
  }
  
  public int c()
  {
    return this.i;
  }
  
  public int d()
  {
    return this.g;
  }
  
  public VZa e()
  {
    VZa localVZa = this.c;
    if (localVZa != null) {
      return localVZa;
    }
    throw new IllegalStateException();
  }
  
  public c_a f()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/k_a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */