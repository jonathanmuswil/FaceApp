import java.io.IOException;
import java.util.List;

final class ns
  implements lu
{
  private final ls a;
  
  private ns(ls paramls)
  {
    Gs.a(paramls, "output");
    this.a = ((ls)paramls);
    this.a.c = this;
  }
  
  public static ns a(ls paramls)
  {
    ns localns = paramls.c;
    if (localns != null) {
      return localns;
    }
    return new ns(paramls);
  }
  
  public final int a()
  {
    return Es.e.l;
  }
  
  public final void a(int paramInt)
    throws IOException
  {
    this.a.a(paramInt, 4);
  }
  
  public final void a(int paramInt, double paramDouble)
    throws IOException
  {
    this.a.a(paramInt, paramDouble);
  }
  
  public final void a(int paramInt, float paramFloat)
    throws IOException
  {
    this.a.a(paramInt, paramFloat);
  }
  
  public final void a(int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.e(paramInt1, paramInt2);
  }
  
  public final void a(int paramInt, long paramLong)
    throws IOException
  {
    this.a.b(paramInt, paramLong);
  }
  
  public final void a(int paramInt, _r param_r)
    throws IOException
  {
    this.a.a(paramInt, param_r);
  }
  
  public final void a(int paramInt, Object paramObject)
    throws IOException
  {
    if ((paramObject instanceof _r))
    {
      this.a.b(paramInt, (_r)paramObject);
      return;
    }
    this.a.b(paramInt, (it)paramObject);
  }
  
  public final void a(int paramInt, Object paramObject, zt paramzt)
    throws IOException
  {
    this.a.a(paramInt, (it)paramObject, paramzt);
  }
  
  public final void a(int paramInt, String paramString)
    throws IOException
  {
    this.a.a(paramInt, paramString);
  }
  
  public final void a(int paramInt, List<_r> paramList)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      this.a.a(paramInt, (_r)paramList.get(i));
    }
  }
  
  public final void a(int paramInt, List<?> paramList, zt paramzt)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      b(paramInt, paramList.get(i), paramzt);
    }
  }
  
  public final void a(int paramInt, List<Boolean> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += ls.b(((Boolean)paramList.get(paramInt)).booleanValue());
        paramInt++;
      }
      this.a.b(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.a(((Boolean)paramList.get(paramInt)).booleanValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
    throws IOException
  {
    this.a.a(paramInt, paramBoolean);
  }
  
  public final void b(int paramInt)
    throws IOException
  {
    this.a.a(paramInt, 3);
  }
  
  public final void b(int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.c(paramInt1, paramInt2);
  }
  
  public final void b(int paramInt, long paramLong)
    throws IOException
  {
    this.a.c(paramInt, paramLong);
  }
  
  public final void b(int paramInt, Object paramObject, zt paramzt)
    throws IOException
  {
    ls localls = this.a;
    paramObject = (it)paramObject;
    localls.a(paramInt, 3);
    paramzt.a(paramObject, localls.c);
    localls.a(paramInt, 4);
  }
  
  public final void b(int paramInt, List<String> paramList)
    throws IOException
  {
    boolean bool = paramList instanceof Ts;
    int i = 0;
    int j = 0;
    if (bool)
    {
      Ts localTs = (Ts)paramList;
      for (i = j; i < paramList.size(); i++)
      {
        Object localObject = localTs.m(i);
        if ((localObject instanceof String)) {
          this.a.a(paramInt, (String)localObject);
        } else {
          this.a.a(paramInt, (_r)localObject);
        }
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, (String)paramList.get(i));
      i++;
    }
  }
  
  public final void b(int paramInt, List<?> paramList, zt paramzt)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      a(paramInt, paramList.get(i), paramzt);
    }
  }
  
  public final void b(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += ls.f(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.a.b(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.a(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.b(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void c(int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.d(paramInt1, paramInt2);
  }
  
  public final void c(int paramInt, long paramLong)
    throws IOException
  {
    this.a.a(paramInt, paramLong);
  }
  
  public final void c(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += ls.k(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.a.b(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.a(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.b(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void d(int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.b(paramInt1, paramInt2);
  }
  
  public final void d(int paramInt, long paramLong)
    throws IOException
  {
    this.a.c(paramInt, paramLong);
  }
  
  public final void d(int paramInt, List<Long> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += ls.d(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.a.b(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.a(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void e(int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.b(paramInt1, paramInt2);
  }
  
  public final void e(int paramInt, long paramLong)
    throws IOException
  {
    this.a.a(paramInt, paramLong);
  }
  
  public final void e(int paramInt, List<Long> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += ls.h(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.a.b(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.c(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.c(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void f(int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.e(paramInt1, paramInt2);
  }
  
  public final void f(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += ls.i(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.a.b(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.d(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.e(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void g(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += ls.g(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.a.b(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.b(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.c(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void h(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += ls.j(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.a.b(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.d(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.e(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void i(int paramInt, List<Long> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += ls.g(((Long)paramList.get(i)).longValue());
        i++;
      }
      this.a.b(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.c(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.c(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void j(int paramInt, List<Long> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += ls.f(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.a.b(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.b(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.b(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void k(int paramInt, List<Long> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += ls.e(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.a.b(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.a(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void l(int paramInt, List<Integer> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += ls.h(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.a.b(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.c(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.d(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void m(int paramInt, List<Double> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += ls.b(((Double)paramList.get(i)).doubleValue());
        i++;
      }
      this.a.b(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.a(((Double)paramList.get(paramInt)).doubleValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, ((Double)paramList.get(i)).doubleValue());
      i++;
    }
  }
  
  public final void n(int paramInt, List<Float> paramList, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      this.a.a(paramInt, 2);
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += ls.b(((Float)paramList.get(i)).floatValue());
        i++;
      }
      this.a.b(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.a(((Float)paramList.get(paramInt)).floatValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.a(paramInt, ((Float)paramList.get(i)).floatValue());
      i++;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ns.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */