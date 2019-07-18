import com.bumptech.glide.load.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class gh
{
  private static final gh.c a = new gh.c();
  private static final ch<Object, Object> b = new gh.a();
  private final List<gh.b<?, ?>> c = new ArrayList();
  private final gh.c d;
  private final Set<gh.b<?, ?>> e = new HashSet();
  private final qd<List<Throwable>> f;
  
  public gh(qd<List<Throwable>> paramqd)
  {
    this(paramqd, a);
  }
  
  gh(qd<List<Throwable>> paramqd, gh.c paramc)
  {
    this.f = paramqd;
    this.d = paramc;
  }
  
  private static <Model, Data> ch<Model, Data> a()
  {
    return b;
  }
  
  private <Model, Data> ch<Model, Data> a(gh.b<?, ?> paramb)
  {
    paramb = paramb.c.a(this);
    Nj.a(paramb);
    return (ch)paramb;
  }
  
  private <Model, Data> void a(Class<Model> paramClass, Class<Data> paramClass1, dh<? extends Model, ? extends Data> paramdh, boolean paramBoolean)
  {
    paramClass1 = new gh.b(paramClass, paramClass1, paramdh);
    paramClass = this.c;
    int i;
    if (paramBoolean) {
      i = paramClass.size();
    } else {
      i = 0;
    }
    paramClass.add(i, paramClass1);
  }
  
  /* Error */
  public <Model, Data> ch<Model, Data> a(Class<Model> paramClass, Class<Data> paramClass1)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 45	java/util/ArrayList
    //   5: astore_3
    //   6: aload_3
    //   7: invokespecial 46	java/util/ArrayList:<init>	()V
    //   10: aload_0
    //   11: getfield 48	gh:c	Ljava/util/List;
    //   14: invokeinterface 99 1 0
    //   19: astore 4
    //   21: iconst_0
    //   22: istore 5
    //   24: aload 4
    //   26: invokeinterface 105 1 0
    //   31: ifeq +85 -> 116
    //   34: aload 4
    //   36: invokeinterface 109 1 0
    //   41: checkcast 9	gh$b
    //   44: astore 6
    //   46: aload_0
    //   47: getfield 53	gh:e	Ljava/util/Set;
    //   50: aload 6
    //   52: invokeinterface 115 2 0
    //   57: ifeq +9 -> 66
    //   60: iconst_1
    //   61: istore 5
    //   63: goto -39 -> 24
    //   66: aload 6
    //   68: aload_1
    //   69: aload_2
    //   70: invokevirtual 118	gh$b:a	(Ljava/lang/Class;Ljava/lang/Class;)Z
    //   73: ifeq -49 -> 24
    //   76: aload_0
    //   77: getfield 53	gh:e	Ljava/util/Set;
    //   80: aload 6
    //   82: invokeinterface 120 2 0
    //   87: pop
    //   88: aload_3
    //   89: aload_0
    //   90: aload 6
    //   92: invokespecial 122	gh:a	(Lgh$b;)Lch;
    //   95: invokeinterface 123 2 0
    //   100: pop
    //   101: aload_0
    //   102: getfield 53	gh:e	Ljava/util/Set;
    //   105: aload 6
    //   107: invokeinterface 126 2 0
    //   112: pop
    //   113: goto -89 -> 24
    //   116: aload_3
    //   117: invokeinterface 87 1 0
    //   122: iconst_1
    //   123: if_icmple +20 -> 143
    //   126: aload_0
    //   127: getfield 57	gh:d	Lgh$c;
    //   130: aload_3
    //   131: aload_0
    //   132: getfield 55	gh:f	Lqd;
    //   135: invokevirtual 129	gh$c:a	(Ljava/util/List;Lqd;)Lfh;
    //   138: astore_1
    //   139: aload_0
    //   140: monitorexit
    //   141: aload_1
    //   142: areturn
    //   143: aload_3
    //   144: invokeinterface 87 1 0
    //   149: iconst_1
    //   150: if_icmpne +18 -> 168
    //   153: aload_3
    //   154: iconst_0
    //   155: invokeinterface 133 2 0
    //   160: checkcast 76	ch
    //   163: astore_1
    //   164: aload_0
    //   165: monitorexit
    //   166: aload_1
    //   167: areturn
    //   168: iload 5
    //   170: ifeq +11 -> 181
    //   173: invokestatic 135	gh:a	()Lch;
    //   176: astore_1
    //   177: aload_0
    //   178: monitorexit
    //   179: aload_1
    //   180: areturn
    //   181: new 137	Ge$c
    //   184: astore_3
    //   185: aload_3
    //   186: aload_1
    //   187: aload_2
    //   188: invokespecial 140	Ge$c:<init>	(Ljava/lang/Class;Ljava/lang/Class;)V
    //   191: aload_3
    //   192: athrow
    //   193: astore_1
    //   194: goto +15 -> 209
    //   197: astore_1
    //   198: aload_0
    //   199: getfield 53	gh:e	Ljava/util/Set;
    //   202: invokeinterface 143 1 0
    //   207: aload_1
    //   208: athrow
    //   209: aload_0
    //   210: monitorexit
    //   211: aload_1
    //   212: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	213	0	this	gh
    //   0	213	1	paramClass	Class<Model>
    //   0	213	2	paramClass1	Class<Data>
    //   5	187	3	localObject	Object
    //   19	16	4	localIterator	Iterator
    //   22	147	5	i	int
    //   44	62	6	localb	gh.b
    // Exception table:
    //   from	to	target	type
    //   2	21	193	finally
    //   24	60	193	finally
    //   66	113	193	finally
    //   116	139	193	finally
    //   143	164	193	finally
    //   173	177	193	finally
    //   181	193	193	finally
    //   198	209	193	finally
    //   2	21	197	java/lang/Throwable
    //   24	60	197	java/lang/Throwable
    //   66	113	197	java/lang/Throwable
    //   116	139	197	java/lang/Throwable
    //   143	164	197	java/lang/Throwable
    //   173	177	197	java/lang/Throwable
    //   181	193	197	java/lang/Throwable
  }
  
  /* Error */
  <Model> List<ch<Model, ?>> a(Class<Model> paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 45	java/util/ArrayList
    //   5: astore_2
    //   6: aload_2
    //   7: invokespecial 46	java/util/ArrayList:<init>	()V
    //   10: aload_0
    //   11: getfield 48	gh:c	Ljava/util/List;
    //   14: invokeinterface 99 1 0
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface 105 1 0
    //   26: ifeq +80 -> 106
    //   29: aload_3
    //   30: invokeinterface 109 1 0
    //   35: checkcast 9	gh$b
    //   38: astore 4
    //   40: aload_0
    //   41: getfield 53	gh:e	Ljava/util/Set;
    //   44: aload 4
    //   46: invokeinterface 115 2 0
    //   51: ifeq +6 -> 57
    //   54: goto -34 -> 20
    //   57: aload 4
    //   59: aload_1
    //   60: invokevirtual 148	gh$b:a	(Ljava/lang/Class;)Z
    //   63: ifeq -43 -> 20
    //   66: aload_0
    //   67: getfield 53	gh:e	Ljava/util/Set;
    //   70: aload 4
    //   72: invokeinterface 120 2 0
    //   77: pop
    //   78: aload_2
    //   79: aload_0
    //   80: aload 4
    //   82: invokespecial 122	gh:a	(Lgh$b;)Lch;
    //   85: invokeinterface 123 2 0
    //   90: pop
    //   91: aload_0
    //   92: getfield 53	gh:e	Ljava/util/Set;
    //   95: aload 4
    //   97: invokeinterface 126 2 0
    //   102: pop
    //   103: goto -83 -> 20
    //   106: aload_0
    //   107: monitorexit
    //   108: aload_2
    //   109: areturn
    //   110: astore_1
    //   111: goto +15 -> 126
    //   114: astore_1
    //   115: aload_0
    //   116: getfield 53	gh:e	Ljava/util/Set;
    //   119: invokeinterface 143 1 0
    //   124: aload_1
    //   125: athrow
    //   126: aload_0
    //   127: monitorexit
    //   128: aload_1
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	gh
    //   0	130	1	paramClass	Class<Model>
    //   5	104	2	localArrayList	ArrayList
    //   19	11	3	localIterator	Iterator
    //   38	58	4	localb	gh.b
    // Exception table:
    //   from	to	target	type
    //   2	20	110	finally
    //   20	54	110	finally
    //   57	103	110	finally
    //   115	126	110	finally
    //   2	20	114	java/lang/Throwable
    //   20	54	114	java/lang/Throwable
    //   57	103	114	java/lang/Throwable
  }
  
  <Model, Data> void a(Class<Model> paramClass, Class<Data> paramClass1, dh<? extends Model, ? extends Data> paramdh)
  {
    try
    {
      a(paramClass, paramClass1, paramdh, true);
      return;
    }
    finally
    {
      paramClass = finally;
      throw paramClass;
    }
  }
  
  List<Class<?>> b(Class<?> paramClass)
  {
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = this.c.iterator();
      while (localIterator.hasNext())
      {
        gh.b localb = (gh.b)localIterator.next();
        if ((!localArrayList.contains(localb.b)) && (localb.a(paramClass))) {
          localArrayList.add(localb.b);
        }
      }
      return localArrayList;
    }
    finally {}
  }
  
  private static class a
    implements ch<Object, Object>
  {
    public ch.a<Object> a(Object paramObject, int paramInt1, int paramInt2, j paramj)
    {
      return null;
    }
    
    public boolean a(Object paramObject)
    {
      return false;
    }
  }
  
  private static class b<Model, Data>
  {
    private final Class<Model> a;
    final Class<Data> b;
    final dh<? extends Model, ? extends Data> c;
    
    public b(Class<Model> paramClass, Class<Data> paramClass1, dh<? extends Model, ? extends Data> paramdh)
    {
      this.a = paramClass;
      this.b = paramClass1;
      this.c = paramdh;
    }
    
    public boolean a(Class<?> paramClass)
    {
      return this.a.isAssignableFrom(paramClass);
    }
    
    public boolean a(Class<?> paramClass1, Class<?> paramClass2)
    {
      boolean bool;
      if ((a(paramClass1)) && (this.b.isAssignableFrom(paramClass2))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  static class c
  {
    public <Model, Data> fh<Model, Data> a(List<ch<Model, Data>> paramList, qd<List<Throwable>> paramqd)
    {
      return new fh(paramList, paramqd);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/gh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */