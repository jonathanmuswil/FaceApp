import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class dba
{
  private static final Pattern a = Pattern.compile("http(s?)://[^\\/]+", 2);
  private final String b;
  private final yca c;
  private final uca d;
  private final String e;
  protected final Uaa f;
  
  public dba(Uaa paramUaa, String paramString1, String paramString2, yca paramyca, uca paramuca)
  {
    if (paramString2 != null)
    {
      if (paramyca != null)
      {
        this.f = paramUaa;
        this.e = paramString1;
        this.b = a(paramString2);
        this.c = paramyca;
        this.d = paramuca;
        return;
      }
      throw new IllegalArgumentException("requestFactory must not be null.");
    }
    throw new IllegalArgumentException("url must not be null.");
  }
  
  private String a(String paramString)
  {
    String str = paramString;
    if (!oba.b(this.e)) {
      str = a.matcher(paramString).replaceFirst(this.e);
    }
    return str;
  }
  
  protected wca a()
  {
    return a(Collections.emptyMap());
  }
  
  protected wca a(Map<String, String> paramMap)
  {
    paramMap = this.c.a(this.d, b(), paramMap);
    paramMap.a(false);
    paramMap.a(10000);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Crashlytics Android SDK/");
    localStringBuilder.append(this.f.j());
    paramMap.c("User-Agent", localStringBuilder.toString());
    paramMap.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    return paramMap;
  }
  
  protected String b()
  {
    return this.b;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/dba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */