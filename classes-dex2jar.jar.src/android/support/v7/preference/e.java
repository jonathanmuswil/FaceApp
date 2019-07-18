package android.support.v7.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class e
{
  public static SharedPreferences a(Context paramContext)
  {
    return paramContext.getSharedPreferences(b(paramContext), f());
  }
  
  private static String b(Context paramContext)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramContext.getPackageName());
    localStringBuilder.append("_preferences");
    return localStringBuilder.toString();
  }
  
  private static int f()
  {
    return 0;
  }
  
  SharedPreferences.Editor a()
  {
    throw null;
  }
  
  public void a(Preference paramPreference)
  {
    throw null;
  }
  
  public a b()
  {
    throw null;
  }
  
  public b c()
  {
    throw null;
  }
  
  public c d()
  {
    throw null;
  }
  
  public SharedPreferences e()
  {
    throw null;
  }
  
  public static abstract interface a {}
  
  public static abstract interface b {}
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/android/support/v7/preference/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */