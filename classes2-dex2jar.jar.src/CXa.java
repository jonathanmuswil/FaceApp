import java.util.HashMap;

final class cxa<T, R>
  implements DRa<T, R>
{
  cxa(dxa paramdxa) {}
  
  public final lxa.b a(YVa<Boolean, Qwa.c, ? extends Qwa.a> paramYVa)
  {
    oXa.b(paramYVa, "<name for destructuring parameter 0>");
    Object localObject1 = (Boolean)paramYVa.a();
    Qwa.c localc = (Qwa.c)paramYVa.b();
    Object localObject2 = (Qwa.a)paramYVa.c();
    if ((oXa.a(localObject2, Qwa.a.a.a) ^ true)) {
      if (!(localc.b() instanceof lxa.b.b))
      {
        oXa.a(localObject1, "beforeRequested");
        if (!((Boolean)localObject1).booleanValue()) {}
      }
      else
      {
        paramYVa = Qwa.a(this.a.a).get(localc.a());
        if (paramYVa != null)
        {
          APa localAPa = (APa)paramYVa;
          boolean bool = Qwa.a(this.a.a, localAPa);
          lxa.d locald = Qwa.a(this.a.a, localc.a(), localc.c(), bool);
          paramYVa = (YVa<Boolean, Qwa.c, ? extends Qwa.a>)localObject2;
          if (!(localObject2 instanceof Qwa.a.c)) {
            paramYVa = null;
          }
          paramYVa = (Qwa.a.c)paramYVa;
          if (paramYVa != null) {
            paramYVa = paramYVa.a();
          } else {
            paramYVa = null;
          }
          localObject1 = localc.b();
          localObject2 = localObject1;
          if (!(localObject1 instanceof lxa.b.b)) {
            localObject2 = null;
          }
          localObject2 = (lxa.b.b)localObject2;
          if (localObject2 != null) {
            localObject2 = Float.valueOf(((lxa.b.b)localObject2).a());
          } else {
            localObject2 = null;
          }
          return new lxa.b.a.b(localc.a(), locald, paramYVa, localAPa, (Float)localObject2);
        }
        throw new IllegalArgumentException("Required value was null.");
      }
    }
    paramYVa = localc.b();
    return paramYVa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */