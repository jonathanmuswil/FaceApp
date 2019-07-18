import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;

public final class yg$a
{
  static final int a;
  final Context b;
  ActivityManager c;
  yg.c d;
  float e = 2.0F;
  float f = a;
  float g = 0.4F;
  float h = 0.33F;
  int i = 4194304;
  
  static
  {
    int j;
    if (Build.VERSION.SDK_INT < 26) {
      j = 4;
    } else {
      j = 1;
    }
    a = j;
  }
  
  public yg$a(Context paramContext)
  {
    this.b = paramContext;
    this.c = ((ActivityManager)paramContext.getSystemService("activity"));
    this.d = new yg.b(paramContext.getResources().getDisplayMetrics());
    if ((Build.VERSION.SDK_INT >= 26) && (yg.a(this.c))) {
      this.f = 0.0F;
    }
  }
  
  public yg a()
  {
    return new yg(this);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yg$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */