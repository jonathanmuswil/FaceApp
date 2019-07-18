import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

@SuppressLint({"CommitPrefEdits"})
class jm
{
  private final Fca a;
  private final Il b;
  
  public jm(Fca paramFca, Il paramIl)
  {
    this.a = paramFca;
    this.b = paramIl;
  }
  
  public static jm a(Fca paramFca, Il paramIl)
  {
    return new jm(paramFca, paramIl);
  }
  
  void a(boolean paramBoolean)
  {
    Fca localFca = this.a;
    localFca.a(localFca.edit().putBoolean("always_send_reports_opt_in", paramBoolean));
  }
  
  boolean a()
  {
    if (!this.a.get().contains("preferences_migration_complete"))
    {
      Object localObject = new Gca(this.b);
      int i;
      if ((!this.a.get().contains("always_send_reports_opt_in")) && (((Fca)localObject).get().contains("always_send_reports_opt_in"))) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0)
      {
        boolean bool = ((Fca)localObject).get().getBoolean("always_send_reports_opt_in", false);
        localObject = this.a;
        ((Fca)localObject).a(((Fca)localObject).edit().putBoolean("always_send_reports_opt_in", bool));
      }
      localObject = this.a;
      ((Fca)localObject).a(((Fca)localObject).edit().putBoolean("preferences_migration_complete", true));
    }
    return this.a.get().getBoolean("always_send_reports_opt_in", false);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/jm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */