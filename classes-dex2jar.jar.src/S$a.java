import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.g;
import java.util.ArrayList;

public final class S$a
{
  private final Intent a = new Intent("android.intent.action.VIEW");
  private ArrayList<Bundle> b = null;
  private Bundle c = null;
  private ArrayList<Bundle> d = null;
  private boolean e = true;
  
  public S$a()
  {
    this(null);
  }
  
  public S$a(T paramT)
  {
    if (paramT == null)
    {
      localObject = new Bundle();
      if (paramT == null)
      {
        g.a((Bundle)localObject, "android.support.customtabs.extra.SESSION", null);
        this.a.putExtras((Bundle)localObject);
        return;
      }
      paramT.a();
      throw null;
    }
    Object localObject = this.a;
    paramT.b();
    throw null;
  }
  
  public S a()
  {
    ArrayList localArrayList = this.b;
    if (localArrayList != null) {
      this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", localArrayList);
    }
    localArrayList = this.d;
    if (localArrayList != null) {
      this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", localArrayList);
    }
    this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.e);
    return new S(this.a, this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/S$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */