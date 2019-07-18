import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class fx
  implements dz
{
  private final cx a;
  
  private fx(cx paramcx)
  {
    ux.a(paramcx, "output");
    this.a = ((cx)paramcx);
    this.a.c = this;
  }
  
  public static fx a(cx paramcx)
  {
    fx localfx = paramcx.c;
    if (localfx != null) {
      return localfx;
    }
    return new fx(paramcx);
  }
  
  public final int a()
  {
    return sx.d.l;
  }
  
  public final void a(int paramInt)
    throws IOException
  {
    this.a.a(paramInt, 3);
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
    this.a.d(paramInt1, paramInt2);
  }
  
  public final void a(int paramInt, long paramLong)
    throws IOException
  {
    this.a.b(paramInt, paramLong);
  }
  
  public final void a(int paramInt, Ow paramOw)
    throws IOException
  {
    this.a.a(paramInt, paramOw);
  }
  
  public final <K, V> void a(int paramInt, Vx<K, V> paramVx, Map<K, V> paramMap)
    throws IOException
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      this.a.a(paramInt, 2);
      this.a.i(Ux.a(paramVx, ((Map.Entry)localObject).getKey(), ((Map.Entry)localObject).getValue()));
      cx localcx = this.a;
      paramMap = ((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      lx.a(localcx, paramVx.a, 1, paramMap);
      lx.a(localcx, paramVx.c, 2, localObject);
    }
  }
  
  public final void a(int paramInt, Object paramObject)
    throws IOException
  {
    if ((paramObject instanceof Ow))
    {
      this.a.b(paramInt, (Ow)paramObject);
      return;
    }
    this.a.a(paramInt, (by)paramObject);
  }
  
  public final void a(int paramInt, Object paramObject, ry paramry)
    throws IOException
  {
    this.a.a(paramInt, (by)paramObject, paramry);
  }
  
  public final void a(int paramInt, String paramString)
    throws IOException
  {
    this.a.a(paramInt, paramString);
  }
  
  public final void a(int paramInt, List<Ow> paramList)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      this.a.a(paramInt, (Ow)paramList.get(i));
    }
  }
  
  public final void a(int paramInt, List<?> paramList, ry paramry)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      b(paramInt, paramList.get(i), paramry);
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
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += cx.b(((Boolean)paramList.get(i)).booleanValue());
        i++;
      }
      this.a.i(paramInt);
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
    this.a.a(paramInt, 4);
  }
  
  public final void b(int paramInt, long paramLong)
    throws IOException
  {
    this.a.c(paramInt, paramLong);
  }
  
  public final void b(int paramInt, Object paramObject, ry paramry)
    throws IOException
  {
    cx localcx = this.a;
    paramObject = (by)paramObject;
    localcx.a(paramInt, 3);
    paramry.a(paramObject, localcx.c);
    localcx.a(paramInt, 4);
  }
  
  public final void b(int paramInt, List<String> paramList)
    throws IOException
  {
    boolean bool = paramList instanceof Lx;
    int i = 0;
    int j = 0;
    if (bool)
    {
      Lx localLx = (Lx)paramList;
      for (i = j; i < paramList.size(); i++)
      {
        Object localObject = localLx.m(i);
        if ((localObject instanceof String)) {
          this.a.a(paramInt, (String)localObject);
        } else {
          this.a.a(paramInt, (Ow)localObject);
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
  
  public final void b(int paramInt, List<?> paramList, ry paramry)
    throws IOException
  {
    for (int i = 0; i < paramList.size(); i++) {
      a(paramInt, paramList.get(i), paramry);
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
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += cx.m(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.a.i(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.h(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.b(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
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
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += cx.e(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.a.i(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.h(((Integer)paramList.get(paramInt)).intValue());
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
    this.a.c(paramInt1, paramInt2);
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
        i += cx.d(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.a.i(i);
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
        i += cx.h(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.a.i(i);
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
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += cx.c(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.a.i(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.k(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.e(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void g(int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.e(paramInt1, paramInt2);
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
        paramInt += cx.a(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.a.i(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.i(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      this.a.c(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void h(int paramInt1, int paramInt2)
    throws IOException
  {
    this.a.b(paramInt1, paramInt2);
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
        paramInt += cx.d(((Integer)paramList.get(i)).intValue());
        i++;
      }
      this.a.i(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.k(((Integer)paramList.get(paramInt)).intValue());
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
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += cx.g(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      this.a.i(i);
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
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += cx.f(((Long)paramList.get(i)).longValue());
        i++;
      }
      this.a.i(paramInt);
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
      i = 0;
      paramInt = 0;
      while (i < paramList.size())
      {
        paramInt += cx.e(((Long)paramList.get(i)).longValue());
        i++;
      }
      this.a.i(paramInt);
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
        i += cx.b(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      this.a.i(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        this.a.j(((Integer)paramList.get(paramInt)).intValue());
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
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += cx.b(((Double)paramList.get(paramInt)).doubleValue());
        paramInt++;
      }
      this.a.i(i);
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
      paramInt = 0;
      i = 0;
      while (paramInt < paramList.size())
      {
        i += cx.b(((Float)paramList.get(paramInt)).floatValue());
        paramInt++;
      }
      this.a.i(i);
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


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */