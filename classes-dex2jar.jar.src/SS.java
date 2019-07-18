import java.io.IOException;
import java.util.Map.Entry;

final class ss
  extends rs<Es.d>
{
  final int a(Map.Entry<?, ?> paramEntry)
  {
    return ((Es.d)paramEntry.getKey()).a;
  }
  
  final vs<Es.d> a(Object paramObject)
  {
    return ((Es.c)paramObject).zzjv;
  }
  
  final void a(Object paramObject, vs<Es.d> paramvs)
  {
    ((Es.c)paramObject).zzjv = paramvs;
  }
  
  final void a(lu paramlu, Map.Entry<?, ?> paramEntry)
    throws IOException
  {
    Es.d locald = (Es.d)paramEntry.getKey();
    switch (ts.a[locald.b.ordinal()])
    {
    default: 
      break;
    case 18: 
      paramlu.a(locald.a, paramEntry.getValue(), ut.a().a(paramEntry.getValue().getClass()));
      break;
    case 17: 
      paramlu.b(locald.a, paramEntry.getValue(), ut.a().a(paramEntry.getValue().getClass()));
      return;
    case 16: 
      paramlu.a(locald.a, (String)paramEntry.getValue());
      return;
    case 15: 
      paramlu.a(locald.a, (_r)paramEntry.getValue());
      return;
    case 14: 
      paramlu.d(locald.a, ((Integer)paramEntry.getValue()).intValue());
      return;
    case 13: 
      paramlu.a(locald.a, ((Long)paramEntry.getValue()).longValue());
      return;
    case 12: 
      paramlu.c(locald.a, ((Integer)paramEntry.getValue()).intValue());
      return;
    case 11: 
      paramlu.d(locald.a, ((Long)paramEntry.getValue()).longValue());
      return;
    case 10: 
      paramlu.f(locald.a, ((Integer)paramEntry.getValue()).intValue());
      return;
    case 9: 
      paramlu.b(locald.a, ((Integer)paramEntry.getValue()).intValue());
      return;
    case 8: 
      paramlu.a(locald.a, ((Boolean)paramEntry.getValue()).booleanValue());
      return;
    case 7: 
      paramlu.a(locald.a, ((Integer)paramEntry.getValue()).intValue());
      return;
    case 6: 
      paramlu.b(locald.a, ((Long)paramEntry.getValue()).longValue());
      return;
    case 5: 
      paramlu.d(locald.a, ((Integer)paramEntry.getValue()).intValue());
      return;
    case 4: 
      paramlu.c(locald.a, ((Long)paramEntry.getValue()).longValue());
      return;
    case 3: 
      paramlu.e(locald.a, ((Long)paramEntry.getValue()).longValue());
      return;
    case 2: 
      paramlu.a(locald.a, ((Float)paramEntry.getValue()).floatValue());
      return;
    case 1: 
      paramlu.a(locald.a, ((Double)paramEntry.getValue()).doubleValue());
    }
  }
  
  final boolean a(it paramit)
  {
    return paramit instanceof Es.c;
  }
  
  final vs<Es.d> b(Object paramObject)
  {
    vs localvs1 = a(paramObject);
    vs localvs2 = localvs1;
    if (localvs1.c())
    {
      localvs2 = (vs)localvs1.clone();
      a(paramObject, localvs2);
    }
    return localvs2;
  }
  
  final void c(Object paramObject)
  {
    a(paramObject).i();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ss.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */