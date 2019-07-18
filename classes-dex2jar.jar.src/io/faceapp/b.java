package io.faceapp;

import Hm;
import KOa;
import Uma;
import android.content.Context;
import asa;
import oXa;

public final class b
{
  public static final b a = new b();
  
  private final String a(int paramInt)
  {
    String str;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 9)
            {
              if (paramInt != 18) {
                str = "Unknown";
              } else {
                str = "SERVICE_UPDATING";
              }
            }
            else {
              str = "SERVICE_INVALID";
            }
          }
          else {
            str = "SERVICE_DISABLED";
          }
        }
        else {
          str = "SERVICE_VERSION_UPDATE_REQUIRED";
        }
      }
      else {
        str = "SERVICE_MISSING";
      }
    }
    else {
      str = "SUCCESS";
    }
    return str;
  }
  
  public final void a()
  {
    asa localasa = asa.d;
    Object localObject = Uma.qa.s().get();
    oXa.a(localObject, "AppPreferences.firstLaunchDate.get()");
    localasa.a("first_launch_date", ((Number)localObject).longValue());
    localasa = asa.d;
    localObject = Uma.qa.t().get();
    oXa.a(localObject, "AppPreferences.firstLaunchVersionName.get()");
    localasa.f("first_launch_ver_name", (String)localObject);
    localasa = asa.d;
    localObject = Uma.qa.u().get();
    oXa.a(localObject, "AppPreferences.lastAppUpdateInfo.get()");
    localasa.f("last app update info", (String)localObject);
    asa.d.f("device_locale", KOa.b.a());
  }
  
  public final void a(Context paramContext)
  {
    oXa.b(paramContext, "context");
    KOa.b.b(new a(paramContext));
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io/faceapp/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */