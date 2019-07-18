import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class lm
{
  private static final Pattern a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");
  
  public static km a(String paramString)
  {
    Object localObject = a.matcher(paramString);
    if (!((Matcher)localObject).matches()) {
      return null;
    }
    try
    {
      long l = Long.valueOf(((Matcher)localObject).group(1), 16).longValue();
      localObject = new km(l, Long.valueOf(((Matcher)localObject).group(2), 16).longValue() - l, ((Matcher)localObject).group(3), ((Matcher)localObject).group(4));
      return (km)localObject;
    }
    catch (Exception localException)
    {
      Xaa localXaa = Naa.e();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not parse map entry: ");
      localStringBuilder.append(paramString);
      localXaa.d("CrashlyticsCore", localStringBuilder.toString());
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/lm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */