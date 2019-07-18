package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class mb
  extends ContextWrapper
{
  private static final Object a = new Object();
  private static ArrayList<WeakReference<mb>> b;
  private final Resources c;
  private final Resources.Theme d;
  
  private mb(Context paramContext)
  {
    super(paramContext);
    if (Cb.b())
    {
      this.c = new Cb(this, paramContext.getResources());
      this.d = this.c.newTheme();
      this.d.setTo(paramContext.getTheme());
    }
    else
    {
      this.c = new ob(this, paramContext.getResources());
      this.d = null;
    }
  }
  
  public static Context a(Context paramContext)
  {
    if (b(paramContext)) {
      synchronized (a)
      {
        if (b == null)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          b = (ArrayList)localObject2;
        }
        else
        {
          for (int i = b.size() - 1; i >= 0; i--)
          {
            localObject2 = (WeakReference)b.get(i);
            if ((localObject2 == null) || (((WeakReference)localObject2).get() == null)) {
              b.remove(i);
            }
          }
          for (i = b.size() - 1; i >= 0; i--)
          {
            localObject2 = (WeakReference)b.get(i);
            if (localObject2 != null) {
              localObject2 = (mb)((WeakReference)localObject2).get();
            } else {
              localObject2 = null;
            }
            if ((localObject2 != null) && (((ContextWrapper)localObject2).getBaseContext() == paramContext)) {
              return (Context)localObject2;
            }
          }
        }
        Object localObject2 = new android/support/v7/widget/mb;
        ((mb)localObject2).<init>(paramContext);
        paramContext = b;
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(localObject2);
        paramContext.add(localWeakReference);
        return (Context)localObject2;
      }
    }
    return paramContext;
  }
  
  private static boolean b(Context paramContext)
  {
    boolean bool1 = paramContext instanceof mb;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (!bool1)
    {
      bool3 = bool2;
      if (!(paramContext.getResources() instanceof ob)) {
        if ((paramContext.getResources() instanceof Cb))
        {
          bool3 = bool2;
        }
        else if (Build.VERSION.SDK_INT >= 21)
        {
          bool3 = bool2;
          if (!Cb.b()) {}
        }
        else
        {
          bool3 = true;
        }
      }
    }
    return bool3;
  }
  
  public AssetManager getAssets()
  {
    return this.c.getAssets();
  }
  
  public Resources getResources()
  {
    return this.c;
  }
  
  public Resources.Theme getTheme()
  {
    Resources.Theme localTheme1 = this.d;
    Resources.Theme localTheme2 = localTheme1;
    if (localTheme1 == null) {
      localTheme2 = super.getTheme();
    }
    return localTheme2;
  }
  
  public void setTheme(int paramInt)
  {
    Resources.Theme localTheme = this.d;
    if (localTheme == null) {
      super.setTheme(paramInt);
    } else {
      localTheme.applyStyle(paramInt, true);
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/widget/mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */