import android.content.Context;

final class uEa
  extends pXa
  implements dXa<fEa.b, Kda, XQa<Eda>>
{
  uEa(fEa paramfEa, int paramInt)
  {
    super(2);
  }
  
  public final XQa<Eda> a(fEa.b paramb, Kda paramKda)
  {
    oXa.b(paramb, "part");
    oXa.b(paramKda, "photoOpBuilder");
    Object localObject = (AEa)this.b.c();
    if (localObject != null)
    {
      localObject = ((AEa)localObject).h();
      if (localObject != null) {
        return paramKda.a((Context)localObject).c(new sEa(this, paramb)).a(new tEa(this, paramb));
      }
    }
    return null;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/uEa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */