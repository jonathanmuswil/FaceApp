import android.app.Activity;

final class Cl$h
  implements qm.d
{
  private final Uaa a;
  private final jm b;
  private final Wca c;
  
  public Cl$h(Uaa paramUaa, jm paramjm, Wca paramWca)
  {
    this.a = paramUaa;
    this.b = paramjm;
    this.c = paramWca;
  }
  
  public boolean a()
  {
    Activity localActivity = this.a.f().a();
    if ((localActivity != null) && (!localActivity.isFinishing()))
    {
      Object localObject = new Dl(this);
      localObject = Xk.a(localActivity, this.c, (Xk.a)localObject);
      localActivity.runOnUiThread(new El(this, (Xk)localObject));
      Naa.e().d("CrashlyticsCore", "Waiting for user opt-in.");
      ((Xk)localObject).a();
      return ((Xk)localObject).b();
    }
    return true;
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Cl$h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */