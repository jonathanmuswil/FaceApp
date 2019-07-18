package io.faceapp;

import KOa;
import WVa;
import android.content.Context;
import asa;
import bXa;
import cWa;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import icb;
import icb.a;
import java.util.Iterator;
import pXa;

final class a
  extends pXa
  implements bXa<cWa>
{
  a(Context paramContext)
  {
    super(0);
  }
  
  public final void b()
  {
    Object localObject1 = KOa.b.a(this.b);
    if (localObject1 != null)
    {
      asa.d.d((String)localObject1);
      asa.d.f("install_market", (String)localObject1);
    }
    Iterator localIterator = KOa.b.b().iterator();
    while (localIterator.hasNext())
    {
      Object localObject2 = (WVa)localIterator.next();
      localObject1 = (String)((WVa)localObject2).a();
      String str = (String)((WVa)localObject2).b();
      icb.a locala = icb.a("DeviceInfo");
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append('[');
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("]: ");
      ((StringBuilder)localObject2).append(str);
      locala.a(((StringBuilder)localObject2).toString(), new Object[0]);
    }
    localObject1 = e.a();
    asa.d.a("play_services_installed_version", ((f)localObject1).b(this.b));
    asa.d.a("play_services_required_version", e.e);
    localObject1 = b.a(b.a, ((e)localObject1).c(this.b));
    asa.d.f("play_services_availability", (String)localObject1);
    asa.d.h((String)localObject1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/io/faceapp/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */