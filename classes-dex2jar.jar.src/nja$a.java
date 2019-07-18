import com.android.billingclient.api.F;
import java.util.List;

public final class nja$a
{
  public final nja a()
  {
    return nja.a();
  }
  
  public final nja a(F paramF)
  {
    oXa.b(paramF, "purchase");
    Object localObject = qja.o;
    String str = paramF.f();
    oXa.a(str, "purchase.sku");
    qja localqja = ((qja.a)localObject).a(str);
    str = paramF.a();
    oXa.a(str, "purchase.orderId");
    int i = paramF.c();
    localObject = paramF.d();
    oXa.a(localObject, "purchase.purchaseToken");
    return new nja(localqja, str, i, EPa.b((String)localObject), paramF.g());
  }
  
  public final nja a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    List localList = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    qja localqja = qja.o.a((String)localList.get(0));
    paramString2 = (String)localList.get(1);
    int i = Integer.parseInt((String)localList.get(2));
    paramString1 = localList.get(3);
    if (!(true ^ oXa.a((String)paramString1, "null"))) {
      paramString1 = null;
    }
    return new nja(localqja, paramString2, i, (String)paramString1, Boolean.parseBoolean((String)localList.get(4)));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/nja$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */