import android.content.Intent;
import android.support.v4.app.l;

public final class ata
{
  private cta a;
  
  public final XQa<dta> a(l paraml, cta paramcta)
  {
    oXa.b(paraml, "fragment");
    oXa.b(paramcta, "network");
    this.a = paramcta;
    paraml = XQa.a(new Zsa(this, paraml)).b(new _sa(this));
    oXa.a(paraml, "Single.create<SocialToke…{ socialNetwork.reset() }");
    return paraml;
  }
  
  public final void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    cta localcta = this.a;
    if (localcta != null)
    {
      localcta.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    oXa.b("socialNetwork");
    throw null;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/ata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */