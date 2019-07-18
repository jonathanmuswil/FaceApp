import android.os.Bundle;
import android.support.v4.app.l;

public final class lFa$a
{
  public final lFa a(JDa paramJDa, boolean paramBoolean)
  {
    oXa.b(paramJDa, "request");
    lFa locallFa = new lFa();
    Object localObject = new Bundle();
    ((Bundle)localObject).putBoolean("is_light_theme", paramBoolean);
    locallFa.m((Bundle)localObject);
    localObject = new rFa(paramJDa.c(), paramJDa.b(), paramJDa.a());
    ((rFa)localObject).a(paramJDa.d());
    locallFa.a((rla)localObject);
    return locallFa;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/lFa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */