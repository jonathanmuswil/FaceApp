import android.os.Bundle;
import android.support.v4.app.l;

public final class EJa$a
{
  public final EJa a(String paramString, VOa paramVOa)
  {
    oXa.b(paramString, "from");
    oXa.b(paramVOa, "gender");
    EJa localEJa = new EJa();
    Bundle localBundle = new Bundle();
    localBundle.putString("open_source", paramString);
    localBundle.putString("gender", paramVOa.getId());
    localEJa.m(localBundle);
    return localEJa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/EJa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */