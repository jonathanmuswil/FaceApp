import com.facebook.E.b;
import com.facebook.I;
import java.io.InvalidObjectException;

final class pna
  implements E.b
{
  pna(YQa paramYQa) {}
  
  public final void a(I paramI)
  {
    oXa.a(paramI, "response");
    String str = paramI.c();
    if (str == null)
    {
      this.a.a(new InvalidObjectException("expected non-null response json"));
      return;
    }
    try
    {
      paramI = new MQ;
      paramI.<init>();
      paramI = (Wea)paramI.a(str, Wea.class);
      this.a.b(paramI.getPicture().getData().getCache_key());
    }
    catch (_Q paramI)
    {
      this.a.a(new InvalidObjectException("can't parse Facebook avatar key response"));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/pna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */