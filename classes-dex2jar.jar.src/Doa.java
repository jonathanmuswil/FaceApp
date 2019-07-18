import android.net.Uri;
import io.faceapp.FaceApplication;
import io.faceapp.FaceApplication.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class doa
{
  private static final QVa b = RVa.a(Gna.b);
  public static final doa c;
  
  static
  {
    rXa localrXa = new rXa(vXa.a(doa.class), "api", "getApi()Lio/faceapp/api/services/FAGeneralApiService;");
    vXa.a(localrXa);
    a = new XXa[] { localrXa };
    c = new doa();
  }
  
  private final dia c()
  {
    QVa localQVa = b;
    XXa localXXa = a[0];
    return (dia)localQVa.getValue();
  }
  
  public final QQa<xfa<Mka>> a(Uri paramUri, String paramString, List<? extends List<String>> paramList)
  {
    oXa.b(paramUri, "pollImageUri");
    oXa.b(paramString, "photoCode");
    oXa.b(paramList, "filterIds");
    paramUri = QQa.a(new Nna(paramList, paramUri, paramString));
    oXa.a(paramUri, "Observable.defer {\n     …osable?.dispose() }\n    }");
    paramUri = RPa.a(paramUri, new Rfa.f[0]).b(EVa.b());
    oXa.a(paramUri, "Observable.defer {\n     …scribeOn(Schedulers.io())");
    return paramUri;
  }
  
  public final XQa<Integer> a()
  {
    XQa localXQa = dia.a.b(c(), 0, 0, null, 4, null).d(Qna.a);
    oXa.a(localXQa, "api\n            .getUnre…        .map { it.count }");
    localXQa = RPa.a(localXQa, new Rfa.f[0]).b(EVa.b());
    oXa.a(localXQa, "api\n            .getUnre…scribeOn(Schedulers.io())");
    return localXQa;
  }
  
  public final XQa<Integer> a(int paramInt)
  {
    XQa localXQa = c().a(new Efa(paramInt)).d(Vna.a);
    oXa.a(localXQa, "api\n            .markUpd…        .map { it.count }");
    localXQa = RPa.a(localXQa, new Rfa.f[0]).b(EVa.b());
    oXa.a(localXQa, "api\n            .markUpd…scribeOn(Schedulers.io())");
    return localXQa;
  }
  
  public final XQa<Zka> a(int paramInt1, int paramInt2)
  {
    XQa localXQa = dia.a.a(c(), paramInt1, paramInt2, null, 4, null).d(Pna.a);
    oXa.a(localXQa, "api\n            .getAllU…tesBatch.createFrom(it) }");
    localXQa = RPa.a(localXQa, new Rfa.f[0]).b(EVa.b());
    oXa.a(localXQa, "api\n            .getAllU…scribeOn(Schedulers.io())");
    return localXQa;
  }
  
  public final XQa<Mka> a(String paramString)
  {
    oXa.b(paramString, "pollId");
    paramString = c().a(paramString, new ffa(false)).d(Ona.a);
    oXa.a(paramString, "api\n            .editPol….related_objects.users) }");
    paramString = RPa.a(paramString, new Rfa.f[0]).b(EVa.b());
    oXa.a(paramString, "api\n            .editPol…scribeOn(Schedulers.io())");
    return paramString;
  }
  
  public final XQa<WVa<Mka, Rka>> a(String paramString1, int paramInt, String paramString2)
  {
    oXa.b(paramString1, "pollId");
    oXa.b(paramString2, "comment");
    paramString1 = c().a(paramString1, new pfa(String.valueOf(paramInt), paramString2)).d(aoa.a);
    oXa.a(paramString1, "api\n            .submitV… usersMap))\n            }");
    paramString1 = RPa.a(paramString1, new Rfa.f[] { Rfa.f.f.e, Rfa.f.g.e, Rfa.f.k.e }).b(EVa.b());
    oXa.a(paramString1, "api\n            .submitV…scribeOn(Schedulers.io())");
    return paramString1;
  }
  
  public final XQa<fka> a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "accountId");
    oXa.b(paramString2, "token");
    paramString1 = c().a(new Sea(new Kea(paramString1, paramString2), null, null, null, 14, null)).d(Rna.a);
    oXa.a(paramString1, "api\n            .submitU…dentials.createFrom(it) }");
    paramString1 = RPa.a(paramString1, new Rfa.f[] { Rfa.f.b.e }).b(EVa.b());
    oXa.a(paramString1, "api\n            .submitU…scribeOn(Schedulers.io())");
    return paramString1;
  }
  
  public final XQa<dka> a(String paramString1, String paramString2, Uri paramUri, String paramString3)
  {
    HashMap localHashMap = new HashMap();
    if (paramString1 != null)
    {
      paramString1 = AZa.a(rZa.b("text/plain"), paramString1);
      oXa.a(paramString1, "RequestBody.create(Media….parse(\"text/plain\"), it)");
      localHashMap.put("first_name", paramString1);
    }
    if (paramString2 != null)
    {
      paramString1 = AZa.a(rZa.b("text/plain"), paramString2);
      oXa.a(paramString1, "RequestBody.create(Media….parse(\"text/plain\"), it)");
      localHashMap.put("last_name", paramString1);
    }
    if (paramUri != null) {
      localHashMap.put("image\"; filename=\"image.jpg", new xia(WOa.e.a(FaceApplication.d.a(), paramUri)));
    }
    if (!localHashMap.isEmpty())
    {
      paramString1 = c().a(localHashMap, paramString3).d(coa.a);
      oXa.a(paramString1, "api.updateUserInfo(map, …ser.createFrom(it.user) }");
      paramString1 = RPa.a(paramString1, new Rfa.f[0]).b(EVa.b());
      oXa.a(paramString1, "api.updateUserInfo(map, …scribeOn(Schedulers.io())");
      return paramString1;
    }
    throw new IllegalArgumentException("At least one param should be NonNull");
  }
  
  public final XQa<fka> a(String paramString1, String paramString2, String paramString3)
  {
    oXa.b(paramString1, "subsId");
    oXa.b(paramString2, "productId");
    oXa.b(paramString3, "token");
    paramString1 = c().a(new Sea(null, null, null, new Jea(paramString1, paramString2, paramString3), 7, null)).d(_na.a);
    oXa.a(paramString1, "api\n            .submitU…dentials.createFrom(it) }");
    paramString1 = RPa.a(paramString1, new Rfa.f[] { Rfa.f.e.e }).b(EVa.b());
    oXa.a(paramString1, "api\n            .submitU…scribeOn(Schedulers.io())");
    return paramString1;
  }
  
  public final xQa a(zfa paramzfa)
  {
    oXa.b(paramzfa, "feedback");
    paramzfa = RPa.a(c().a(paramzfa), new Rfa.f[0]).b(EVa.b());
    oXa.a(paramzfa, "api\n            .sendRat…scribeOn(Schedulers.io())");
    return paramzfa;
  }
  
  public final XQa<fka> b()
  {
    XQa localXQa = c().a(new Sea(null, null, null, null, 15, null)).d(boa.a);
    oXa.a(localXQa, "api\n            .submitU…dentials.createFrom(it) }");
    localXQa = RPa.a(localXQa, new Rfa.f[0]).b(EVa.b());
    oXa.a(localXQa, "api\n            .submitU…scribeOn(Schedulers.io())");
    return localXQa;
  }
  
  public final XQa<Qka> b(int paramInt1, int paramInt2)
  {
    XQa localXQa = dia.a.c(c(), paramInt1, paramInt2, null, 4, null).d(Wna.a);
    oXa.a(localXQa, "api.myFeed(limit, offset…llsBatch.createFrom(it) }");
    localXQa = RPa.a(localXQa, new Rfa.f[0]).b(EVa.b());
    oXa.a(localXQa, "api.myFeed(limit, offset…scribeOn(Schedulers.io())");
    return localXQa;
  }
  
  public final XQa<dka> b(String paramString)
  {
    oXa.b(paramString, "accountKitAccountId");
    paramString = c().a(new Nea(paramString)).d(Tna.a);
    oXa.a(paramString, "api\n            .unlinkA…ser.createFrom(it.user) }");
    paramString = RPa.a(paramString, new Rfa.f[0]).b(EVa.b());
    oXa.a(paramString, "api\n            .unlinkA…scribeOn(Schedulers.io())");
    return paramString;
  }
  
  public final XQa<fka> b(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "accountId");
    oXa.b(paramString2, "token");
    paramString1 = c().a(new Sea(null, new Lea(paramString1, paramString2), null, null, 13, null)).d(Sna.a);
    oXa.a(paramString1, "api\n            .submitU…dentials.createFrom(it) }");
    paramString1 = RPa.a(paramString1, new Rfa.f[] { Rfa.f.c.e }).b(EVa.b());
    oXa.a(paramString1, "api\n            .submitU…scribeOn(Schedulers.io())");
    return paramString1;
  }
  
  public final XQa<Qka> c(int paramInt1, int paramInt2)
  {
    XQa localXQa = c().a(paramInt1, paramInt2).d(Xna.a);
    oXa.a(localXQa, "api.myPolls(limit, offse…llsBatch.createFrom(it) }");
    localXQa = RPa.a(localXQa, new Rfa.f[0]).b(EVa.b());
    oXa.a(localXQa, "api.myPolls(limit, offse…scribeOn(Schedulers.io())");
    return localXQa;
  }
  
  public final xQa c(String paramString)
  {
    paramString = RPa.a(c().b(paramString), new Rfa.f[0]).b(EVa.b());
    oXa.a(paramString, "api.logout(userToken)\n  …scribeOn(Schedulers.io())");
    return paramString;
  }
  
  public final XQa<dka> d(String paramString)
  {
    oXa.b(paramString, "facebookAccountId");
    paramString = c().a(new Oea(paramString)).d(Una.a);
    oXa.a(paramString, "api\n            .unlinkF…ser.createFrom(it.user) }");
    paramString = RPa.a(paramString, new Rfa.f[0]).b(EVa.b());
    oXa.a(paramString, "api\n            .unlinkF…scribeOn(Schedulers.io())");
    return paramString;
  }
  
  public final XQa<Nka> e(String paramString)
  {
    oXa.b(paramString, "pollId");
    paramString = c().a(paramString).d(Yna.a);
    oXa.a(paramString, "api.pollInfo(pollId)\n   ….related_objects.users) }");
    paramString = RPa.a(paramString, new Rfa.f[] { Rfa.f.k.e }).b(EVa.b());
    oXa.a(paramString, "api.pollInfo(pollId)\n   …scribeOn(Schedulers.io())");
    return paramString;
  }
  
  public final XQa<Nka> f(String paramString)
  {
    oXa.b(paramString, "pollId");
    paramString = c().a(paramString, 100, "created").d(Zna.a);
    oXa.a(paramString, "api.votesForPoll(pollId,…Map, votes)\n            }");
    paramString = RPa.a(paramString, new Rfa.f[] { Rfa.f.k.e }).b(EVa.b());
    oXa.a(paramString, "api.votesForPoll(pollId,…scribeOn(Schedulers.io())");
    return paramString;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/doa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */