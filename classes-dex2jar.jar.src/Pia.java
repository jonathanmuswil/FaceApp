import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class pia
  implements qZa
{
  pia(HashMap paramHashMap) {}
  
  public final BZa a(qZa.a parama)
  {
    Object localObject1 = parama.N();
    if (ePa.a.b())
    {
      Object localObject2 = sia.f;
      oXa.a(localObject1, "original");
      sia.a((sia)localObject2, (xZa)localObject1);
      Object localObject3 = ((xZa)localObject1).f();
      ((xZa.a)localObject3).b("X-FaceApp-DeviceID", sia.c(sia.f));
      ((xZa.a)localObject3).b("X-FaceApp-AppLaunched", String.valueOf(sia.b(sia.f)));
      localObject2 = Uma.qa.c().get();
      int i = ((fka)localObject2).a().b().length();
      int j = 0;
      if (i > 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i == 0) {
        localObject2 = null;
      }
      localObject2 = (fka)localObject2;
      if (localObject2 != null)
      {
        localObject4 = ((xZa)localObject1).a("X-FaceApp-UserToken");
        if (localObject4 != null)
        {
          i = j;
          if (((CharSequence)localObject4).length() != 0) {}
        }
        else
        {
          i = 1;
        }
        if ((i ^ 0x1) == 0) {
          ((xZa.a)localObject3).b("X-FaceApp-UserToken", ((fka)localObject2).a().b());
        }
      }
      ((xZa.a)localObject3).b("User-Agent", sia.d(sia.f));
      ((xZa.a)localObject3).b("Accept-Language", sia.a(sia.f));
      localObject2 = ((xZa)localObject1).a();
      if ((j_a.b(((xZa)localObject1).e())) && (localObject2 != null))
      {
        localObject2 = Poa.k.a((AZa)localObject2);
        localObject4 = (AZa)((WVa)localObject2).a();
        localObject2 = (byte[])((WVa)localObject2).b();
        ((xZa.a)localObject3).a(((xZa)localObject1).e(), (AZa)localObject4);
      }
      else
      {
        localObject2 = Poa.k.a();
        localObject1 = (String)((WVa)localObject2).a();
        localObject2 = (byte[])((WVa)localObject2).b();
        ((xZa.a)localObject3).b("X-FaceApp-EID", (String)localObject1);
      }
      Object localObject4 = this.a.values();
      oXa.a(localObject4, "cookieStorage.values");
      localObject1 = new ArrayList();
      Object localObject5 = ((Iterable)localObject4).iterator();
      while (((Iterator)localObject5).hasNext())
      {
        localObject4 = ((Iterator)localObject5).next();
        if ((((HttpCookie)localObject4).hasExpired() ^ true)) {
          ((Collection)localObject1).add(localObject4);
        }
      }
      localObject1 = ((Iterable)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((xZa.a)localObject3).a("Cookie", ((HttpCookie)((Iterator)localObject1).next()).toString());
      }
      localObject3 = parama.a(((xZa.a)localObject3).a());
      parama = sia.f;
      oXa.a(localObject3, "originResponse");
      sia.b(parama, (BZa)localObject3);
      parama = ((BZa)localObject3).c("Set-Cookie");
      oXa.a(parama, "it");
      if (!(parama.isEmpty() ^ true)) {
        parama = null;
      }
      if (parama != null)
      {
        parama = parama.iterator();
        while (parama.hasNext())
        {
          localObject1 = HttpCookie.parse((String)parama.next());
          oXa.a(localObject1, "HttpCookie.parse(cookieValue)");
          localObject1 = ((Iterable)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            HttpCookie localHttpCookie = (HttpCookie)((Iterator)localObject1).next();
            localObject4 = this.a;
            oXa.a(localHttpCookie, "cookie");
            localObject5 = localHttpCookie.getName();
            oXa.a(localObject5, "cookie.name");
            ((Map)localObject4).put(localObject5, localHttpCookie);
          }
        }
      }
      localObject1 = ((BZa)localObject3).h();
      parama = Noa.e;
      localObject3 = ((BZa)localObject3).a();
      if (localObject2 != null)
      {
        ((BZa.a)localObject1).a(parama.a((DZa)localObject3, (byte[])localObject2));
        localObject2 = ((BZa.a)localObject1).a();
        parama = sia.f;
        oXa.a(localObject2, "response");
        sia.a(parama, (BZa)localObject2);
        return (BZa)localObject2;
      }
      oXa.b("aesSecret");
      throw null;
    }
    throw Rfa.b.c;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */