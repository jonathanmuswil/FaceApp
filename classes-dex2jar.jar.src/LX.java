import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

final class lx<FieldDescriptorType extends nx<FieldDescriptorType>>
{
  private static final lx a = new lx(true);
  final uy<FieldDescriptorType, Object> b;
  private boolean c;
  private boolean d = false;
  
  private lx()
  {
    this.b = uy.a(16);
  }
  
  private lx(boolean paramBoolean)
  {
    this.b = uy.a(0);
    e();
  }
  
  static int a(Yy paramYy, int paramInt, Object paramObject)
  {
    int i = cx.l(paramInt);
    paramInt = i;
    if (paramYy == Yy.j)
    {
      ux.a((by)paramObject);
      paramInt = i << 1;
    }
    return paramInt + b(paramYy, paramObject);
  }
  
  public static int a(nx<?> paramnx, Object paramObject)
  {
    Yy localYy = paramnx.ia();
    int i = paramnx.o();
    if (paramnx.r())
    {
      boolean bool = paramnx.s();
      int j = 0;
      int k = 0;
      if (bool)
      {
        paramnx = ((List)paramObject).iterator();
        while (paramnx.hasNext()) {
          k += b(localYy, paramnx.next());
        }
        return cx.l(i) + k + cx.g(k);
      }
      paramnx = ((List)paramObject).iterator();
      k = j;
      while (paramnx.hasNext()) {
        k += a(localYy, i, paramnx.next());
      }
      return k;
    }
    return a(localYy, i, paramObject);
  }
  
  private static Object a(Object paramObject)
  {
    if ((paramObject instanceof iy)) {
      return ((iy)paramObject).E();
    }
    if ((paramObject instanceof byte[]))
    {
      byte[] arrayOfByte = (byte[])paramObject;
      paramObject = new byte[arrayOfByte.length];
      System.arraycopy(arrayOfByte, 0, paramObject, 0, arrayOfByte.length);
      return paramObject;
    }
    return paramObject;
  }
  
  private final Object a(FieldDescriptorType paramFieldDescriptorType)
  {
    paramFieldDescriptorType = this.b.get(paramFieldDescriptorType);
    if (!(paramFieldDescriptorType instanceof Fx)) {
      return paramFieldDescriptorType;
    }
    Fx.c();
    throw null;
  }
  
  /* Error */
  private static void a(Yy paramYy, Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 127	ux:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: getstatic 132	mx:a	[I
    //   8: aload_0
    //   9: invokevirtual 135	Yy:a	()Lcz;
    //   12: invokevirtual 140	java/lang/Enum:ordinal	()I
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
    //   83: instanceof 120
    //   86: ifeq +87 -> 173
    //   89: goto +17 -> 106
    //   92: aload_1
    //   93: instanceof 142
    //   96: ifne +10 -> 106
    //   99: aload_1
    //   100: instanceof 144
    //   103: ifeq +70 -> 173
    //   106: iconst_1
    //   107: istore_3
    //   108: goto +65 -> 173
    //   111: aload_1
    //   112: instanceof 146
    //   115: ifne -9 -> 106
    //   118: aload_1
    //   119: instanceof 108
    //   122: ifeq +51 -> 173
    //   125: goto -19 -> 106
    //   128: aload_1
    //   129: instanceof 148
    //   132: istore_3
    //   133: goto +40 -> 173
    //   136: aload_1
    //   137: instanceof 150
    //   140: istore_3
    //   141: goto +32 -> 173
    //   144: aload_1
    //   145: instanceof 152
    //   148: istore_3
    //   149: goto +24 -> 173
    //   152: aload_1
    //   153: instanceof 154
    //   156: istore_3
    //   157: goto +16 -> 173
    //   160: aload_1
    //   161: instanceof 156
    //   164: istore_3
    //   165: goto +8 -> 173
    //   168: aload_1
    //   169: instanceof 142
    //   172: istore_3
    //   173: iload_3
    //   174: ifeq +4 -> 178
    //   177: return
    //   178: new 158	java/lang/IllegalArgumentException
    //   181: dup
    //   182: ldc -96
    //   184: invokespecial 163	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   187: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	188	0	paramYy	Yy
    //   0	188	1	paramObject	Object
    //   16	4	2	i	int
    //   18	156	3	bool	boolean
  }
  
  static void a(cx paramcx, Yy paramYy, int paramInt, Object paramObject)
    throws IOException
  {
    if (paramYy == Yy.j)
    {
      paramYy = (by)paramObject;
      ux.a(paramYy);
      paramcx.a(paramInt, 3);
      paramYy.a(paramcx);
      paramcx.a(paramInt, 4);
      return;
    }
    paramcx.a(paramInt, paramYy.b());
    switch (mx.b[paramYy.ordinal()])
    {
    default: 
      break;
    case 18: 
      if ((paramObject instanceof vx))
      {
        paramcx.h(((vx)paramObject).o());
        return;
      }
      paramcx.h(((Integer)paramObject).intValue());
      break;
    case 17: 
      paramcx.b(((Long)paramObject).longValue());
      return;
    case 16: 
      paramcx.j(((Integer)paramObject).intValue());
      return;
    case 15: 
      paramcx.c(((Long)paramObject).longValue());
      return;
    case 14: 
      paramcx.k(((Integer)paramObject).intValue());
      return;
    case 13: 
      paramcx.i(((Integer)paramObject).intValue());
      return;
    case 12: 
      if ((paramObject instanceof Ow))
      {
        paramcx.a((Ow)paramObject);
        return;
      }
      paramYy = (byte[])paramObject;
      paramcx.b(paramYy, 0, paramYy.length);
      return;
    case 11: 
      if ((paramObject instanceof Ow))
      {
        paramcx.a((Ow)paramObject);
        return;
      }
      paramcx.a((String)paramObject);
      return;
    case 10: 
      paramcx.a((by)paramObject);
      return;
    case 9: 
      ((by)paramObject).a(paramcx);
      return;
    case 8: 
      paramcx.a(((Boolean)paramObject).booleanValue());
      return;
    case 7: 
      paramcx.k(((Integer)paramObject).intValue());
      return;
    case 6: 
      paramcx.c(((Long)paramObject).longValue());
      return;
    case 5: 
      paramcx.h(((Integer)paramObject).intValue());
      return;
    case 4: 
      paramcx.a(((Long)paramObject).longValue());
      return;
    case 3: 
      paramcx.a(((Long)paramObject).longValue());
      return;
    case 2: 
      paramcx.a(((Float)paramObject).floatValue());
      return;
    case 1: 
      paramcx.a(((Double)paramObject).doubleValue());
    }
  }
  
  private static boolean a(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    nx localnx = (nx)paramEntry.getKey();
    if (localnx.ja() == cz.i)
    {
      if (localnx.r())
      {
        paramEntry = ((List)paramEntry.getValue()).iterator();
        do
        {
          if (!paramEntry.hasNext()) {
            break;
          }
        } while (((by)paramEntry.next()).isInitialized());
        return false;
      }
      paramEntry = paramEntry.getValue();
      if ((paramEntry instanceof by))
      {
        if (!((by)paramEntry).isInitialized()) {
          return false;
        }
      }
      else
      {
        if ((paramEntry instanceof Fx)) {
          return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    return true;
  }
  
  private static int b(Yy paramYy, Object paramObject)
  {
    switch (mx.b[paramYy.ordinal()])
    {
    default: 
      throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
    case 18: 
      if ((paramObject instanceof vx)) {
        return cx.e(((vx)paramObject).o());
      }
      return cx.e(((Integer)paramObject).intValue());
    case 17: 
      return cx.f(((Long)paramObject).longValue());
    case 16: 
      return cx.b(((Integer)paramObject).intValue());
    case 15: 
      return cx.h(((Long)paramObject).longValue());
    case 14: 
      return cx.d(((Integer)paramObject).intValue());
    case 13: 
      return cx.a(((Integer)paramObject).intValue());
    case 12: 
      if ((paramObject instanceof Ow)) {
        return cx.b((Ow)paramObject);
      }
      return cx.b((byte[])paramObject);
    case 11: 
      if ((paramObject instanceof Ow)) {
        return cx.b((Ow)paramObject);
      }
      return cx.b((String)paramObject);
    case 10: 
      if ((paramObject instanceof Fx)) {
        return cx.a((Fx)paramObject);
      }
      return cx.b((by)paramObject);
    case 9: 
      return cx.c((by)paramObject);
    case 8: 
      return cx.b(((Boolean)paramObject).booleanValue());
    case 7: 
      return cx.c(((Integer)paramObject).intValue());
    case 6: 
      return cx.g(((Long)paramObject).longValue());
    case 5: 
      return cx.m(((Integer)paramObject).intValue());
    case 4: 
      return cx.e(((Long)paramObject).longValue());
    case 3: 
      return cx.d(((Long)paramObject).longValue());
    case 2: 
      return cx.b(((Float)paramObject).floatValue());
    }
    return cx.b(((Double)paramObject).doubleValue());
  }
  
  private final void b(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    nx localnx = (nx)paramEntry.getKey();
    Object localObject1 = paramEntry.getValue();
    if (!(localObject1 instanceof Fx))
    {
      if (localnx.r())
      {
        Object localObject2 = a(localnx);
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
        this.b.a(localnx, paramEntry);
        return;
      }
      if (localnx.ja() == cz.i)
      {
        paramEntry = a(localnx);
        if (paramEntry == null)
        {
          this.b.a(localnx, a(localObject1));
          return;
        }
        if ((paramEntry instanceof iy)) {
          paramEntry = localnx.a((iy)paramEntry, (iy)localObject1);
        } else {
          paramEntry = localnx.a(((by)paramEntry).b(), (by)localObject1).O();
        }
        this.b.a(localnx, paramEntry);
        return;
      }
      this.b.a(localnx, a(localObject1));
      return;
    }
    Fx.c();
    throw null;
  }
  
  private final void b(FieldDescriptorType paramFieldDescriptorType, Object paramObject)
  {
    if (paramFieldDescriptorType.r())
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
          a(paramFieldDescriptorType.ia(), paramObject);
        }
        paramObject = localArrayList;
      }
      else
      {
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
      }
    }
    else {
      a(paramFieldDescriptorType.ia(), paramObject);
    }
    if ((paramObject instanceof Fx)) {
      this.d = true;
    }
    this.b.a(paramFieldDescriptorType, paramObject);
  }
  
  private static int c(Map.Entry<FieldDescriptorType, Object> paramEntry)
  {
    nx localnx = (nx)paramEntry.getKey();
    Object localObject = paramEntry.getValue();
    if ((localnx.ja() == cz.i) && (!localnx.r()) && (!localnx.s()))
    {
      if ((localObject instanceof Fx)) {
        return cx.b(((nx)paramEntry.getKey()).o(), (Fx)localObject);
      }
      return cx.b(((nx)paramEntry.getKey()).o(), (by)localObject);
    }
    return a(localnx, localObject);
  }
  
  public static <T extends nx<T>> lx<T> f()
  {
    return a;
  }
  
  final Iterator<Map.Entry<FieldDescriptorType, Object>> a()
  {
    if (this.d) {
      return new Ix(this.b.e().iterator());
    }
    return this.b.e().iterator();
  }
  
  public final void a(lx<FieldDescriptorType> paramlx)
  {
    for (int i = 0; i < paramlx.b.c(); i++) {
      b(paramlx.b.b(i));
    }
    paramlx = paramlx.b.d().iterator();
    while (paramlx.hasNext()) {
      b((Map.Entry)paramlx.next());
    }
  }
  
  public final boolean b()
  {
    return this.c;
  }
  
  public final boolean c()
  {
    for (int i = 0; i < this.b.c(); i++) {
      if (!a(this.b.b(i))) {
        return false;
      }
    }
    Iterator localIterator = this.b.d().iterator();
    while (localIterator.hasNext()) {
      if (!a((Map.Entry)localIterator.next())) {
        return false;
      }
    }
    return true;
  }
  
  public final Iterator<Map.Entry<FieldDescriptorType, Object>> d()
  {
    if (this.d) {
      return new Ix(this.b.entrySet().iterator());
    }
    return this.b.entrySet().iterator();
  }
  
  public final void e()
  {
    if (this.c) {
      return;
    }
    this.b.b();
    this.c = true;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof lx)) {
      return false;
    }
    paramObject = (lx)paramObject;
    return this.b.equals(((lx)paramObject).b);
  }
  
  public final int g()
  {
    int i = 0;
    int j = 0;
    while (i < this.b.c())
    {
      j += c(this.b.b(i));
      i++;
    }
    Iterator localIterator = this.b.d().iterator();
    while (localIterator.hasNext()) {
      j += c((Map.Entry)localIterator.next());
    }
    return j;
  }
  
  public final int hashCode()
  {
    return this.b.hashCode();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */