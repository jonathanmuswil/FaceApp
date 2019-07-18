import com.facebook.E.b;
import com.facebook.I;
import java.io.InvalidObjectException;

final class tna
  implements E.b
{
  tna(YQa paramYQa) {}
  
  public final void a(I paramI)
  {
    oXa.a(paramI, "response");
    paramI = paramI.c();
    if (paramI == null)
    {
      this.a.a(new InvalidObjectException("expected non-null response json"));
      return;
    }
    try
    {
      MQ localMQ = new MQ;
      localMQ.<init>();
      paramI = (Zea)localMQ.a(paramI, Zea.class);
      this.a.b(paramI.getData());
    }
    catch (_Q paramI)
    {
      this.a.a(new InvalidObjectException("can't parse Facebook photo albums response"));
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/tna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */