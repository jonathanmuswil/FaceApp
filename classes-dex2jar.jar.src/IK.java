import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

class ik
{
  private final Fca a;
  
  ik(Fca paramFca)
  {
    this.a = paramFca;
  }
  
  public static ik a(Context paramContext)
  {
    return new ik(new Gca(paramContext, "settings"));
  }
  
  @SuppressLint({"CommitPrefEdits"})
  public boolean a()
  {
    return this.a.get().getBoolean("analytics_launched", false);
  }
  
  @SuppressLint({"CommitPrefEdits"})
  public void b()
  {
    Fca localFca = this.a;
    localFca.a(localFca.edit().putBoolean("analytics_launched", true));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ik.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */