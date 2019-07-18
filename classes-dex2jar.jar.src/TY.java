import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.AbstractMap;
import java.util.List;

final class ty
{
  private static final Class<?> a = ;
  private static final Ky<?, ?> b = a(false);
  private static final Ky<?, ?> c = a(true);
  private static final Ky<?, ?> d = new My();
  
  static int a(int paramInt, Object paramObject, ry paramry)
  {
    if ((paramObject instanceof Jx)) {
      return cx.a(paramInt, (Jx)paramObject);
    }
    return cx.b(paramInt, (by)paramObject, paramry);
  }
  
  static int a(int paramInt, List<?> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    int m = cx.l(paramInt) * i;
    paramInt = m;
    Object localObject;
    if ((paramList instanceof Lx))
    {
      localObject = (Lx)paramList;
      paramInt = m;
      for (j = k;; j++)
      {
        m = paramInt;
        if (j >= i) {
          break;
        }
        paramList = ((Lx)localObject).m(j);
        if ((paramList instanceof Ow)) {
          m = cx.b((Ow)paramList);
        } else {
          m = cx.b((String)paramList);
        }
        paramInt += m;
      }
    }
    for (;;)
    {
      m = paramInt;
      if (j >= i) {
        break;
      }
      localObject = paramList.get(j);
      if ((localObject instanceof Ow)) {
        m = cx.b((Ow)localObject);
      } else {
        m = cx.b((String)localObject);
      }
      paramInt += m;
      j++;
    }
    return m;
  }
  
  static int a(int paramInt, List<?> paramList, ry paramry)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    paramInt = cx.l(paramInt) * i;
    while (j < i)
    {
      Object localObject = paramList.get(j);
      int k;
      if ((localObject instanceof Jx)) {
        k = cx.a((Jx)localObject);
      } else {
        k = cx.a((by)localObject, paramry);
      }
      paramInt += k;
      j++;
    }
    return paramInt;
  }
  
  static int a(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    if (paramList.size() == 0) {
      return 0;
    }
    return a(paramList) + paramList.size() * cx.l(paramInt);
  }
  
  static int a(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof Qx))
    {
      paramList = (Qx)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += cx.d(paramList.getLong(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += cx.d(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static Ky<?, ?> a()
  {
    return b;
  }
  
  private static Ky<?, ?> a(boolean paramBoolean)
  {
    try
    {
      Object localObject = e();
      if (localObject == null) {
        return null;
      }
      localObject = (Ky)((Class)localObject).getConstructor(new Class[] { Boolean.TYPE }).newInstance(new Object[] { Boolean.valueOf(paramBoolean) });
      return (Ky<?, ?>)localObject;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static void a(int paramInt, List<String> paramList, dz paramdz)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.b(paramInt, paramList);
    }
  }
  
  public static void a(int paramInt, List<?> paramList, dz paramdz, ry paramry)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.b(paramInt, paramList, paramry);
    }
  }
  
  public static void a(int paramInt, List<Double> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.m(paramInt, paramList, paramBoolean);
    }
  }
  
  static <T, UT, UB> void a(Ky<UT, UB> paramKy, T paramT1, T paramT2)
  {
    paramKy.a(paramT1, paramKy.b(paramKy.c(paramT1), paramKy.c(paramT2)));
  }
  
  static <T> void a(Xx paramXx, T paramT1, T paramT2, long paramLong)
  {
    Qy.a(paramT1, paramLong, paramXx.b(Qy.f(paramT1, paramLong), Qy.f(paramT2, paramLong)));
  }
  
  static <T, FT extends nx<FT>> void a(ix<FT> paramix, T paramT1, T paramT2)
  {
    paramT2 = paramix.a(paramT2);
    if (!paramT2.b.isEmpty()) {
      paramix.b(paramT1).a(paramT2);
    }
  }
  
  public static void a(Class<?> paramClass)
  {
    if (!sx.class.isAssignableFrom(paramClass))
    {
      Class localClass = a;
      if ((localClass != null) && (!localClass.isAssignableFrom(paramClass))) {
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
      }
    }
  }
  
  static boolean a(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  static int b(int paramInt, List<Ow> paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    i *= cx.l(paramInt);
    paramInt = j;
    j = i;
    while (paramInt < paramList.size())
    {
      j += cx.b((Ow)paramList.get(paramInt));
      paramInt++;
    }
    return j;
  }
  
  static int b(int paramInt, List<by> paramList, ry paramry)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = 0;
    while (j < i)
    {
      k += cx.c(paramInt, (by)paramList.get(j), paramry);
      j++;
    }
    return k;
  }
  
  static int b(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return b(paramList) + i * cx.l(paramInt);
  }
  
  static int b(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof Qx))
    {
      paramList = (Qx)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += cx.e(paramList.getLong(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += cx.e(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static Ky<?, ?> b()
  {
    return c;
  }
  
  public static void b(int paramInt, List<Ow> paramList, dz paramdz)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.a(paramInt, paramList);
    }
  }
  
  public static void b(int paramInt, List<?> paramList, dz paramdz, ry paramry)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.a(paramInt, paramList, paramry);
    }
  }
  
  public static void b(int paramInt, List<Float> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.n(paramInt, paramList, paramBoolean);
    }
  }
  
  static int c(int paramInt, List<Long> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return c(paramList) + i * cx.l(paramInt);
  }
  
  static int c(List<Long> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof Qx))
    {
      paramList = (Qx)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += cx.f(paramList.getLong(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += cx.f(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static Ky<?, ?> c()
  {
    return d;
  }
  
  public static void c(int paramInt, List<Long> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.d(paramInt, paramList, paramBoolean);
    }
  }
  
  static int d(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return d(paramList) + i * cx.l(paramInt);
  }
  
  static int d(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof tx))
    {
      paramList = (tx)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += cx.e(paramList.getInt(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += cx.e(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  private static Class<?> d()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.GeneratedMessage");
      return localClass;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static void d(int paramInt, List<Long> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.k(paramInt, paramList, paramBoolean);
    }
  }
  
  static int e(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return e(paramList) + i * cx.l(paramInt);
  }
  
  static int e(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof tx))
    {
      paramList = (tx)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += cx.m(paramList.getInt(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += cx.m(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  private static Class<?> e()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
      return localClass;
    }
    catch (Throwable localThrowable) {}
    return null;
  }
  
  public static void e(int paramInt, List<Long> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.j(paramInt, paramList, paramBoolean);
    }
  }
  
  static int f(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return f(paramList) + i * cx.l(paramInt);
  }
  
  static int f(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof tx))
    {
      paramList = (tx)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += cx.a(paramList.getInt(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += cx.a(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void f(int paramInt, List<Long> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.i(paramInt, paramList, paramBoolean);
    }
  }
  
  static int g(int paramInt, List<Integer> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return g(paramList) + i * cx.l(paramInt);
  }
  
  static int g(List<Integer> paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof tx))
    {
      paramList = (tx)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += cx.b(paramList.getInt(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += cx.b(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void g(int paramInt, List<Long> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.e(paramInt, paramList, paramBoolean);
    }
  }
  
  static int h(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * cx.i(paramInt, 0);
  }
  
  static int h(List<?> paramList)
  {
    return paramList.size() << 2;
  }
  
  public static void h(int paramInt, List<Integer> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.b(paramInt, paramList, paramBoolean);
    }
  }
  
  static int i(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * cx.g(paramInt, 0L);
  }
  
  static int i(List<?> paramList)
  {
    return paramList.size() << 3;
  }
  
  public static void i(int paramInt, List<Integer> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.g(paramInt, paramList, paramBoolean);
    }
  }
  
  static int j(int paramInt, List<?> paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * cx.b(paramInt, true);
  }
  
  static int j(List<?> paramList)
  {
    return paramList.size();
  }
  
  public static void j(int paramInt, List<Integer> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.l(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void k(int paramInt, List<Integer> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.f(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void l(int paramInt, List<Integer> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.h(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void m(int paramInt, List<Integer> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.c(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void n(int paramInt, List<Boolean> paramList, dz paramdz, boolean paramBoolean)
    throws IOException
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramdz.a(paramInt, paramList, paramBoolean);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ty.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */