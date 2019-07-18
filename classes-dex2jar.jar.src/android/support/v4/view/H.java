package android.support.v4.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

public final class h
{
  private static Field a;
  private static boolean b;
  
  public static void a(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    paramLayoutInflater.setFactory2(paramFactory2);
    if (Build.VERSION.SDK_INT < 21)
    {
      LayoutInflater.Factory localFactory = paramLayoutInflater.getFactory();
      if ((localFactory instanceof LayoutInflater.Factory2)) {
        b(paramLayoutInflater, (LayoutInflater.Factory2)localFactory);
      } else {
        b(paramLayoutInflater, paramFactory2);
      }
    }
  }
  
  private static void b(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    if (!b)
    {
      try
      {
        a = LayoutInflater.class.getDeclaredField("mFactory2");
        a.setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("forceSetFactory2 Could not find field 'mFactory2' on class ");
        ((StringBuilder)localObject).append(LayoutInflater.class.getName());
        ((StringBuilder)localObject).append("; inflation may have unexpected results.");
        Log.e("LayoutInflaterCompatHC", ((StringBuilder)localObject).toString(), localNoSuchFieldException);
      }
      b = true;
    }
    Object localObject = a;
    if (localObject != null) {
      try
      {
        ((Field)localObject).set(paramLayoutInflater, paramFactory2);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        paramFactory2 = new StringBuilder();
        paramFactory2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
        paramFactory2.append(paramLayoutInflater);
        paramFactory2.append("; inflation may have unexpected results.");
        Log.e("LayoutInflaterCompatHC", paramFactory2.toString(), localIllegalAccessException);
      }
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v4/view/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */