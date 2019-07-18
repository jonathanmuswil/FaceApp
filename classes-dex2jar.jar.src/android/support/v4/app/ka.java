package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.content.c;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class ka
  implements Iterable<Intent>
{
  private final ArrayList<Intent> a = new ArrayList();
  private final Context b;
  
  private ka(Context paramContext)
  {
    this.b = paramContext;
  }
  
  public static ka a(Context paramContext)
  {
    return new ka(paramContext);
  }
  
  public ka a(Activity paramActivity)
  {
    Object localObject1;
    if ((paramActivity instanceof a)) {
      localObject1 = ((a)paramActivity).b();
    } else {
      localObject1 = null;
    }
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = aa.a(paramActivity);
    }
    if (localObject2 != null)
    {
      localObject1 = ((Intent)localObject2).getComponent();
      paramActivity = (Activity)localObject1;
      if (localObject1 == null) {
        paramActivity = ((Intent)localObject2).resolveActivity(this.b.getPackageManager());
      }
      a(paramActivity);
      a((Intent)localObject2);
    }
    return this;
  }
  
  public ka a(ComponentName paramComponentName)
  {
    int i = this.a.size();
    try
    {
      for (paramComponentName = aa.a(this.b, paramComponentName); paramComponentName != null; paramComponentName = aa.a(this.b, paramComponentName.getComponent())) {
        this.a.add(i, paramComponentName);
      }
      return this;
    }
    catch (PackageManager.NameNotFoundException paramComponentName)
    {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      throw new IllegalArgumentException(paramComponentName);
    }
  }
  
  public ka a(Intent paramIntent)
  {
    this.a.add(paramIntent);
    return this;
  }
  
  public void a(Bundle paramBundle)
  {
    if (!this.a.isEmpty())
    {
      Object localObject = this.a;
      localObject = (Intent[])((ArrayList)localObject).toArray(new Intent[((ArrayList)localObject).size()]);
      localObject[0] = new Intent(localObject[0]).addFlags(268484608);
      if (!c.a(this.b, (Intent[])localObject, paramBundle))
      {
        paramBundle = new Intent(localObject[(localObject.length - 1)]);
        paramBundle.addFlags(268435456);
        this.b.startActivity(paramBundle);
      }
      return;
    }
    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
  }
  
  @Deprecated
  public Iterator<Intent> iterator()
  {
    return this.a.iterator();
  }
  
  public void m()
  {
    a(null);
  }
  
  public static abstract interface a
  {
    public abstract Intent b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/app/ka.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */