import android.content.Context;

final class jxa
  extends pXa
  implements cXa<String, cWa>
{
  jxa(Qwa paramQwa, nsa.a parama, Context paramContext)
  {
    super(1);
  }
  
  public final void a(String paramString)
  {
    String str = this.c.a();
    KOa localKOa = KOa.b;
    Context localContext = this.d;
    oXa.a(paramString, "it");
    if (!localKOa.a(localContext, paramString, str)) {
      if (this.c == nsa.a.b)
      {
        paramString = (lxa)this.b.c();
        if (paramString != null) {
          paramString.l();
        }
      }
      else
      {
        asa.d.k("Can't share FUN result link to general channel. Impossible case");
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/jxa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */