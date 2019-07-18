import java.util.Arrays;

public final class Rfa$a
{
  static
  {
    rXa localrXa = new rXa(vXa.a(a.class), "SERVER_500_EXCEPTION", "getSERVER_500_EXCEPTION()Lretrofit2/HttpException;");
    vXa.a(localrXa);
    a = new XXa[] { localrXa };
  }
  
  public final Rfa.f a(String paramString, int paramInt)
  {
    oXa.b(paramString, "errorCode");
    if (Rfa.f.b.e.a(paramString, paramInt)) {
      return Rfa.f.b.e;
    }
    if (Rfa.f.c.e.a(paramString, paramInt)) {
      return Rfa.f.c.e;
    }
    if (Rfa.f.d.e.a(paramString, paramInt)) {
      return Rfa.f.d.e;
    }
    if (Rfa.f.e.e.a(paramString, paramInt)) {
      return Rfa.f.e.e;
    }
    if (Rfa.f.h.e.a(paramString, paramInt)) {
      return Rfa.f.h.e;
    }
    if (Rfa.f.i.e.a(paramString, paramInt)) {
      return Rfa.f.i.e;
    }
    if (Rfa.f.j.e.a(paramString, paramInt)) {
      return Rfa.f.j.e;
    }
    if (Rfa.f.l.e.a(paramString, paramInt)) {
      return Rfa.f.l.e;
    }
    if (Rfa.f.a.e.a(paramString, paramInt)) {
      return Rfa.f.a.e;
    }
    if (Rfa.f.m.e.a(paramString, paramInt)) {
      return Rfa.f.m.e;
    }
    if (Rfa.f.n.e.a(paramString, paramInt)) {
      return Rfa.f.n.e;
    }
    if (Rfa.f.k.e.a(paramString, paramInt)) {
      return Rfa.f.k.e;
    }
    if (Rfa.f.f.e.a(paramString, paramInt)) {
      return Rfa.f.f.e;
    }
    if (Rfa.f.g.e.a(paramString, paramInt)) {
      return Rfa.f.g.e;
    }
    return null;
  }
  
  public final Rfa a(Throwable paramThrowable, Rfa.f... paramVarArgs)
  {
    oXa.b(paramThrowable, "error");
    oXa.b(paramVarArgs, "possibleServerErrors");
    if ((paramThrowable instanceof Rfa)) {
      return (Rfa)paramThrowable;
    }
    if ((paramThrowable instanceof Tfa)) {
      return new Rfa.g(((Tfa)paramThrowable).a());
    }
    Object localObject;
    if ((paramThrowable instanceof gbb))
    {
      localObject = (gbb)paramThrowable;
      if (((gbb)localObject).a() >= 500) {
        return Rfa.e.c;
      }
      String str = ((gbb)localObject).b().c().b("X-FaceApp-ErrorCode");
      if (str != null)
      {
        int i = ((gbb)localObject).a();
        int j = paramVarArgs.length;
        for (int k = 0; k < j; k++)
        {
          localObject = paramVarArgs[k];
          if (((Rfa.f)localObject).a(str, i)) {
            break label138;
          }
        }
        localObject = null;
        label138:
        if (localObject != null) {
          return (Rfa)localObject;
        }
      }
    }
    if ((paramThrowable instanceof RuntimeException))
    {
      localObject = paramThrowable.getCause();
      if (localObject != null) {
        return Rfa.b.a((Throwable)localObject, (Rfa.f[])Arrays.copyOf(paramVarArgs, paramVarArgs.length));
      }
    }
    return new Rfa.d(paramThrowable);
  }
  
  public final gbb a()
  {
    QVa localQVa = Rfa.a();
    Object localObject = Rfa.b;
    localObject = a[0];
    return (gbb)localQVa.getValue();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Rfa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */