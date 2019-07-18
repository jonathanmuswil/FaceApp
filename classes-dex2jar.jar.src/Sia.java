import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class sia
{
  private static final bab.a b;
  private static final QVa c;
  private static final QVa d;
  private static final Bea e;
  public static final sia f;
  
  static
  {
    Object localObject = new rXa(vXa.a(sia.class), "acceptLanguage", "getAcceptLanguage()Ljava/lang/String;");
    vXa.a((qXa)localObject);
    rXa localrXa = new rXa(vXa.a(sia.class), "userAgent", "getUserAgent()Ljava/lang/String;");
    vXa.a(localrXa);
    a = new XXa[] { localObject, localrXa };
    f = new sia();
    b = bab.a.b;
    c = RVa.a(kia.b);
    d = RVa.a(ria.b);
    localObject = Uma.qa.ka().get();
    oXa.a(localObject, "AppPreferences.serverMode.get()");
    e = (Bea)localObject;
  }
  
  private final uZa.a a(uZa.a parama)
  {
    parama.a(mia.a);
    return parama;
  }
  
  private final uZa.a a(uZa.a parama, bab.a parama1)
  {
    bab localbab = new bab(lia.a);
    localbab.a(parama1);
    parama.a(localbab);
    return parama;
  }
  
  private final void a(BZa paramBZa)
  {
    if (oXa.a(paramBZa.e().b("X-FaceApp-ErrorCode"), Rfa.f.l.e.c())) {
      Kra.b.c();
    }
  }
  
  private final void a(xZa paramxZa)
  {
    Object localObject = ((fka)Uma.qa.c().get()).a();
    int i;
    if (((gka)localObject).b().length() > 0) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) && (!((gka)localObject).d())) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject = paramxZa.g().c();
      oXa.a(localObject, "request.url().encodedPath()");
      boolean bool = zYa.a((String)localObject, "auth/user/credentials", false, 2, null) ^ true;
      icb.a locala = icb.a("ServiceFactory");
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Token exists, but invalid. [Request needs fresh token]: ");
      ((StringBuilder)localObject).append(bool);
      ((StringBuilder)localObject).append(" [url]: ");
      ((StringBuilder)localObject).append(paramxZa.g());
      locala.a(((StringBuilder)localObject).toString(), new Object[0]);
      if (bool)
      {
        Kra.b.h().c();
        icb.a("ServiceFactory").a("Token successfully updated", new Object[0]);
      }
    }
  }
  
  private final void b(BZa paramBZa)
  {
    if (paramBZa.c() >= 400)
    {
      String str = paramBZa.b("x-faceapp-errorcode");
      if (str != null)
      {
        paramBZa = Rfa.b.a(str, paramBZa.c());
        if (paramBZa != null) {
          throw paramBZa;
        }
      }
    }
  }
  
  private final vbb h()
  {
    Object localObject = new uZa.a();
    ((uZa.a)localObject).a(oia.a);
    oXa.a(localObject, "OkHttpClient.Builder()\n …equest)\n                }");
    a(this, (uZa.a)localObject, null, 1, null);
    uZa localuZa = ((uZa.a)localObject).a();
    localObject = new vbb.a();
    ((vbb.a)localObject).a("https://hosts.faceapp.io");
    ((vbb.a)localObject).a(localuZa);
    ((vbb.a)localObject).a(Fbb.a());
    ((vbb.a)localObject).a(Gbb.a());
    localObject = ((vbb.a)localObject).a();
    oXa.a(localObject, "Retrofit.Builder()\n     …\n                .build()");
    return (vbb)localObject;
  }
  
  private final String i()
  {
    QVa localQVa = c;
    XXa localXXa = a[0];
    return (String)localQVa.getValue();
  }
  
  private final long j()
  {
    Object localObject = Uma.qa.s().get();
    oXa.a(localObject, "AppPreferences.firstLaunchDate.get()");
    return ((Number)localObject).longValue();
  }
  
  private final String k()
  {
    Object localObject = Uma.qa.m().get();
    oXa.a(localObject, "AppPreferences.deviceId.get()");
    return (String)localObject;
  }
  
  private final String l()
  {
    QVa localQVa = d;
    XXa localXXa = a[1];
    return (String)localQVa.getValue();
  }
  
  public final cia a()
  {
    Object localObject = new uZa.a();
    ((uZa.a)localObject).b(10L, TimeUnit.SECONDS);
    ((uZa.a)localObject).a(10L, TimeUnit.SECONDS);
    a((uZa.a)localObject);
    a(this, (uZa.a)localObject, null, 1, null);
    vbb.a locala = new vbb.a();
    locala.a(((uZa.a)localObject).a());
    locala.a("http://localhost/");
    locala.a(Fbb.a());
    localObject = locala.a().a(cia.class);
    oXa.a(localObject, "retrofit.create(FADownloadService::class.java)");
    return (cia)localObject;
  }
  
  public final iia a(bfa parambfa)
  {
    oXa.b(parambfa, "host");
    Object localObject = new HashMap();
    uZa.a locala = new uZa.a();
    locala.b(60L, TimeUnit.SECONDS);
    locala.a(30L, TimeUnit.SECONDS);
    locala.a(new pia((HashMap)localObject));
    a(this, locala, null, 1, null);
    localObject = new vbb.a();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("https://");
    localStringBuilder.append(parambfa.getHost());
    localStringBuilder.append(':');
    localStringBuilder.append(parambfa.getPort());
    localStringBuilder.append("/api/v3.10/");
    ((vbb.a)localObject).a(localStringBuilder.toString());
    ((vbb.a)localObject).a(locala.a());
    ((vbb.a)localObject).a(Fbb.a());
    ((vbb.a)localObject).a(Jbb.a());
    parambfa = ((vbb.a)localObject).a().a(iia.class);
    oXa.a(parambfa, "retrofit.create(FAPhotoService::class.java)");
    return (iia)parambfa;
  }
  
  public final dia b()
  {
    Object localObject1 = new uZa.a();
    ((uZa.a)localObject1).b(60L, TimeUnit.SECONDS);
    ((uZa.a)localObject1).a(60L, TimeUnit.SECONDS);
    ((uZa.a)localObject1).a(nia.a);
    a(this, (uZa.a)localObject1, null, 1, null);
    Object localObject2 = Vfa.a(Ofa.class, "update_type");
    ((Vfa)localObject2).b(Ifa.class, "voting.new_votes");
    ((Vfa)localObject2).b(Gfa.class, "voting.new_friend_poll");
    ((Vfa)localObject2).b(Kfa.class, "voting.poll_results");
    oXa.a(localObject2, "RuntimeTypeAdapterFactor…UPDATE_TYPE_POLL_RESULTS)");
    Object localObject3 = Vfa.a(ufa.class, "post_type");
    ((Vfa)localObject3).b(sfa.class, "poll");
    oXa.a(localObject3, "RuntimeTypeAdapterFactor…va, Posts.POST_TYPE_POLL)");
    Object localObject4 = new NQ();
    ((NQ)localObject4).a((fR)localObject2);
    ((NQ)localObject4).a((fR)localObject3);
    ((NQ)localObject4).a("yyyy-MM-dd'T'HH:mm:ssz");
    localObject2 = ((NQ)localObject4).a();
    String str = e.a();
    localObject4 = new vbb.a();
    localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("https://");
    ((StringBuilder)localObject3).append(str);
    ((StringBuilder)localObject3).append("/api/v3.0/");
    ((vbb.a)localObject4).a(((StringBuilder)localObject3).toString());
    ((vbb.a)localObject4).a(((uZa.a)localObject1).a());
    ((vbb.a)localObject4).a(Fbb.a());
    ((vbb.a)localObject4).a(Gbb.a((MQ)localObject2));
    localObject1 = ((vbb.a)localObject4).a().a(dia.class);
    oXa.a(localObject1, "retrofit.create(FAGeneralApiService::class.java)");
    return (dia)localObject1;
  }
  
  public final eia c()
  {
    Object localObject = h().a(eia.class);
    oXa.a(localObject, "createHostsRetrofit().cr…HostsService::class.java)");
    return (eia)localObject;
  }
  
  public final fia d()
  {
    Object localObject = h().a(fia.class);
    oXa.a(localObject, "createHostsRetrofit().cr…sServiceBeta::class.java)");
    return (fia)localObject;
  }
  
  public final gia e()
  {
    Object localObject = h().a(gia.class);
    oXa.a(localObject, "createHostsRetrofit().cr…erviceCustom::class.java)");
    return (gia)localObject;
  }
  
  public final hia f()
  {
    Object localObject = h().a(hia.class);
    oXa.a(localObject, "createHostsRetrofit().cr…tsServicePro::class.java)");
    return (hia)localObject;
  }
  
  public final jia g()
  {
    uZa.a locala = new uZa.a();
    locala.b(10L, TimeUnit.SECONDS);
    locala.a(10L, TimeUnit.SECONDS);
    locala.a(qia.a);
    a(this, locala, null, 1, null);
    String str = e.d();
    vbb.a locala1 = new vbb.a();
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("https://");
    ((StringBuilder)localObject).append(str);
    ((StringBuilder)localObject).append("/api/v1.1/");
    locala1.a(((StringBuilder)localObject).toString());
    locala1.a(locala.a());
    locala1.a(Fbb.a());
    locala1.a(Gbb.a());
    localObject = locala1.a().a(jia.class);
    oXa.a(localObject, "retrofit.create(FASearchService::class.java)");
    return (jia)localObject;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */