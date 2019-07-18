import java.util.Map;

public final class Ora$a$a
{
  public final Ora.a a(String paramString, Object paramObject)
  {
    oXa.b(paramString, "startView");
    boolean bool = Sra.a.b();
    if (oXa.a(paramString, "sales")) {
      return Ora.a.d.c;
    }
    if (oXa.a(paramString, "sales_popup")) {
      return Ora.a.e.c;
    }
    if ((oXa.a(paramString, "open_poll")) && (paramObject != null) && ((paramObject instanceof String)) && (bool)) {
      return new Ora.a.f((String)paramObject);
    }
    if ((oXa.a(paramString, "open_voting")) && (paramObject != null) && ((paramObject instanceof String)) && (bool)) {
      return new Ora.a.g((String)paramObject);
    }
    if ((oXa.a(paramString, "photo_editor")) && (paramObject != null) && ((paramObject instanceof Rja))) {
      return new Ora.a.c((Rja)paramObject);
    }
    bool = oXa.a(paramString, "onboarding");
    Object localObject = null;
    paramString = (String)localObject;
    if (bool)
    {
      bool = paramObject instanceof Map;
      if (!bool) {
        return null;
      }
      if (!bool) {
        paramObject = null;
      }
      Map localMap = (Map)paramObject;
      paramString = (String)localObject;
      if (localMap != null)
      {
        paramObject = localMap.get("gen");
        paramString = (String)paramObject;
        if (!(paramObject instanceof String)) {
          paramString = null;
        }
        paramString = (String)paramString;
        if (paramString != null)
        {
          paramString = VOa.e.b(paramString);
          if (paramString != null) {}
        }
        else
        {
          paramString = VOa.a;
        }
        localObject = localMap.get("subscription");
        paramObject = localObject;
        if (!(localObject instanceof String)) {
          paramObject = null;
        }
        paramObject = (String)paramObject;
        if (paramObject == null) {
          paramObject = "";
        }
        paramString = new Ora.a.b(paramString, (String)paramObject);
      }
    }
    return paramString;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/Ora$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */