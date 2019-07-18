import java.util.List;

public final class dka$a
{
  public final dka a()
  {
    return dka.a();
  }
  
  public final dka a(Qea paramQea)
  {
    oXa.b(paramQea, "data");
    String str1 = paramQea.getId();
    String str2 = paramQea.getFirst_name();
    if (str2 == null) {
      str2 = "";
    }
    String str3 = paramQea.getLast_name();
    if (str3 == null) {
      str3 = "";
    }
    String str4 = paramQea.getProfile_pic();
    Object localObject = paramQea.getAccount_fb();
    if (localObject != null) {
      localObject = aka.a.a((Hea)localObject);
    } else {
      localObject = null;
    }
    paramQea = paramQea.getAccount_ak();
    if (paramQea != null) {
      paramQea = cka.a.a(paramQea);
    } else {
      paramQea = null;
    }
    return new dka(str1, str2, str3, str4, (aka)localObject, paramQea);
  }
  
  public final dka a(String paramString1, String paramString2)
  {
    oXa.b(paramString1, "serialized");
    oXa.b(paramString2, "separator");
    paramString2 = zYa.a(paramString1, new String[] { paramString2 }, false, 0, 6, null);
    String str1 = (String)paramString2.get(0);
    String str2 = (String)paramString2.get(1);
    String str3 = (String)paramString2.get(2);
    paramString1 = paramString2.get(3);
    boolean bool = EPa.a((String)paramString1);
    Object localObject = null;
    if (!bool) {
      paramString1 = null;
    }
    String str4 = (String)paramString1;
    paramString1 = paramString2.get(4);
    if (!EPa.a((String)paramString1)) {
      paramString1 = null;
    }
    String str5 = (String)paramString1;
    paramString1 = paramString2.get(5);
    if (!EPa.a((String)paramString1)) {
      paramString1 = null;
    }
    String str6 = (String)paramString1;
    paramString1 = paramString2.get(6);
    if (!EPa.a((String)paramString1)) {
      paramString1 = null;
    }
    String str7 = (String)paramString1;
    paramString1 = paramString2.get(7);
    if (!EPa.a((String)paramString1)) {
      paramString1 = null;
    }
    String str8 = (String)paramString1;
    paramString1 = paramString2.get(8);
    if (!EPa.a((String)paramString1)) {
      paramString1 = null;
    }
    String str9 = (String)paramString1;
    if (str5 != null)
    {
      if ((str6 != null) && (str7 != null)) {
        paramString1 = new aka(str5, str6, str7);
      } else {
        paramString1 = null;
      }
    }
    else {
      paramString1 = null;
    }
    paramString2 = (String)localObject;
    if (str8 != null)
    {
      paramString2 = (String)localObject;
      if (str9 != null) {
        paramString2 = new cka(str8, str9);
      }
    }
    return new dka(str1, str2, str3, str4, paramString1, paramString2);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dka$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */