import android.content.Context;

final class Cl$k
  implements Runnable
{
  private final Context a;
  private final pm b;
  private final qm c;
  
  public Cl$k(Context paramContext, pm parampm, qm paramqm)
  {
    this.a = paramContext;
    this.b = parampm;
    this.c = paramqm;
  }
  
  public void run()
  {
    if (!oba.b(this.a)) {
      return;
    }
    Naa.e().d("CrashlyticsCore", "Attempting to send crash report at time of crash...");
    this.c.a(this.b);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Cl$k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */