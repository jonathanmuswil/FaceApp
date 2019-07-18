import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class vs<FieldDescriptorType extends ys<FieldDescriptorType>>
{
  private static final vs a = new vs(true);
  private final Ct<FieldDescriptorType, Object> b;
  private boolean c;
  private boolean d = false;
  
  private vs()
  {
    this.b = Ct.a(16);
  }
  
  private vs(boolean paramBoolean)
  {
    this.b = Ct.a(0);
    i();
  }
  
  static int a(fu paramfu, int paramInt, Object paramObject)
  {
    int i = ls.e(paramInt);
    paramInt = i;
    if (paramfu == fu.j)
    {
      Gs.a((it)paramObject);
      paramInt = i << 1;
    }
    return paramInt + b(paramfu, paramObject);
  }
  
  private static Object a(Object paramObject)
  {
    if ((paramObject instanceof ot)) {
      return ((ot)paramObject).l();
    }
    if ((paramObject instanceof byte[]))
    {
      paramObject = (byte[])paramObject;
      byte[] arrayOfByte = new byte[paramObject.length];
      System.arraycopy(paramObject, 0, arrayOfByte, 0, paramObject.length);
      return arrayOfByte;
    }
    return paramObject;
  }
  
  private final Object a(FieldDescriptorType paramFieldDescriptorType)
  {
    paramFieldDescriptorType = this.b.get(paramFieldDescriptorType);
    if (!(paramFieldDescriptorType instanceof Ns)) {
      return paramFieldDescriptorType;
    }
    Ns.c();
    throw null;
  }
  
  /* Error */
  private static void a(fu paramfu, Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 88	Gs:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: getstatic 93	ws:a	[I
    //   8: aload_0
    //   9: invokevirtual 96	fu:a	()Lku;
    //   12: invokevirtual 102	java/lang/Enum:ordinal	()I
    //   15: iaload
    //   16: istore_2
    //   17: iconst_0
    //   18: istore_3
    //   19: iload_2
    //   20: tableswitch	default:+52->72, 1:+148->168, 2:+140->160, 3:+132->152, 4:+124->144, 5:+116->136, 6:+108->128, 7:+91->111, 8:+72->92, 9:+55->75
    //   72: goto +101 -> 173
    //   75: aload_1
    //   76: instanceof 51
    //   79: ifne +27 -> 106
    //   82: aload_1
    //   83: instanceof 80
    //   86: ifeq +87 -> 173
    //   89: goto +17 -> 106
    //   92: aload_1
    //   93: instanceof 104
    //   96: ifne +10 -> 106
    //   99: aload_1
    //   100: instanceof 106
    //   103: ifeq +70 -> 173
    //   106: iconst_1
    //   107: istore_3
    //   108: goto +65 -> 173
    //   111: aload_1
    //   112: instanceof 108
    //   115: ifne -9 -> 106
    //   118: aload_1
    //   119: instanceof 68
    //   122: ifeq +51 -> 173
    //   125: goto -19 -> 106
    //   128: aload_1
    //   129: instanceof 110
    //   132: istore_3
    //   133: goto +40 -> 173
    //   136: aload_1
    //   137: instanceof 112
    //   140: istore_3
    //   141: goto +32 -> 173
    //   144: aload_1
    //   145: instanceof 114
    //   148: istore_3
    //   149: goto +24 -> 173
    //   152: aload_1
    //   153: instanceof 116
    //   156: istore_3
    //   157: goto +16 -> 173
    //   160: aload_1
    //   161: instanceof 118
    //   164: istore_3
    //   165: goto +8 -> 173
    //   168: aload_1
    //   169: instanceof 104
    //   172: istore_3
    //   173: iload_3
    //   174: ifeq +4 -> 178
    //   177: return
    //   178: new 120	java/lang/IllegalArgumentException
    //   181: dup
    //   182: ldc 122
    //   184: invokespecial 125	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   187: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	paramfu	fu
    //   0	188	1	paramObject	Object
    //   16	4	2	i	int
    //   18	156	3	bool	boolean
  }
  
  private final void a(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    if (paramFieldDescriptorType.W())
    {
      if ((paramObject instanceof List))
      {
        ArrayList localArrayList = new ArrayList();
        localArrayList.addAll((List)paramObject);
        int i = localArrayList.size();
        int j = 0;
        while (j < i)
        {
          paramObject = localArrayList.get(j);
          j++;
          a(paramFieldDescriptorType.u(), paramObject);
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      a(paramFieldDescriptorType.u(), paramObject);
    }
    if ((paramObject instanceof Ns)) {
      this.d = true;
    }
    this.b.a(paramFieldDescriptorType, paramObject);
  }
  
  private static boolean a(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    ys localys = (ys)paramEntry.getKey();
    if (localys.U() == ku.i)
    {
      if (localys.W())
      {
        paramEntry = ((List)paramEntry.getValue()).iterator();
        do
        {
          if (!paramEntry.hasNext()) {
            break;
          }
        } while (((it)paramEntry.next()).isInitialized());
        return false;
      }
      paramEntry = paramEntry.getValue();
      if ((paramEntry instanceof it))
      {
        if (!((it)paramEntry).isInitialized()) {
          return false;
        }
      }
      else
      {
        if ((paramEntry instanceof Ns)) {
          return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    return true;
  }
  
  private static int b(fu paramfu, Object paramObject)
  {
    switch (ws.b[paramfu.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 18: 
      if ((paramObject instanceof Hs)) {
        return ls.k(((Hs)paramObject).m());
      }
      return ls.k(((Integer)paramObject).intValue());
    case 17: 
      return ls.f(((Long)paramObject).longValue());
    case 16: 
      return ls.h(((Integer)paramObject).intValue());
    case 15: 
      return ls.h(((Long)paramObject).longValue());
    case 14: 
      return ls.j(((Integer)paramObject).intValue());
    case 13: 
      return ls.g(((Integer)paramObject).intValue());
    case 12: 
      if ((paramObject instanceof _r)) {
        return ls.a((_r)paramObject);
      }
      return ls.b((byte[])paramObject);
    case 11: 
      if ((paramObject instanceof _r)) {
        return ls.a((_r)paramObject);
      }
      return ls.a((String)paramObject);
    case 10: 
      if ((paramObject instanceof Ns)) {
        return ls.a((Ns)paramObject);
      }
      return ls.a((it)paramObject);
    case 9: 
      return ls.b((it)paramObject);
    case 8: 
      return ls.b(((Boolean)paramObject).booleanValue());
    case 7: 
      return ls.i(((Integer)paramObject).intValue());
    case 6: 
      return ls.g(((Long)paramObject).longValue());
    case 5: 
      return ls.f(((Integer)paramObject).intValue());
    case 4: 
      return ls.e(((Long)paramObject).longValue());
    case 3: 
      return ls.d(((Long)paramObject).longValue());
    case 2: 
      return ls.b(((Float)paramObject).floatValue());
    }
    return ls.b(((Double)paramObject).doubleValue());
  }
  
  private static int b(ys<?> paramys, Object paramObject)
  {
    fu localfu = paramys.u();
    int i = paramys.m();
    if (paramys.W())
    {
      boolean bool = paramys.R();
      int j = 0;
      int k = 0;
      if (bool)
      {
        paramys = ((List)paramObject).iterator();
        while (paramys.hasNext()) {
          k += b(localfu, paramys.next());
        }
        return ls.e(i) + k + ls.l(k);
      }
      paramys = ((List)paramObject).iterator();
      k = j;
      while (paramys.hasNext()) {
        k += a(localfu, i, paramys.next());
      }
      return k;
    }
    return a(localfu, i, paramObject);
  }
  
  private final void b(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    ys localys = (ys)paramEntry.getKey();
    Object localObject1 = paramEntry.getValue();
    if (!(localObject1 instanceof Ns))
    {
      if (localys.W())
      {
        Object localObject2 = a(localys);
        paramEntry = (Map.Entry<FieldDescriptorType, Object>)localObject2;
        if (localObject2 == null) {
          paramEntry = new ArrayList();
        }
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = ((Iterator)localObject1).next();
          ((List)paramEntry).add(a(localObject2));
        }
        this.b.a(localys, paramEntry);
        return;
      }
      if (localys.U() == ku.i)
      {
        paramEntry = a(localys);
        if (paramEntry == null)
        {
          this.b.a(localys, a(localObject1));
          return;
        }
        if (!(paramEntry instanceof ot))
        {
          paramEntry = localys.a(((it)paramEntry).q(), (it)localObject1).F();
          this.b.a(localys, paramEntry);
          return;
        }
        localys.a((ot)paramEntry, (ot)localObject1);
        throw null;
      }
      this.b.a(localys, a(localObject1));
      return;
    }
    Ns.c();
    throw null;
  }
  
  private static int c(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    ys localys = (ys)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    if ((localys.U() == ku.i) && (!localys.W()) && (!localys.R()))
    {
      if ((localObject instanceof Ns)) {
        return ls.b(((ys)paramEntry.getKey()).m(), (Ns)localObject);
      }
      return ls.d(((ys)paramEntry.getKey()).m(), (it)localObject);
    }
    return b(localys, localObject);
  }
  
  public static <T extends ys<T>> vs<T> f()
  {
    return a;
  }
  
  final Iterator<Map.Entry<FieldDescriptorType, Object>> a()
  {
    if (this.d) {
      return new Qs(this.b.d().iterator());
    }
    return this.b.d().iterator();
  }
  
  public final void a(vs<FieldDescriptorType> paramvs)
  {
    for (int i = 0; i < paramvs.b.b(); i++) {
      b(paramvs.b.b(i));
    }
    paramvs = paramvs.b.c().iterator();
    while (paramvs.hasNext()) {
      b((Map.Entry)paramvs.next());
    }
  }
  
  final boolean b()
  {
    return this.b.isEmpty();
  }
  
  public final boolean c()
  {
    return this.c;
  }
  
  public final boolean d()
  {
    for (int i = 0; i < this.b.b(); i++) {
      if (!a(this.b.b(i))) {
        return false;
      }
    }
    Iterator localIterator = this.b.c().iterator();
    while (localIterator.hasNext()) {
      if (!a((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final Iterator<Map.Entry<FieldDescriptorType, Object>> e()
  {
    if (this.d) {
      return new Qs(this.b.entrySet().iterator());
    }
    return this.b.entrySet().iterator();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof vs)) {
      return false;
    }
    paramObject = (vs)paramObject;
    return this.b.equals(((vs)paramObject).b);
  }
  
  public final int g()
  {
    int i = 0;
    int j = 0;
    Map.Entry localEntry;
    while (i < this.b.b())
    {
      localEntry = this.b.b(i);
      j += b((ys)localEntry.getKey(), localEntry.getValue());
      i++;
    }
    Iterator localIterator = this.b.c().iterator();
    while (localIterator.hasNext())
    {
      localEntry = (Map.Entry)localIterator.next();
      j += b((ys)localEntry.getKey(), localEntry.getValue());
    }
    return j;
  }
  
  public final int h()
  {
    int i = 0;
    int j = 0;
    while (i < this.b.b())
    {
      j += c(this.b.b(i));
      i++;
    }
    Iterator localIterator = this.b.c().iterator();
    while (localIterator.hasNext()) {
      j += c((Map.Entry)localIterator.next());
    }
    return j;
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
  
  public final void i()
  {
    if (this.c) {
      return;
    }
    this.b.e();
    this.c = true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */