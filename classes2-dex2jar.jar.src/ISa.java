import com.google.firebase.remoteconfig.a;
import com.google.firebase.remoteconfig.g.a;

public final class isa
{
  private static final FVa<Object> b;
  private static final QVa c = RVa.a(gsa.b);
  public static final isa d;
  
  static
  {
    Object localObject = new rXa(vXa.a(isa.class), "INSTANCE", "getINSTANCE()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;");
    vXa.a((qXa)localObject);
    a = new XXa[] { localObject };
    d = new isa();
    localObject = FVa.f(new Object());
    oXa.a(localObject, "BehaviorSubject.createDefault<Any>(Any())");
    b = (FVa)localObject;
  }
  
  private final void a(a parama, long paramLong, boolean paramBoolean)
  {
    parama.a(paramLong).a(new hsa(parama, paramBoolean, paramLong));
  }
  
  private final a d()
  {
    a locala = a.d();
    g.a locala1 = new g.a();
    locala1.a(false);
    locala.a(locala1.a());
    oXa.a(locala, "remoteConfig");
    a(locala, 0L, true);
    return locala;
  }
  
  public final a a()
  {
    QVa localQVa = c;
    XXa localXXa = a[0];
    return (a)localQVa.getValue();
  }
  
  public final QQa<Object> b()
  {
    return b;
  }
  
  public final void c()
  {
    icb.a locala = icb.a("RemoteConfig");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("prefetch started: ");
    localStringBuilder.append(a());
    locala.a(localStringBuilder.toString(), new Object[0]);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/isa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */